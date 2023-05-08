// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetRegisteredServiceNamespacesResponseBody extends TeaModel {
    /**
     * <p>The names of the queried namespaces.</p>
     */
    @NameInMap("Namespaces")
    public java.util.List<String> namespaces;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRegisteredServiceNamespacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRegisteredServiceNamespacesResponseBody self = new GetRegisteredServiceNamespacesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRegisteredServiceNamespacesResponseBody setNamespaces(java.util.List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<String> getNamespaces() {
        return this.namespaces;
    }

    public GetRegisteredServiceNamespacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
