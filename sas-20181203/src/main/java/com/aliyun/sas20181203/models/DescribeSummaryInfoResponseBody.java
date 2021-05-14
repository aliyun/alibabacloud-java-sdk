// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSummaryInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("AegisClientOfflineCount")
    public Integer aegisClientOfflineCount;

    @NameInMap("AegisClientOnlineCount")
    public Integer aegisClientOnlineCount;

    @NameInMap("SecurityScore")
    public Integer securityScore;

    public static DescribeSummaryInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSummaryInfoResponseBody self = new DescribeSummaryInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSummaryInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSummaryInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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

    public DescribeSummaryInfoResponseBody setSecurityScore(Integer securityScore) {
        this.securityScore = securityScore;
        return this;
    }
    public Integer getSecurityScore() {
        return this.securityScore;
    }

}
