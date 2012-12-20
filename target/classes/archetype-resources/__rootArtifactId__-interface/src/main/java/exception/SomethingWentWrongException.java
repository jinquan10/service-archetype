#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.exception;

public class SomethingWentWrongException extends BaseException{
	private static final long serialVersionUID = 1L;

	public SomethingWentWrongException(){
		setId("SOMETHING_WENT_WRONG_EXCEPTION");
		setDescription("Sorry, something didn't go right.  We are on it!");
		setStatusCode(500);
	}
}
