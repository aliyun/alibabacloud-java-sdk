// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetRegisteredServicesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Services")
    @Validation(required = true)
    public java.util.List<String> services;

    public static GetRegisteredServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRegisteredServicesResponse self = new GetRegisteredServicesResponse();
        return TeaModel.build(map, self);
    }

}
