// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class GetServiceLinkedRoleTemplateRequest extends TeaModel {
    @NameInMap("ServiceName")
    public String serviceName;

    public static GetServiceLinkedRoleTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceLinkedRoleTemplateRequest self = new GetServiceLinkedRoleTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceLinkedRoleTemplateRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
