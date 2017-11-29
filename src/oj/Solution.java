package oj;

public class Solution {
	public String replaceSpace(StringBuffer str) {
        int olen=str.length();//字符串长度
        int slen=0;//定义空格
        int nlen=0;//定义新字符串长度
        for(int i=0;i<olen;i++){
            if (str.charAt(i)==' '){
                slen++;
            }
        }
            nlen=olen+2*slen;//新长度等于原长度加上2*空格长度
            str.setLength(nlen);
            int oindex=olen-1;
            int nindex=nlen-1;
            for(;oindex>=0&&oindex<nindex;--oindex){
                if (str.charAt(oindex)==' '){                                          
                str.setCharAt(nindex--, '0');
                str.setCharAt(nindex--, '2');
                str.setCharAt(nindex--, '%');
                         
                }
                else{
                    str.setCharAt(nindex--,str.charAt(oindex));
                }
            }
        return str.toString();
        }

}
