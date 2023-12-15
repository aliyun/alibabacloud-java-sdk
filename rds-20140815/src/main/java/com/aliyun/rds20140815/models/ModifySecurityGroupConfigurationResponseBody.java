// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupConfigurationResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>An array that consists of information about the ECS security group.</p>
     */
    @NameInMap("Items")
    public ModifySecurityGroupConfigurationResponseBodyItems items;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySecurityGroupConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupConfigurationResponseBody self = new ModifySecurityGroupConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupConfigurationResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ModifySecurityGroupConfigurationResponseBody setItems(ModifySecurityGroupConfigurationResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public ModifySecurityGroupConfigurationResponseBodyItems getItems() {
        return this.items;
    }

    public ModifySecurityGroupConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifySecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation extends TeaModel {
        /**
         * <p>The network type of the ECS security group. Valid values:</p>
         * <br>
         * <p>*   **Classic**</p>
         * <p>*   **VPC**</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the ECS security group.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        public static ModifySecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation build(java.util.Map<String, ?> map) throws Exception {
            ModifySecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation self = new ModifySecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation();
            return TeaModel.build(map, self);
        }

        public ModifySecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public ModifySecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ModifySecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class ModifySecurityGroupConfigurationResponseBodyItems extends TeaModel {
        @NameInMap("EcsSecurityGroupRelation")
        public java.util.List<ModifySecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation> ecsSecurityGroupRelation;

        public static ModifySecurityGroupConfigurationResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ModifySecurityGroupConfigurationResponseBodyItems self = new ModifySecurityGroupConfigurationResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ModifySecurityGroupConfigurationResponseBodyItems setEcsSecurityGroupRelation(java.util.List<ModifySecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation> ecsSecurityGroupRelation) {
            this.ecsSecurityGroupRelation = ecsSecurityGroupRelation;
            return this;
        }
        public java.util.List<ModifySecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation> getEcsSecurityGroupRelation() {
            return this.ecsSecurityGroupRelation;
        }

    }

}
