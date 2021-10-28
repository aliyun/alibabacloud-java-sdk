// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeleteStorageBundleRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StorageBundleId")
    public String storageBundleId;

    public static DeleteStorageBundleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStorageBundleRequest self = new DeleteStorageBundleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStorageBundleRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeleteStorageBundleRequest setStorageBundleId(String storageBundleId) {
        this.storageBundleId = storageBundleId;
        return this;
    }
    public String getStorageBundleId() {
        return this.storageBundleId;
    }

}
