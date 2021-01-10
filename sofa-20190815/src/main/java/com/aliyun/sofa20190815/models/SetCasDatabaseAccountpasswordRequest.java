// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetCasDatabaseAccountpasswordRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Password")
    public String password;

    public static SetCasDatabaseAccountpasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCasDatabaseAccountpasswordRequest self = new SetCasDatabaseAccountpasswordRequest();
        return TeaModel.build(map, self);
    }

    public SetCasDatabaseAccountpasswordRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SetCasDatabaseAccountpasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
