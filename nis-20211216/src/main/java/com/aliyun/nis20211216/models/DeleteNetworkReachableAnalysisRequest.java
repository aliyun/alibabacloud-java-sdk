// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DeleteNetworkReachableAnalysisRequest extends TeaModel {
    /**
     * <p>The IDs of the tasks for analyzing network reachability.</p>
     */
    @NameInMap("NetworkReachableAnalysisIds")
    public java.util.List<String> networkReachableAnalysisIds;

    /**
     * <p>The ID of the region for which you want to delete a task for analyzing network reachability.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteNetworkReachableAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkReachableAnalysisRequest self = new DeleteNetworkReachableAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkReachableAnalysisRequest setNetworkReachableAnalysisIds(java.util.List<String> networkReachableAnalysisIds) {
        this.networkReachableAnalysisIds = networkReachableAnalysisIds;
        return this;
    }
    public java.util.List<String> getNetworkReachableAnalysisIds() {
        return this.networkReachableAnalysisIds;
    }

    public DeleteNetworkReachableAnalysisRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
