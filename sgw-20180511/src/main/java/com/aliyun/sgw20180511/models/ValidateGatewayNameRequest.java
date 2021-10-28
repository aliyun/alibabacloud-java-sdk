// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ValidateGatewayNameRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("StorageBundleId")
    public String storageBundleId;

    public static ValidateGatewayNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateGatewayNameRequest self = new ValidateGatewayNameRequest();
        return TeaModel.build(map, self);
    }

    public ValidateGatewayNameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ValidateGatewayNameRequest setStorageBundleId(String storageBundleId) {
        this.storageBundleId = storageBundleId;
        return this;
    }
    public String getStorageBundleId() {
        return this.storageBundleId;
    }

}
