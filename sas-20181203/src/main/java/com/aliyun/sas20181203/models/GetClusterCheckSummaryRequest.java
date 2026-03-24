// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterCheckSummaryRequest extends TeaModel {
    /**
     * <p>ID of the queried cluster</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c3aaf6c8085f84791882eef200cd2****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static GetClusterCheckSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterCheckSummaryRequest self = new GetClusterCheckSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterCheckSummaryRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
