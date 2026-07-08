// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCommonLogFieldsShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-l*****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to query for default log fields.</p>
     * <ul>
     * <li><p><strong>true</strong>: Queries for default log fields.</p>
     * </li>
     * <li><p><strong>false</strong>: Queries for non-default log fields.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDefault")
    public Boolean isDefault;

    /**
     * <p>Specifies whether to query for required log fields.</p>
     * <ul>
     * <li><p><strong>true</strong>: Queries for required log fields.</p>
     * </li>
     * <li><p><strong>false</strong>: Queries for non-required log fields.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsRequired")
    public Boolean isRequired;

    /**
     * <p>The list of log fields to query.</p>
     */
    @NameInMap("LogKeyList")
    public String logKeyListShrink;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
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
