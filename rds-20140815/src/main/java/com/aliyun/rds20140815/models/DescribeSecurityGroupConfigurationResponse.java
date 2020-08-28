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

    }

    public static class DescribeSecurityGroupConfigurationResponseItems extends TeaModel {
        @NameInMap("EcsSecurityGroupRelation")
        @Validation(required = true)
        public java.util.List<DescribeSecurityGroupConfigurationResponseItemsEcsSecurityGroupRelation> ecsSecurityGroupRelation;

        public static DescribeSecurityGroupConfigurationResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupConfigurationResponseItems self = new DescribeSecurityGroupConfigurationResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
