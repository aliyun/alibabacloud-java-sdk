// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetServiceLinkedRoleTemplateRequest extends TeaModel {
    /**
     * <p>The cloud service name.</p>
     * <p>For more information, see the <strong>Cloud service identity</strong> column in <a href="https://help.aliyun.com/document_detail/461722.html">Cloud services that support service-linked roles</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>polardb.aliyuncs.com</p>
     */
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
