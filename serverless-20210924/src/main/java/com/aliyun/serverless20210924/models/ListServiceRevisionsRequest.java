// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class ListServiceRevisionsRequest extends TeaModel {
    // The name of a service.
    @NameInMap("serviceName")
    public String serviceName;

    public static ListServiceRevisionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceRevisionsRequest self = new ListServiceRevisionsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceRevisionsRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
