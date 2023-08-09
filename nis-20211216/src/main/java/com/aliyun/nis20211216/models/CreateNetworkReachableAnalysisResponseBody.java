// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class CreateNetworkReachableAnalysisResponseBody extends TeaModel {
    /**
     * <p>The ID of the task for analyzing network reachability.</p>
     */
    @NameInMap("NetworkReachableAnalysisId")
    public String networkReachableAnalysisId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNetworkReachableAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkReachableAnalysisResponseBody self = new CreateNetworkReachableAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNetworkReachableAnalysisResponseBody setNetworkReachableAnalysisId(String networkReachableAnalysisId) {
        this.networkReachableAnalysisId = networkReachableAnalysisId;
        return this;
    }
    public String getNetworkReachableAnalysisId() {
        return this.networkReachableAnalysisId;
    }

    public CreateNetworkReachableAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
