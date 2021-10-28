// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CheckMnsServiceRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    public static CheckMnsServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckMnsServiceRequest self = new CheckMnsServiceRequest();
        return TeaModel.build(map, self);
    }

    public CheckMnsServiceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
