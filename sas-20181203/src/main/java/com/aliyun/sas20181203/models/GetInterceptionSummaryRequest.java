// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetInterceptionSummaryRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>> You can call the [DescribeGroupedContainerInstances](https://help.aliyun.com/document_detail/421736.html) operation to query the IDs of clusters.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static GetInterceptionSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInterceptionSummaryRequest self = new GetInterceptionSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetInterceptionSummaryRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
