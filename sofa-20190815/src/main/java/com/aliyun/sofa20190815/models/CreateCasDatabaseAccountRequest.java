// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasDatabaseAccountRequest extends TeaModel {
    @NameInMap("DatabaseSequence")
    public String databaseSequence;

    @NameInMap("Name")
    public String name;

    @NameInMap("Password")
    public String password;

    public static CreateCasDatabaseAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCasDatabaseAccountRequest self = new CreateCasDatabaseAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateCasDatabaseAccountRequest setDatabaseSequence(String databaseSequence) {
        this.databaseSequence = databaseSequence;
        return this;
    }
    public String getDatabaseSequence() {
        return this.databaseSequence;
    }

    public CreateCasDatabaseAccountRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCasDatabaseAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
