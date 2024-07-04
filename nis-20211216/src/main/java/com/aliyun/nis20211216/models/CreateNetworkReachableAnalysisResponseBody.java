// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class CreateNetworkReachableAnalysisResponseBody extends TeaModel {
    /**
     * <p>The ID of the task for analyzing network reachability.</p>
     * 
     * <strong>example:</strong>
     * <p>nra-2fede05617494417****</p>
     */
    @NameInMap("NetworkReachableAnalysisId")
    public String networkReachableAnalysisId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A7F0D6EC-E19E-58AC-AC9F-08036763960F</p>
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
