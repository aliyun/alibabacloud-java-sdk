// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCommonLogFieldsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-l*****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDefault")
    public Boolean isDefault;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsRequired")
    public Boolean isRequired;

    @NameInMap("LogKeyList")
    public String logKeyListShrink;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-aek2sxgs*****</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static DescribeCommonLogFieldsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonLogFieldsShrinkRequest self = new DescribeCommonLogFieldsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCommonLogFieldsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCommonLogFieldsShrinkRequest setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public DescribeCommonLogFieldsShrinkRequest setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }
    public Boolean getIsRequired() {
        return this.isRequired;
    }

    public DescribeCommonLogFieldsShrinkRequest setLogKeyListShrink(String logKeyListShrink) {
        this.logKeyListShrink = logKeyListShrink;
        return this;
    }
    public String getLogKeyListShrink() {
        return this.logKeyListShrink;
    }

    public DescribeCommonLogFieldsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCommonLogFieldsShrinkRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
