import java.util.*;
class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> al=new ArrayList<>();
        if(s.length()%2!=0)
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
            {
                al.add(s.charAt(i));
            }
            else if(s.charAt(i)==')')
            {
                if(al.contains('('))
                {
                    int index=al.lastIndexOf('(');
                    if(index==al.size()-1)
                    {
                        al.remove(index);
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
            else if(s.charAt(i)==']')
            {
                if(al.contains('['))
                {
                    int index=al.lastIndexOf('[');
                    if(index==al.size()-1)
                    {
                        al.remove(index);
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
            else if(s.charAt(i)=='}')
            {
                if(al.contains('{'))
                {
                    int index=al.lastIndexOf('{');
                    if(index==al.size()-1)
                    {
                        al.remove(index);
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
        }
        if(al.isEmpty())
        {
            return true;
        }
        return false;
    }
}