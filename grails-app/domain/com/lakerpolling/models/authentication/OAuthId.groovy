package com.lakerpolling.models.authentication

class OAuthId  {

    String subject

    static belongsTo = [user : User]

    static mapping = {
        subject unique: true
        autoTimestamp false
        version false
    }


}