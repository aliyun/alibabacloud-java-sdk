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

    }

    public static class ModifySecurityGroupConfigurationResponseItems extends TeaModel {
        @NameInMap("EcsSecurityGroupRelation")
        @Validation(required = true)
        public java.util.List<ModifySecurityGroupConfigurationResponseItemsEcsSecurityGroupRelation> ecsSecurityGroupRelation;

        public static ModifySecurityGroupConfigurationResponseItems build(java.util.Map<String, ?> map) throws Exception {
            ModifySecurityGroupConfigurationResponseItems self = new ModifySecurityGroupConfigurationResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
