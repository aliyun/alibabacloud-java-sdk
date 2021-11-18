// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListNamespacesResponseBody extends TeaModel {
    // 命名空间列表
    @NameInMap("Namespaces")
    public java.util.List<ImageNamespace> namespaces;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListNamespacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNamespacesResponseBody self = new ListNamespacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNamespacesResponseBody setNamespaces(java.util.List<ImageNamespace> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<ImageNamespace> getNamespaces() {
        return this.namespaces;
    }

    public ListNamespacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
