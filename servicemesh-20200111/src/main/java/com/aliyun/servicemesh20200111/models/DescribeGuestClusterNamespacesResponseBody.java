// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeGuestClusterNamespacesResponseBody extends TeaModel {
    @NameInMap("NsList")
    public java.util.List<String> nsList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGuestClusterNamespacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGuestClusterNamespacesResponseBody self = new DescribeGuestClusterNamespacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGuestClusterNamespacesResponseBody setNsList(java.util.List<String> nsList) {
        this.nsList = nsList;
        return this;
    }
    public java.util.List<String> getNsList() {
        return this.nsList;
    }

    public DescribeGuestClusterNamespacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
