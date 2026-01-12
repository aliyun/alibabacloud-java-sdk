// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class RegisterUserRequest extends TeaModel {
    @NameInMap("SourceType")
    public String sourceType;

    public static RegisterUserRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterUserRequest self = new RegisterUserRequest();
        return TeaModel.build(map, self);
    }

    public RegisterUserRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
