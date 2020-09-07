// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupConfigurationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceName")
    @Validation(required = true)
    public String DBInstanceName;

    @NameInMap("Items")
    @Validation(required = true)
    public ModifySecurityGroupConfigurationResponseItems items;

    public static ModifySecurityGroupConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupConfigurationResponse self = new ModifySecurityGroupConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupConfigurationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySecurityGroupConfigurationResponse setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ModifySecurityGroupConfigurationResponse setItems(ModifySecurityGroupConfigurationResponseItems items) {
        this.items = items;
        return this;
    }
    public ModifySecurityGroupConfigurationResponseItems getItems() {
        return this.items;
    }

    public static class ModifySecurityGroupConfigurationResponseItemsEcsSecurityGroupRelation extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public String securityGroupId;

        @NameInMap("NetworkType")
        @Validation(required = true)
        public String networkType;

        public static ModifySecurityGroupConfigurationResponseItemsEcsSecurityGroupRelation build(java.util.Map<String, ?> map) throws Exception {
            ModifySecurityGroupConfigurationResponseItemsEcsSecurityGroupRelation self = new ModifySecurityGroupConfigurationResponseItemsEcsSecurityGroupRelation();
            return TeaModel.build(map, self);
        }

        public ModifySecurityGroupConfigurationResponseItemsEcsSecurityGroupRelation setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ModifySecurityGroupConfigurationResponseItemsEcsSecurityGroupRelation setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ModifySecurityGroupConfigurationResponseItemsEcsSecurityGroupRelation setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

    }

    public static class ModifySecurityGroupConfigurationResponseItems extends TeaModel {
        @NameInMap("EcsSecurityGroupRelation")
        @Validation(required = true)
        public java.util.List<ModifySecurityGroupConfigurationResponseItemsEcsSecurityGroupRelation> ecsSecurityGroupRelation;

        public static ModifySecurityGroupConfigurationResponseItems build(java.util.Map<String, ?> map) throws Exception {
            ModifySecurityGroupConfigurationResponseItems self = new ModifySecurityGroupConfigurationResponseItems();
            return TeaModel.build(map, self);
        }

        public ModifySecurityGroupConfigurationResponseItems setEcsSecurityGroupRelation(java.util.List<ModifySecurityGroupConfigurationResponseItemsEcsSecurityGroupRelation> ecsSecurityGroupRelation) {
            this.ecsSecurityGroupRelation = ecsSecurityGroupRelation;
            return this;
        }
        public java.util.List<ModifySecurityGroupConfigurationResponseItemsEcsSecurityGroupRelation> getEcsSecurityGroupRelation() {
            return this.ecsSecurityGroupRelation;
        }

    }

}
