// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserWafLogStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the region where WAF logs are stored. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou**: China (Hangzhou).</p>
     * <p>*   **cn-beijing**: China (Beijing).</p>
     * <p>*   **cn-hongkong**: China (Hong Kong).</p>
     * <p>*   **ap-southeast-1**: Singapore.</p>
     * <p>*   **ap-southeast-2**: Australia (Sydney).</p>
     * <p>*   **ap-southeast-3**: Malaysia (Kuala Lumpur).</p>
     * <p>*   **ap-southeast-5**: Indonesia (Jakarta).</p>
     * <p>*   **ap-southeast-6**: Philippines (Manila).</p>
     * <p>*   **ap-southeast-7**: Thailand (Bangkok).</p>
     * <p>*   **me-east-1**: UAE (Dubai).</p>
     * <p>*   **eu-central-1**: Germany (Frankfurt).</p>
     * <p>*   **us-east-1**: US (Virginia).</p>
     * <p>*   **us-west-1**: US (Silicon Valley).</p>
     * <p>*   **ap-northeast-1**: Japan (Tokyo).</p>
     * <p>*   **ap-northeast-2**: South Korea (Seoul).</p>
     * <p>*   **ap-south-1**: India (Mumbai).</p>
     * <p>*   **eu-west-1**: UK (London).</p>
     * <p>*   **cn-hangzhou-finance**: China East 1 Finance.</p>
     * <p>*   **cn-shanghai-finance-1**: China East 2 Finance.</p>
     * <p>*   **cn-shenzhen-finance**: China South 1 Finance.</p>
     * <br>
     * <p>>  The China East 1 Finance, China East 2 Finance, and China South 1 Finance regions are available only for Alibaba Finance Cloud users. Alibaba Finance Cloud users are also limited to storing logs within these specific regions.</p>
     */
    @NameInMap("LogRegionId")
    public String logRegionId;

    /**
     * <p>The status of WAF logs.</p>
     * <br>
     * <p>*   **initializing**</p>
     * <p>*   **initialize_failed**</p>
     * <p>*   **normal**</p>
     * <p>*   **releasing**</p>
     * <p>*   **release_failed**</p>
     */
    @NameInMap("LogStatus")
    public String logStatus;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the log status was modified. Unit: milliseconds.</p>
     */
    @NameInMap("StatusUpdateTime")
    public Long statusUpdateTime;

    public static DescribeUserWafLogStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserWafLogStatusResponseBody self = new DescribeUserWafLogStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserWafLogStatusResponseBody setLogRegionId(String logRegionId) {
        this.logRegionId = logRegionId;
        return this;
    }
    public String getLogRegionId() {
        return this.logRegionId;
    }

    public DescribeUserWafLogStatusResponseBody setLogStatus(String logStatus) {
        this.logStatus = logStatus;
        return this;
    }
    public String getLogStatus() {
        return this.logStatus;
    }

    public DescribeUserWafLogStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserWafLogStatusResponseBody setStatusUpdateTime(Long statusUpdateTime) {
        this.statusUpdateTime = statusUpdateTime;
        return this;
    }
    public Long getStatusUpdateTime() {
        return this.statusUpdateTime;
    }

}
