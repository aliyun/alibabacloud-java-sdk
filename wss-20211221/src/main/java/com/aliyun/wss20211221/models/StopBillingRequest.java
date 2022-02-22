// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class StopBillingRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceType")
    public String resourceType;

    public static StopBillingRequest build(java.util.Map<String, ?> map) throws Exception {
        StopBillingRequest self = new StopBillingRequest();
        return TeaModel.build(map, self);
    }

    public StopBillingRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public StopBillingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StopBillingRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StopBillingRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
