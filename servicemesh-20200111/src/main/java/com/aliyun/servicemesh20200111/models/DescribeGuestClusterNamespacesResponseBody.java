// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeGuestClusterNamespacesResponseBody extends TeaModel {
    /**
     * <p>The labels of the namespaces. Labels are returned only when the `ShowNsLabels` parameter is set to `true`.</p>
     */
    @NameInMap("NsLabels")
    public java.util.Map<String, ?> nsLabels;

    /**
     * <p>The names of the namespaces.</p>
     */
    @NameInMap("NsList")
    public java.util.List<String> nsList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGuestClusterNamespacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGuestClusterNamespacesResponseBody self = new DescribeGuestClusterNamespacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGuestClusterNamespacesResponseBody setNsLabels(java.util.Map<String, ?> nsLabels) {
        this.nsLabels = nsLabels;
        return this;
    }
    public java.util.Map<String, ?> getNsLabels() {
        return this.nsLabels;
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
