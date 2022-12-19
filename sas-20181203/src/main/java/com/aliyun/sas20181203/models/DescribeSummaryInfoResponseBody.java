// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSummaryInfoResponseBody extends TeaModel {
    // The number of unprotected assets.
    @NameInMap("AegisClientOfflineCount")
    public Integer aegisClientOfflineCount;

    // The number of protected assets.
    @NameInMap("AegisClientOnlineCount")
    public Integer aegisClientOnlineCount;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The security score of the assets. Valid values:
    // 
    // *   95 to 100: The assets are secure.
    // *   85 to 94: The assets are exposed to a few security risks. We recommend that you reinforce your security system in a timely manner.
    // *   70 to 84: The assets are exposed to multiple security risks. We recommend that you reinforce your security system in a timely manner.
    // *   69 or lower: The current security system is unable to protect the assets against intrusions. We recommend that you reinforce your security system at the earliest opportunity.
    @NameInMap("SecurityScore")
    public Integer securityScore;

    // Indicates whether the request is successful. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
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
