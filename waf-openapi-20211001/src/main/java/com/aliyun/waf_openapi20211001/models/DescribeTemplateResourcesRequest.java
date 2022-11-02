// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeTemplateResourcesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("TemplateId")
    public Long templateId;

    public static DescribeTemplateResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateResourcesRequest self = new DescribeTemplateResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateResourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTemplateResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeTemplateResourcesRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
