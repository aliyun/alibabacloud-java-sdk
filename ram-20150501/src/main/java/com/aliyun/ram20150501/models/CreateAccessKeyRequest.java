// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreateAccessKeyRequest extends TeaModel {
    @NameInMap("UserName")
    public String userName;

    public static CreateAccessKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessKeyRequest self = new CreateAccessKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccessKeyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
