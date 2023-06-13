// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class RebootInstancesRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ForceReboot")
    public Boolean forceReboot;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("RegionId")
    public String regionId;

    public static RebootInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootInstancesRequest self = new RebootInstancesRequest();
        return TeaModel.build(map, self);
    }

    public RebootInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RebootInstancesRequest setForceReboot(Boolean forceReboot) {
        this.forceReboot = forceReboot;
        return this;
    }
    public Boolean getForceReboot() {
        return this.forceReboot;
    }

    public RebootInstancesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public RebootInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
