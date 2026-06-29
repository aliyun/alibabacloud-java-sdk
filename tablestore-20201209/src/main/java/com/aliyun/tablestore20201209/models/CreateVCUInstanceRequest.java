// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class CreateVCUInstanceRequest extends TeaModel {
    /**
     * <p>The alias of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The auto-renewal cycle. This parameter is required if auto-renewal is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewPeriodInMonth")
    public Long autoRenewPeriodInMonth;

    /**
     * <p>The cluster type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SSD vs HYBRID</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>Specifies whether to perform a dry run. If you perform a dry run, no instance is created.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to enable auto-renewal.</p>
     */
    @NameInMap("EnableAutoRenew")
    public Boolean enableAutoRenew;

    /**
     * <p>Specifies whether to enable instance elasticity. If you enable instance elasticity, the peak VCU usage can exceed the purchased VCU amount, but additional fees are incurred.</p>
     */
    @NameInMap("EnableElasticVCU")
    public Boolean enableElasticVCU;

    /**
     * <p>The description of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>testvcu</p>
     */
    @NameInMap("InstanceDescription")
    public String instanceDescription;

    /**
     * <p>The subscription duration. Unit: month.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PeriodInMonth")
    public Long periodInMonth;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxh4em5jnbcd</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateVCUInstanceRequestTags> tags;

    /**
     * <p>The instance type: the number of VCUs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VCU")
    public Long VCU;

    public static CreateVCUInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVCUInstanceRequest self = new CreateVCUInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateVCUInstanceRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public CreateVCUInstanceRequest setAutoRenewPeriodInMonth(Long autoRenewPeriodInMonth) {
        this.autoRenewPeriodInMonth = autoRenewPeriodInMonth;
        return this;
    }
    public Long getAutoRenewPeriodInMonth() {
        return this.autoRenewPeriodInMonth;
    }

    public CreateVCUInstanceRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public CreateVCUInstanceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateVCUInstanceRequest setEnableAutoRenew(Boolean enableAutoRenew) {
        this.enableAutoRenew = enableAutoRenew;
        return this;
    }
    public Boolean getEnableAutoRenew() {
        return this.enableAutoRenew;
    }

    public CreateVCUInstanceRequest setEnableElasticVCU(Boolean enableElasticVCU) {
        this.enableElasticVCU = enableElasticVCU;
        return this;
    }
    public Boolean getEnableElasticVCU() {
        return this.enableElasticVCU;
    }

    public CreateVCUInstanceRequest setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    public CreateVCUInstanceRequest setPeriodInMonth(Long periodInMonth) {
        this.periodInMonth = periodInMonth;
        return this;
    }
    public Long getPeriodInMonth() {
        return this.periodInMonth;
    }

    public CreateVCUInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateVCUInstanceRequest setTags(java.util.List<CreateVCUInstanceRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateVCUInstanceRequestTags> getTags() {
        return this.tags;
    }

    public CreateVCUInstanceRequest setVCU(Long VCU) {
        this.VCU = VCU;
        return this;
    }
    public Long getVCU() {
        return this.VCU;
    }

    public static class CreateVCUInstanceRequestTags extends TeaModel {
        /**
         * <p>The key of the tag. The key can be up to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>created</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. The value can be up to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0woauavextilfqr61</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateVCUInstanceRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateVCUInstanceRequestTags self = new CreateVCUInstanceRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateVCUInstanceRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVCUInstanceRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
