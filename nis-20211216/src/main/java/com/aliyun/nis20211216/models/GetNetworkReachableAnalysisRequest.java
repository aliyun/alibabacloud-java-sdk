// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetNetworkReachableAnalysisRequest extends TeaModel {
    /**
     * <p>The ID of the task for analyzing network reachability. You can call the <strong>CreateNetworkRearchableAnalysis</strong> operation to obtain the ID of the task for analyzing network reachability.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nra-90eef36a9e6e4662****</p>
     */
    @NameInMap("NetworkReachableAnalysisId")
    public String networkReachableAnalysisId;

    /**
     * <p>The ID of the region for which you want to obtain the result of network reachability analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetNetworkReachableAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkReachableAnalysisRequest self = new GetNetworkReachableAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public GetNetworkReachableAnalysisRequest setNetworkReachableAnalysisId(String networkReachableAnalysisId) {
        this.networkReachableAnalysisId = networkReachableAnalysisId;
        return this;
    }
    public String getNetworkReachableAnalysisId() {
        return this.networkReachableAnalysisId;
    }

    public GetNetworkReachableAnalysisRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
