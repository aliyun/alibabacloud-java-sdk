// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CheckSLRRequest extends TeaModel {
    @NameInMap("ServiceName")
    public String serviceName;

    public static CheckSLRRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSLRRequest self = new CheckSLRRequest();
        return TeaModel.build(map, self);
    }

    public CheckSLRRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
