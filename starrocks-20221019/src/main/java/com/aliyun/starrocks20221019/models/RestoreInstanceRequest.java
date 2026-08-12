// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class RestoreInstanceRequest extends TeaModel {
    /**
     * <p>Cluster administrator password.</p>
     * 
     * <strong>example:</strong>
     * <p>password_example</p>
     */
    @NameInMap("AdminPassword")
    public String adminPassword;

    /**
     * <p>Enable auto-renewal. This parameter applies only when PayType is prePaid. Default: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>Backup job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>bk-adskj23hd9s</p>
     */
    @NameInMap("BackupTaskId")
    public String backupTaskId;

    /**
     * <p>Subscription duration. This parameter applies only when PayType is prePaid.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>Instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>c1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>Payment type:
     * prePaid for subscription
     * postPaid for pay-as-you-go</p>
     * 
     * <strong>example:</strong>
     * <p>prePaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>Billing cycle unit. This parameter applies only when PayType is prePaid.
     * Month for monthly billing
     * Year for yearly billing</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzllkih7jqxxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Tag struct.</p>
     */
    @NameInMap("Tags")
    public java.util.List<RestoreInstanceRequestTags> tags;

    /**
     * <p>VSwitch and zone information.</p>
     */
    @NameInMap("VSwitches")
    public java.util.List<RestoreInstanceRequestVSwitches> vSwitches;

    /**
     * <p>VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1fll2mci6d7pw8m****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static RestoreInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreInstanceRequest self = new RestoreInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RestoreInstanceRequest setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
        return this;
    }
    public String getAdminPassword() {
        return this.adminPassword;
    }

    public RestoreInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public RestoreInstanceRequest setBackupTaskId(String backupTaskId) {
        this.backupTaskId = backupTaskId;
        return this;
    }
    public String getBackupTaskId() {
        return this.backupTaskId;
    }

    public RestoreInstanceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public RestoreInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public RestoreInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public RestoreInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public RestoreInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RestoreInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public RestoreInstanceRequest setTags(java.util.List<RestoreInstanceRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<RestoreInstanceRequestTags> getTags() {
        return this.tags;
    }

    public RestoreInstanceRequest setVSwitches(java.util.List<RestoreInstanceRequestVSwitches> vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public java.util.List<RestoreInstanceRequestVSwitches> getVSwitches() {
        return this.vSwitches;
    }

    public RestoreInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class RestoreInstanceRequestTags extends TeaModel {
        /**
         * <p>Tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>dukang-chengdu-sgueg</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>Tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;reasons\&quot;: [], \&quot;patterns\&quot;: [], \&quot;aggregates\&quot;: [], \&quot;event_statistic\&quot;: {\&quot;statistic\&quot;: {}}}</p>
         */
        @NameInMap("value")
        public String value;

        public static RestoreInstanceRequestTags build(java.util.Map<String, ?> map) throws Exception {
            RestoreInstanceRequestTags self = new RestoreInstanceRequestTags();
            return TeaModel.build(map, self);
        }

        public RestoreInstanceRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RestoreInstanceRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class RestoreInstanceRequestVSwitches extends TeaModel {
        /**
         * <p>VSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp19mlh98tm9teyyd****</p>
         */
        @NameInMap("VswId")
        public String vswId;

        /**
         * <p>Zone ID of the VSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static RestoreInstanceRequestVSwitches build(java.util.Map<String, ?> map) throws Exception {
            RestoreInstanceRequestVSwitches self = new RestoreInstanceRequestVSwitches();
            return TeaModel.build(map, self);
        }

        public RestoreInstanceRequestVSwitches setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

        public RestoreInstanceRequestVSwitches setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
