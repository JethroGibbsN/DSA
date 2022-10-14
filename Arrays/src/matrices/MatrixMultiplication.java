package matrices;

import java.util.ArrayList;

public class MatrixMultiplication {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B)
    {
        int r=A.size();
        int c= B.get(0).size();

        ArrayList<ArrayList<Integer>> pro =new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<r;i++)
        {
            ArrayList<Integer> row =new ArrayList<Integer>();
            pro.add(row);
            for(int j=0;j<c;j++)
            {
                int sum=0;
                for(int k=0;k<B.size();k++)
                {
                    sum+=A.get(i).get(k)*B.get(k).get(j);
                }
                pro.get(i).add(sum);
            }
        }
        return pro;
    }
}
