// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSummaryInfoResponseBody extends TeaModel {
    /**
     * <p>The number of unprotected assets.</p>
     */
    @NameInMap("AegisClientOfflineCount")
    public Integer aegisClientOfflineCount;

    /**
     * <p>The number of protected assets.</p>
     */
    @NameInMap("AegisClientOnlineCount")
    public Integer aegisClientOnlineCount;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The security score of the assets. Valid values:</p>
     * <br>
     * <p>*   95 to 100: The assets are secure.</p>
     * <p>*   85 to 94: The assets are exposed to a few security risks. We recommend that you reinforce your security system in a timely manner.</p>
     * <p>*   70 to 84: The assets are exposed to multiple security risks. We recommend that you reinforce your security system in a timely manner.</p>
     * <p>*   69 or lower: The current security system is unable to protect the assets against intrusions. We recommend that you reinforce your security system at the earliest opportunity.</p>
     */
    @NameInMap("SecurityScore")
    public Integer securityScore;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeSummaryInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSummaryInfoResponseBody self = new DescribeSummaryInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSummaryInfoResponseBody setAegisClientOfflineCount(Integer aegisClientOfflineCount) {
        this.aegisClientOfflineCount = aegisClientOfflineCount;
        return this;
    }
    public Integer getAegisClientOfflineCount() {
        return this.aegisClientOfflineCount;
    }

    public DescribeSummaryInfoResponseBody setAegisClientOnlineCount(Integer aegisClientOnlineCount) {
        this.aegisClientOnlineCount = aegisClientOnlineCount;
        return this;
    }
    public Integer getAegisClientOnlineCount() {
        return this.aegisClientOnlineCount;
    }

    public DescribeSummaryInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSummaryInfoResponseBody setSecurityScore(Integer securityScore) {
        this.securityScore = securityScore;
        return this;
    }
    public Integer getSecurityScore() {
        return this.securityScore;
    }

    public DescribeSummaryInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
