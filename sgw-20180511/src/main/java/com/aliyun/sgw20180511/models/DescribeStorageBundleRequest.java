// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeStorageBundleRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StorageBundleId")
    public String storageBundleId;

    public static DescribeStorageBundleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageBundleRequest self = new DescribeStorageBundleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStorageBundleRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeStorageBundleRequest setStorageBundleId(String storageBundleId) {
        this.storageBundleId = storageBundleId;
        return this;
    }
    public String getStorageBundleId() {
        return this.storageBundleId;
    }

}
