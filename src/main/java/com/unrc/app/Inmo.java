package com.unrc.app;

import com.unrc.app.controllers.*;
import com.unrc.app.models.*;
import com.unrc.app.db.DB;
import com.unrc.app.searchEngine.*;
import java.util.List;

import org.javalite.activejdbc.Base;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Inmo {

    public static void main(String[] args) {
        Base.open(DB.driver, DB.url, DB.user, DB.password);

    }
}
