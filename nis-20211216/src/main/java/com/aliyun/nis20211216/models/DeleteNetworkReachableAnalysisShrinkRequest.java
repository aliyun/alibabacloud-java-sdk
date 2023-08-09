// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DeleteNetworkReachableAnalysisShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of the tasks for analyzing network reachability.</p>
     */
    @NameInMap("NetworkReachableAnalysisIds")
    public String networkReachableAnalysisIdsShrink;

    /**
     * <p>The ID of the region for which you want to delete a task for analyzing network reachability.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteNetworkReachableAnalysisShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkReachableAnalysisShrinkRequest self = new DeleteNetworkReachableAnalysisShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkReachableAnalysisShrinkRequest setNetworkReachableAnalysisIdsShrink(String networkReachableAnalysisIdsShrink) {
        this.networkReachableAnalysisIdsShrink = networkReachableAnalysisIdsShrink;
        return this;
    }
    public String getNetworkReachableAnalysisIdsShrink() {
        return this.networkReachableAnalysisIdsShrink;
    }

    public DeleteNetworkReachableAnalysisShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
