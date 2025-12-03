// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenSummaryInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("AegisClientOfflineCount")
    public Integer aegisClientOfflineCount;

    /**
     * <strong>example:</strong>
     * <p>127</p>
     */
    @NameInMap("AegisClientOnlineCount")
    public Integer aegisClientOnlineCount;

    /**
     * <strong>example:</strong>
     * <p>23AD0BD2-8771-5647-819E-XXXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SecurityScore")
    public Integer securityScore;

    public static DescribeScreenSummaryInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenSummaryInfoResponseBody self = new DescribeScreenSummaryInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScreenSummaryInfoResponseBody setAegisClientOfflineCount(Integer aegisClientOfflineCount) {
        this.aegisClientOfflineCount = aegisClientOfflineCount;
        return this;
    }
    public Integer getAegisClientOfflineCount() {
        return this.aegisClientOfflineCount;
    }

    public DescribeScreenSummaryInfoResponseBody setAegisClientOnlineCount(Integer aegisClientOnlineCount) {
        this.aegisClientOnlineCount = aegisClientOnlineCount;
        return this;
    }
    public Integer getAegisClientOnlineCount() {
        return this.aegisClientOnlineCount;
    }

    public DescribeScreenSummaryInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScreenSummaryInfoResponseBody setSecurityScore(Integer securityScore) {
        this.securityScore = securityScore;
        return this;
    }
    public Integer getSecurityScore() {
        return this.securityScore;
    }

}
