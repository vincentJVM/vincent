###############################################################################
#
#  This file contains the czech messages.
#  
#  NOTICE:  When defining a new message it has to be created in message files for each language.
#  
#
#
#  
#  DEFINING A MESSAGE
#  ==================
#  
#  A message has a uinique CHARACTER ID. It is placed on the left hand side of the equation.
#  For each message there are additional switches:
#    - iconType (see below)
#    - buttonType (see below)
#    - messageText may contain placeholders for parameters.
  
#  A placeholder pattern is a "&&&" . See Examplemessage "No_Records_found".
#  
#  A messsage definition is placed within a single row, its switches are seperated by a colon ":". 
#
#  Format:
#  =======
#  <MESSAGE_ID>=<iconType>:<buttonType>:<message text>
#
#
#  Allowed values for:
#  ===================
#    iconType:
#        INFO
#        WARNING
#        ERROR
#        QUESTION
#
#    buttonType:
#        STYLE_Y      ("yes" Button)
#        STYLE_Y_N    ("yes" and "no" Buttons) 
#        STYLE_Y_N_C  ("yes", "no" and "cancel" Buttons)  
#
#
#  Example with a parameter array:
#  ================================
#    Message definition:
#      No_Records_found=WARNING:STYLE_Y:The Table &&& has no records. Expected at least &&&. Continue?
#    Aufruf: 
#      answer = UserMessage.show("No_Records_found", new String[] {"Employee", "" + minNumber}, aShowFrame);
#      if (answer == UserMessage.NO)
#        return;   
#
#  Example with an Exception:
#  =============================
#    Message definition:
#      UNEXPECTED_EXCEPTION=ERROR:STYLE_Y:Wow! An exception!
#
#    Aufruf:
#      try {
#        String str = null;
#        int index = str.indexOf("abc"); 
#      } catch (Exception ex) {
#        UserMessage.show("UNEXPECTED_EXCEPTION", ex);  
#      } 
#
#
#
#
#################################################################################################


# Titles
Info=Informace
Warning=Varování
Question=Dotaz
Error=Chyba

# Messages
TRANSLATION_SOURCE_NOT_FOUND=WARNING:STYLE_Y:Soubor &&& s překladem nebyl nalezen.
UNKNOWN_EXCEPTION=ERROR:STYLE_Y:Neznámá chyba.
UNHANDLED_EXCEPTION=ERROR:STYLE_Y:Vnitřní chyba.

