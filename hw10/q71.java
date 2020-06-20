package hw10;
class OpenDoorException extends Exception {}
class CableSnapException extends Exception {}
public class q71 {
		public void openDrawBridge() throws Exception{
			try {
				throw new Exception ("Problem");
			} catch (OpenDoorException e) {
				throw new OpenDoorException();
			} catch (CableSnapException ex) {
				try {
					throw new OpenDoorException();
				}catch (Exception ex) {
					
				}finally {
					System.out.println("Almost done");
				}
			}finally {
				throw new RuntimeException("Unending problem");
			}
		}
	public static void main(String[] args) throws IllegalArgumentException{
		// TODO Auto-generated method stub
		new q71().openDrawBridge();

		}
	}

}
