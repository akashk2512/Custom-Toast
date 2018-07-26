# Custom-Toast
Easy to use toast with custom design

Step 1:
Add it in your root build.gradle(project) at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  Step 2. Add the dependency (build.gradle (module app))

	dependencies {
	        implementation 'com.github.akashk2512:Custom-Toast:1.0.0'
	}
  
  Step 3. Add this in Activity

	new CustomToast.Builder(this)
                .message("message")   /**  Pass message here **/
                .setBackgroundShape(R.drawable.memomshape) /** Optional:- design own shape in drawable  **/
                .setTextStyle(R.style.textStyleBold)  /** Optional:-  customize text style, text size, text color **/
                .setDrawableImage(R.drawable.yourIcon)   /** Optional:- pass icon from drawable**/
                .build();
	       
 
  
  
  
