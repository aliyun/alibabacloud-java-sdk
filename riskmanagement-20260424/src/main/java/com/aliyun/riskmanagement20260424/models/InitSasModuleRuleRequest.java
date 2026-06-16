// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class InitSasModuleRuleRequest extends TeaModel {
    @NameInMap("AutoBind")
    public Integer autoBind;

    @NameInMap("Instances")
    public java.util.List<InitSasModuleRuleRequestInstances> instances;

    @NameInMap("IsTrial")
    public Boolean isTrial;

    @NameInMap("RegionId")
    public String regionId;

    public static InitSasModuleRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        InitSasModuleRuleRequest self = new InitSasModuleRuleRequest();
        return TeaModel.build(map, self);
    }

    public InitSasModuleRuleRequest setAutoBind(Integer autoBind) {
        this.autoBind = autoBind;
        return this;
    }
    public Integer getAutoBind() {
        return this.autoBind;
    }

    public InitSasModuleRuleRequest setInstances(java.util.List<InitSasModuleRuleRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<InitSasModuleRuleRequestInstances> getInstances() {
        return this.instances;
    }

    public InitSasModuleRuleRequest setIsTrial(Boolean isTrial) {
        this.isTrial = isTrial;
        return this;
    }
    public Boolean getIsTrial() {
        return this.isTrial;
    }

    public InitSasModuleRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class InitSasModuleRuleRequestInstances extends TeaModel {
        @NameInMap("Cores")
        public String cores;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Uuid")
        public String uuid;

        public static InitSasModuleRuleRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            InitSasModuleRuleRequestInstances self = new InitSasModuleRuleRequestInstances();
            return TeaModel.build(map, self);
        }

        public InitSasModuleRuleRequestInstances setCores(String cores) {
            this.cores = cores;
            return this;
        }
        public String getCores() {
            return this.cores;
        }

        public InitSasModuleRuleRequestInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public InitSasModuleRuleRequestInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public InitSasModuleRuleRequestInstances setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
