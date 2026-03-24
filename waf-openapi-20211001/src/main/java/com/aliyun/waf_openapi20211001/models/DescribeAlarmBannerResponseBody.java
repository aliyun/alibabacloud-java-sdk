// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAlarmBannerResponseBody extends TeaModel {
    /**
     * <p>The status information of the alert banner.</p>
     */
    @NameInMap("BannerStatus")
    public DescribeAlarmBannerResponseBodyBannerStatus bannerStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5555DC36-0CF2-5AA3-B1C7-D6BD8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAlarmBannerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmBannerResponseBody self = new DescribeAlarmBannerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmBannerResponseBody setBannerStatus(DescribeAlarmBannerResponseBodyBannerStatus bannerStatus) {
        this.bannerStatus = bannerStatus;
        return this;
    }
    public DescribeAlarmBannerResponseBodyBannerStatus getBannerStatus() {
        return this.bannerStatus;
    }

    public DescribeAlarmBannerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAlarmBannerResponseBodyBannerStatus extends TeaModel {
        /**
         * <p>The cause of the alert. If <strong>Type</strong> is set to <strong>sandbox</strong>, valid values:</p>
         * <ul>
         * <li><p><strong>fivefold</strong>: The queries per second (QPS) of your service exceeds five times the upper limit of your plan.</p>
         * </li>
         * <li><p><strong>4count</strong>: The QPS of your service has exceeded the upper limit of your plan for four or more days.</p>
         * </li>
         * <li><p><strong>exceed10w</strong>: The peak QPS of your service exceeds 100,000.</p>
         * </li>
         * <li><p><strong>costProtection</strong>: Billing protection is triggered.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4count</p>
         */
        @NameInMap("Cause")
        public String cause;

        /**
         * <p>The count associated with the alert at the time it was triggered.</p>
         * <ul>
         * <li>If <strong>Type</strong> is set to <strong>sandbox</strong>, this parameter indicates the number of days that the QPS has exceeded the upper limit of your plan.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>9008</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>Indicates whether an alert is triggered. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: An alert is triggered. If <strong>Type</strong> is set to <strong>sandbox</strong>, the instance is in the sandbox.</p>
         * </li>
         * <li><p><strong>false</strong>: No alert is triggered. If <strong>Type</strong> is set to <strong>sandbox</strong>, the instance is not in the sandbox.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Status")
        public Boolean status;

        /**
         * <p>The alert type. Valid value:</p>
         * <ul>
         * <li><strong>sandbox</strong>: a sandbox alert.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sandbox</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeAlarmBannerResponseBodyBannerStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmBannerResponseBodyBannerStatus self = new DescribeAlarmBannerResponseBodyBannerStatus();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmBannerResponseBodyBannerStatus setCause(String cause) {
            this.cause = cause;
            return this;
        }
        public String getCause() {
            return this.cause;
        }

        public DescribeAlarmBannerResponseBodyBannerStatus setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeAlarmBannerResponseBodyBannerStatus setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public DescribeAlarmBannerResponseBodyBannerStatus setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
