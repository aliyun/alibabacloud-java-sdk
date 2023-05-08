// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeGuestClusterPodsResponseBody extends TeaModel {
    /**
     * <p>The names of the queried pods.</p>
     */
    @NameInMap("PodList")
    public java.util.List<String> podList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGuestClusterPodsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGuestClusterPodsResponseBody self = new DescribeGuestClusterPodsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGuestClusterPodsResponseBody setPodList(java.util.List<String> podList) {
        this.podList = podList;
        return this;
    }
    public java.util.List<String> getPodList() {
        return this.podList;
    }

    public DescribeGuestClusterPodsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
