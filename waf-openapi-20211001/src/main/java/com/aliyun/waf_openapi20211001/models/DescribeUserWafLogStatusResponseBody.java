// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserWafLogStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the region where logs are stored. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: indicates China East 1 (Hangzhou).</p>
     * </li>
     * <li><p><strong>cn-beijing</strong>: indicates China North 2 (Beijing).</p>
     * </li>
     * <li><p><strong>cn-hongkong</strong>: indicates China (Hong Kong).</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: indicates Singapore.</p>
     * </li>
     * <li><p><strong>ap-southeast-3</strong>: indicates Malaysia (Kuala Lumpur).</p>
     * </li>
     * <li><p><strong>ap-southeast-5</strong>: indicates Indonesia (Jakarta).</p>
     * </li>
     * <li><p><strong>ap-southeast-6</strong>: indicates Philippines (Manila).</p>
     * </li>
     * <li><p><strong>ap-southeast-7</strong>: indicates Thailand (Bangkok).</p>
     * </li>
     * <li><p><strong>me-east-1</strong>: indicates UAE (Dubai).</p>
     * </li>
     * <li><p><strong>eu-central-1</strong>: indicates Germany (Frankfurt).</p>
     * </li>
     * <li><p><strong>us-east-1</strong>: indicates US (Virginia).</p>
     * </li>
     * <li><p><strong>us-west-1</strong>: indicates US (Silicon Valley).</p>
     * </li>
     * <li><p><strong>ap-northeast-1</strong>: indicates Japan (Tokyo).</p>
     * </li>
     * <li><p><strong>ap-northeast-2</strong>: indicates South Korea (Seoul).</p>
     * </li>
     * <li><p><strong>eu-west-1</strong>: indicates UK (London).</p>
     * </li>
     * <li><p><strong>cn-hangzhou-finance</strong>: indicates China East 1 Hangzhou Finance Cloud.</p>
     * </li>
     * <li><p><strong>cn-shanghai-finance-1</strong>: indicates China East 2 Shanghai Finance Cloud.</p>
     * </li>
     * <li><p><strong>cn-shenzhen-finance</strong>: indicates China South 1 Shenzhen Finance Cloud.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The Finance Cloud regions are available only to Finance Cloud users, and Finance Cloud users can obtain only these regions.</p>
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
     * <li><p><strong>initializing</strong>: The logs are being initialized.</p>
     * </li>
     * <li><p><strong>initialize_failed</strong>: The initialization failed.</p>
     * </li>
     * <li><p><strong>normal</strong>: The logs are running properly.</p>
     * </li>
     * <li><p><strong>releasing</strong>: The logs are being released.</p>
     * </li>
     * <li><p><strong>release_failed</strong>: The release failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("LogStatus")
    public String logStatus;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
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
