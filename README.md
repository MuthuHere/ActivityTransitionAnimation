# ActivityTransitionAnimation
Android animation with Views simply native code

### Add style for activate window content transition(inside your AppTheme)
           <item name="android:windowActivityTransitions">true</item>
           
In your content_main Just add `transitionName` in all your respected views,
you can give any name to those.

In your next activity for the same view you have to give the same `transitionName`.

### Adding `ActivityOptions`
  Add ActivityOptions when your'e calling intent to next coming activity.
  
           val intentSecondActivity = Intent(this, SecondActivity::class.java)
           val options = ActivityOptions.makeSceneTransitionAnimation(
                this,
                Pair.create(tvTitle, "transName"),
                Pair.create(tvDes, "transDesc"),
                Pair.create(ivUser, "transImage")
            )
            startActivity(intentSecondActivity, options.toBundle())
            
Feel free to clone and test! Anything contact me! Do my best to get you out from your rid:) Happie coding!            
