// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeCensResponseBody extends TeaModel {
    /**
     * <p>The list of Kubernetes clusters that are added to the same ASM instance but are in different VPCs and are not connected by using a Cloud Enterprise Network (CEN) instance.</p>
     */
    @NameInMap("Clusters")
    public java.util.List<String> clusters;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCensResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCensResponseBody self = new DescribeCensResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCensResponseBody setClusters(java.util.List<String> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<String> getClusters() {
        return this.clusters;
    }

    public DescribeCensResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
