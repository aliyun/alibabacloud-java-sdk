// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseTemplateRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TemplateId")
    public Long templateId;

    public static DescribeDefenseTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseTemplateRequest self = new DescribeDefenseTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDefenseTemplateRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
