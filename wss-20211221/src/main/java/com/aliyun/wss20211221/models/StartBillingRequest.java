// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class StartBillingRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Module")
    public java.util.List<StartBillingRequestModule> module;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceType")
    public String resourceType;

    public static StartBillingRequest build(java.util.Map<String, ?> map) throws Exception {
        StartBillingRequest self = new StartBillingRequest();
        return TeaModel.build(map, self);
    }

    public StartBillingRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public StartBillingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartBillingRequest setModule(java.util.List<StartBillingRequestModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<StartBillingRequestModule> getModule() {
        return this.module;
    }

    public StartBillingRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartBillingRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public static class StartBillingRequestModule extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static StartBillingRequestModule build(java.util.Map<String, ?> map) throws Exception {
            StartBillingRequestModule self = new StartBillingRequestModule();
            return TeaModel.build(map, self);
        }

        public StartBillingRequestModule setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public StartBillingRequestModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
