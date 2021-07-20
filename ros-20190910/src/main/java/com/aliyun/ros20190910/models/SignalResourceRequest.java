// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SignalResourceRequest extends TeaModel {
    @NameInMap("StackId")
    public String stackId;

    @NameInMap("Status")
    public String status;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UniqueId")
    public String uniqueId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("LogicalResourceId")
    public String logicalResourceId;

    public static SignalResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        SignalResourceRequest self = new SignalResourceRequest();
        return TeaModel.build(map, self);
    }

    public SignalResourceRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public SignalResourceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SignalResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SignalResourceRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public SignalResourceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SignalResourceRequest setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
        return this;
    }
    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

}
