package com.example.addrestactivity;

import com.google.firebase.storage.FirebaseStorage;

public class FirebaseServices {
    private FirebaseStorage store;

    public FirebaseServices(){
        store = FirebaseStorage.getInstance();
    }

    public FirebaseStorage getStore() {
        return store;
    }
}
