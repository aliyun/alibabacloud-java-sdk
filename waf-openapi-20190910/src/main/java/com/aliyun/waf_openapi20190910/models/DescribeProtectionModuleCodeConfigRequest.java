// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeProtectionModuleCodeConfigRequest extends TeaModel {
    @NameInMap("CodeType")
    public Integer codeType;

    @NameInMap("CodeValue")
    public Integer codeValue;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeProtectionModuleCodeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProtectionModuleCodeConfigRequest self = new DescribeProtectionModuleCodeConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProtectionModuleCodeConfigRequest setCodeType(Integer codeType) {
        this.codeType = codeType;
        return this;
    }
    public Integer getCodeType() {
        return this.codeType;
    }

    public DescribeProtectionModuleCodeConfigRequest setCodeValue(Integer codeValue) {
        this.codeValue = codeValue;
        return this;
    }
    public Integer getCodeValue() {
        return this.codeValue;
    }

    public DescribeProtectionModuleCodeConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeProtectionModuleCodeConfigRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
