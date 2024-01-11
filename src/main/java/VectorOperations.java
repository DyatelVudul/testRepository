public class VectorOperations {
    static float scalarMultiplication(float[] vec1, float[] vec2) throws IllegalArgumentException{
        if(vec1.length != vec2.length){
            throw new IllegalArgumentException("Size of vectors is not equal");
        }
        

        float res = 0.0F;

        for(int i = 0; i < vec1.length; i++)
            res += vec1[i] * vec2[i];

        return res;
    }

    static float[] multiplyWithAScalar(float [] vec, float scalar) throws IllegalArgumentException{
        if(vec == null)
            throw new IllegalArgumentException("Vector is null");

        return null; 
    }
    static int meaningOfLife(){
        return 42;
    }
}
