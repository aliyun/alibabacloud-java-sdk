// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetNetworkReachableAnalysisResponseBody extends TeaModel {
    /**
     * <p>The unique ID (UID) of the Alibaba Cloud account.</p>
     */
    @NameInMap("AliUid")
    public Long aliUid;

    /**
     * <p>The time when the network path was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The network path ID.</p>
     */
    @NameInMap("NetworkPathId")
    public String networkPathId;

    /**
     * <p>The parameters of the network path.</p>
     */
    @NameInMap("NetworkPathParameter")
    public String networkPathParameter;

    /**
     * <p>The ID of the task for analyzing network reachability.</p>
     */
    @NameInMap("NetworkReachableAnalysisId")
    public String networkReachableAnalysisId;

    /**
     * <p>The result of network reachability analysis, which includes the network topology, error codes of network unreachability, and rules of network unreachability.</p>
     */
    @NameInMap("NetworkReachableAnalysisResult")
    public String networkReachableAnalysisResult;

    /**
     * <p>The state of the task for analyzing network reachability. Valid values:</p>
     * <br>
     * <p>*   **init**: The task is in progress.</p>
     * <p>*   **finish**: The task is complete.</p>
     * <p>*   **error**: An analysis error occurred.</p>
     * <p>*   **timeout**: The task timed out.</p>
     */
    @NameInMap("NetworkReachableAnalysisStatus")
    public String networkReachableAnalysisStatus;

    /**
     * <p>Indicates whether the network path is reachable. Valid values:</p>
     * <br>
     * <p>*   **true**: The network path is reachable.</p>
     * <p>*   **false**: The network path is unreachable.</p>
     */
    @NameInMap("Reachable")
    public Boolean reachable;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNetworkReachableAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkReachableAnalysisResponseBody self = new GetNetworkReachableAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNetworkReachableAnalysisResponseBody setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public GetNetworkReachableAnalysisResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetNetworkReachableAnalysisResponseBody setNetworkPathId(String networkPathId) {
        this.networkPathId = networkPathId;
        return this;
    }
    public String getNetworkPathId() {
        return this.networkPathId;
    }

    public GetNetworkReachableAnalysisResponseBody setNetworkPathParameter(String networkPathParameter) {
        this.networkPathParameter = networkPathParameter;
        return this;
    }
    public String getNetworkPathParameter() {
        return this.networkPathParameter;
    }

    public GetNetworkReachableAnalysisResponseBody setNetworkReachableAnalysisId(String networkReachableAnalysisId) {
        this.networkReachableAnalysisId = networkReachableAnalysisId;
        return this;
    }
    public String getNetworkReachableAnalysisId() {
        return this.networkReachableAnalysisId;
    }

    public GetNetworkReachableAnalysisResponseBody setNetworkReachableAnalysisResult(String networkReachableAnalysisResult) {
        this.networkReachableAnalysisResult = networkReachableAnalysisResult;
        return this;
    }
    public String getNetworkReachableAnalysisResult() {
        return this.networkReachableAnalysisResult;
    }

    public GetNetworkReachableAnalysisResponseBody setNetworkReachableAnalysisStatus(String networkReachableAnalysisStatus) {
        this.networkReachableAnalysisStatus = networkReachableAnalysisStatus;
        return this;
    }
    public String getNetworkReachableAnalysisStatus() {
        return this.networkReachableAnalysisStatus;
    }

    public GetNetworkReachableAnalysisResponseBody setReachable(Boolean reachable) {
        this.reachable = reachable;
        return this;
    }
    public Boolean getReachable() {
        return this.reachable;
    }

    public GetNetworkReachableAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
