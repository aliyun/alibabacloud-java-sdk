// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCommonLogFieldsRequest extends TeaModel {
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
    public java.util.List<String> logKeyList;

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

    public static DescribeCommonLogFieldsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonLogFieldsRequest self = new DescribeCommonLogFieldsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCommonLogFieldsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCommonLogFieldsRequest setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public DescribeCommonLogFieldsRequest setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }
    public Boolean getIsRequired() {
        return this.isRequired;
    }

    public DescribeCommonLogFieldsRequest setLogKeyList(java.util.List<String> logKeyList) {
        this.logKeyList = logKeyList;
        return this;
    }
    public java.util.List<String> getLogKeyList() {
        return this.logKeyList;
    }

    public DescribeCommonLogFieldsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCommonLogFieldsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
