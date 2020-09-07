// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupConfigurationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceName")
    @Validation(required = true)
    public String DBInstanceName;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeSecurityGroupConfigurationResponseItems items;

    public static DescribeSecurityGroupConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupConfigurationResponse self = new DescribeSecurityGroupConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupConfigurationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityGroupConfigurationResponse setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeSecurityGroupConfigurationResponse setItems(DescribeSecurityGroupConfigurationResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeSecurityGroupConfigurationResponseItems getItems() {
        return this.items;
    }

    public static class DescribeSecurityGroupConfigurationResponseItemsEcsSecurityGroupRelation extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public String securityGroupId;

        @NameInMap("NetworkType")
        @Validation(required = true)
        public String networkType;

        public static DescribeSecurityGroupConfigurationResponseItemsEcsSecurityGroupRelation build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupConfigurationResponseItemsEcsSecurityGroupRelation self = new DescribeSecurityGroupConfigurationResponseItemsEcsSecurityGroupRelation();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupConfigurationResponseItemsEcsSecurityGroupRelation setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSecurityGroupConfigurationResponseItemsEcsSecurityGroupRelation setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeSecurityGroupConfigurationResponseItemsEcsSecurityGroupRelation setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

    }

    public static class DescribeSecurityGroupConfigurationResponseItems extends TeaModel {
        @NameInMap("EcsSecurityGroupRelation")
        @Validation(required = true)
        public java.util.List<DescribeSecurityGroupConfigurationResponseItemsEcsSecurityGroupRelation> ecsSecurityGroupRelation;

        public static DescribeSecurityGroupConfigurationResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupConfigurationResponseItems self = new DescribeSecurityGroupConfigurationResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupConfigurationResponseItems setEcsSecurityGroupRelation(java.util.List<DescribeSecurityGroupConfigurationResponseItemsEcsSecurityGroupRelation> ecsSecurityGroupRelation) {
            this.ecsSecurityGroupRelation = ecsSecurityGroupRelation;
            return this;
        }
        public java.util.List<DescribeSecurityGroupConfigurationResponseItemsEcsSecurityGroupRelation> getEcsSecurityGroupRelation() {
            return this.ecsSecurityGroupRelation;
        }

    }

}
