// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AuthCasDatabaseAccountRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Privilege")
    public String privilege;

    @NameInMap("SchemaId")
    public String schemaId;

    public static AuthCasDatabaseAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthCasDatabaseAccountRequest self = new AuthCasDatabaseAccountRequest();
        return TeaModel.build(map, self);
    }

    public AuthCasDatabaseAccountRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AuthCasDatabaseAccountRequest setPrivilege(String privilege) {
        this.privilege = privilege;
        return this;
    }
    public String getPrivilege() {
        return this.privilege;
    }

    public AuthCasDatabaseAccountRequest setSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public String getSchemaId() {
        return this.schemaId;
    }

}
