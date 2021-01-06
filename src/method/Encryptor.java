package method;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * Encryptor password
 * @author Nicolas
 *
 */
public class Encryptor {

	/**
	 * MD2 hash
	 */
	public static final String MD2 = "MD2";
	
	/**
	 * MD5 hash
	 */
	public static final String MD5 = "MD5";
	
	/**
	 * SHA1 hash
	 */
	public static final String SHA1 = "SHA-1";
	
	/**
	 * SHA-256 hash
	 */
	public static final String SHA256 = "SHA-256";
	
	/**
	 * SHA-512 hash
	 */
	public static final String SHA512 = "SHA-512";
	
	/**
	 * Private constructor
	 */
	private Encryptor() {}
	
	/**
	 * Encode the password with the algorithm
	 * @param password
	 * @param algorithm
	 * @return
	 */
	public static String encode(String password, String algorithm) {
		try {
            // Create MessageDigest instance for specific algorithm
            MessageDigest md = MessageDigest.getInstance(algorithm);
            //Add password bytes to digest
            md.update(password.getBytes());
            //Get the hash's bytes
            byte[] bytes = md.digest();
            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
            	sb.append(String.format("%02x", bytes[i]));
            }
            //Get complete hashed password in hex format
            return sb.toString();
        }
        catch (NoSuchAlgorithmException e) {
            return null;
        }
    }
	
	/**
	 * Encode the password with the algorithm and salt
	 * @param password
	 * @param algorithm
	 * @param salt
	 * @return
	 */
	public static String encode(String password, String algorithm, String salt) {
		if(salt == null) {
			salt = generateSalt();
		}
		return encode(password + salt, algorithm);
	}
	
	/**
	 * Generate a salt
	 * @return
	 */
	public static String generateSalt() {
		//Always use a SecureRandom generator
	    SecureRandom sr = new SecureRandom();
	    //Create array for salt
	    byte[] salt = new byte[16];
	    //Get a random salt
	    sr.nextBytes(salt);
	    //return salt
	    return new String(salt);
	}

}
