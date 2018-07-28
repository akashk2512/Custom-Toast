# Easy to use toast with custom design
# Demo
<a href="https://imgflip.com/gif/2etpb3"><img src="https://i.imgflip.com/2etpb3.gif" title="made at imgflip.com"/></a>> 

# Usage
> Step 1:
Add it in your root build.gradle(project) at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

> Step 2. Add the dependency (build.gradle (module app))

	dependencies {
	        implementation 'com.github.akashk2512:Custom-Toast:1.0.1'
	}

>  Step 3. Add this in Activity

	new CustomToast.Builder(this)
                .message("message")   /**  Pass message here **/
                .setBackgroundShape(R.drawable.memomshape) /** Optional:- design own shape in drawable  **/
                .setTextStyle(R.style.textStyleBold)  /** Optional:-  customize text style, text size, text color **/
                .setDrawableImage(R.drawable.yourIcon)   /** Optional:- pass icon from drawable**/
                .build();
