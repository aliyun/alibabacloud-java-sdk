// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetRegisteredServiceNamespacesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Namespaces")
    @Validation(required = true)
    public java.util.List<String> namespaces;

    public static GetRegisteredServiceNamespacesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRegisteredServiceNamespacesResponse self = new GetRegisteredServiceNamespacesResponse();
        return TeaModel.build(map, self);
    }

}
