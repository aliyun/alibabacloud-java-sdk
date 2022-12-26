// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterSuspEventStatisticsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("From")
    public String from;

    public static GetClusterSuspEventStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterSuspEventStatisticsRequest self = new GetClusterSuspEventStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterSuspEventStatisticsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetClusterSuspEventStatisticsRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

}
