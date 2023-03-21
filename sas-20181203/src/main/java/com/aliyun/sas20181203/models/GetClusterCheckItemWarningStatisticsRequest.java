// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterCheckItemWarningStatisticsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static GetClusterCheckItemWarningStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterCheckItemWarningStatisticsRequest self = new GetClusterCheckItemWarningStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterCheckItemWarningStatisticsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
