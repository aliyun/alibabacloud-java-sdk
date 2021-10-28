// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeleteExpressSyncRequest extends TeaModel {
    @NameInMap("ExpressSyncId")
    public String expressSyncId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteExpressSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpressSyncRequest self = new DeleteExpressSyncRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExpressSyncRequest setExpressSyncId(String expressSyncId) {
        this.expressSyncId = expressSyncId;
        return this;
    }
    public String getExpressSyncId() {
        return this.expressSyncId;
    }

    public DeleteExpressSyncRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
