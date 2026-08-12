// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class InitSasModuleRuleRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic binding. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Disabled.</li>
     * <li><strong>1</strong>: Enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AutoBind")
    public Integer autoBind;

    /**
     * <p>The list of instances.</p>
     */
    @NameInMap("Instances")
    public java.util.List<InitSasModuleRuleRequestInstances> instances;

    /**
     * <p>Specifies whether to use the trial version.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsTrial")
    public Boolean isTrial;

    /**
     * <p>The region ID of the access control instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-guangzhou</p>
     */
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
        /**
         * <p>The number of CPU cores of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cores")
        public String cores;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-gw85zjrhsg2sgex7ovfx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region of the cloud phone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The UUID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>168d374e-f449-4d0b-9556-14f233fa7171</p>
         */
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
