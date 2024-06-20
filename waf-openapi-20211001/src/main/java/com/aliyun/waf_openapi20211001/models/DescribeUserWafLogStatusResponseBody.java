// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserWafLogStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the region where WAF logs are stored. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: China (Hangzhou).</li>
     * <li><strong>cn-beijing</strong>: China (Beijing).</li>
     * <li><strong>cn-hongkong</strong>: China (Hong Kong).</li>
     * <li><strong>ap-southeast-1</strong>: Singapore.</li>
     * <li><strong>ap-southeast-2</strong>: Australia (Sydney).</li>
     * <li><strong>ap-southeast-3</strong>: Malaysia (Kuala Lumpur).</li>
     * <li><strong>ap-southeast-5</strong>: Indonesia (Jakarta).</li>
     * <li><strong>ap-southeast-6</strong>: Philippines (Manila).</li>
     * <li><strong>ap-southeast-7</strong>: Thailand (Bangkok).</li>
     * <li><strong>me-east-1</strong>: UAE (Dubai).</li>
     * <li><strong>eu-central-1</strong>: Germany (Frankfurt).</li>
     * <li><strong>us-east-1</strong>: US (Virginia).</li>
     * <li><strong>us-west-1</strong>: US (Silicon Valley).</li>
     * <li><strong>ap-northeast-1</strong>: Japan (Tokyo).</li>
     * <li><strong>ap-northeast-2</strong>: South Korea (Seoul).</li>
     * <li><strong>ap-south-1</strong>: India (Mumbai).</li>
     * <li><strong>eu-west-1</strong>: UK (London).</li>
     * <li><strong>cn-hangzhou-finance</strong>: China East 1 Finance.</li>
     * <li><strong>cn-shanghai-finance-1</strong>: China East 2 Finance.</li>
     * <li><strong>cn-shenzhen-finance</strong>: China South 1 Finance.</li>
     * </ul>
     * <blockquote>
     * <p> The China East 1 Finance, China East 2 Finance, and China South 1 Finance regions are available only for Alibaba Finance Cloud users. Alibaba Finance Cloud users are also limited to storing logs within these specific regions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("LogRegionId")
    public String logRegionId;

    /**
     * <p>The status of WAF logs.</p>
     * <ul>
     * <li><strong>initializing</strong></li>
     * <li><strong>initialize_failed</strong></li>
     * <li><strong>normal</strong></li>
     * <li><strong>releasing</strong></li>
     * <li><strong>release_failed</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("LogStatus")
    public String logStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19160D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the log status was modified. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1706771796859</p>
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
