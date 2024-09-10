// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSummaryInfoResponseBody extends TeaModel {
    /**
     * <p>The number of unprotected assets.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("AegisClientOfflineCount")
    public Integer aegisClientOfflineCount;

    /**
     * <p>The number of protected assets.</p>
     * 
     * <strong>example:</strong>
     * <p>127</p>
     */
    @NameInMap("AegisClientOnlineCount")
    public Integer aegisClientOnlineCount;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>D40198E1-6EA8-482E-B3C7-D9573D75C0CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The security score of the assets. Valid values:</p>
     * <ul>
     * <li>95 to 100: The assets are secure.</li>
     * <li>85 to 94: The assets are exposed to a few security risks. We recommend that you reinforce your security system in a timely manner.</li>
     * <li>70 to 84: The assets are exposed to multiple security risks. We recommend that you reinforce your security system in a timely manner.</li>
     * <li>69 or lower: The current security system is unable to protect the assets against intrusions. We recommend that you reinforce your security system at the earliest opportunity.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>44</p>
     */
    @NameInMap("SecurityScore")
    public Integer securityScore;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
