// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetTicketTemplateSchemaRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TemplateId")
    public Long templateId;

    public static GetTicketTemplateSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTicketTemplateSchemaRequest self = new GetTicketTemplateSchemaRequest();
        return TeaModel.build(map, self);
    }

    public GetTicketTemplateSchemaRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetTicketTemplateSchemaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetTicketTemplateSchemaRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
