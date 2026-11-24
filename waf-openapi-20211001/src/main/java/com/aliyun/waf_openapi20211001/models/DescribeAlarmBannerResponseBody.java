// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAlarmBannerResponseBody extends TeaModel {
    /**
     * <p>The alert banner status information.</p>
     */
    @NameInMap("BannerStatus")
    public DescribeAlarmBannerResponseBodyBannerStatus bannerStatus;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The cause of the alerting. If the Alarm Metric is sandbox (<strong>Type</strong> is set to <strong>sandbox</strong>), valid values are:</p>
         * <ul>
         * <li><strong>fivefold</strong>: The clean queries per second (QPS) exceeds the current specifications.</li>
         * <li><strong>4count</strong>: The accumulated actual clean QPS exceeds the current specifications.</li>
         * <li><strong>exceed10w</strong>: The actual peak clean QPS exceeds 100,000.</li>
         * <li><strong>costProtection</strong>: Billing protection is triggered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4count</p>
         */
        @NameInMap("Cause")
        public String cause;

        /**
         * <p>The usage when alerting is triggered.</p>
         * <ul>
         * <li>If the Alarm Metric is sandbox (<strong>Type</strong> is set to <strong>sandbox</strong>), this parameter indicates the number of days the quota is exceeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>9008</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The alerting status. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Alerting is triggered. If the Alarm Metric is sandbox (<strong>Type</strong> is set to <strong>sandbox</strong>), the instance is in the sandbox.</li>
         * <li><strong>false</strong>: No alerting is triggered. If the Alarm Metric is sandbox (<strong>Type</strong> is set to <strong>sandbox</strong>), the instance is not in the sandbox.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Status")
        public Boolean status;

        /**
         * <p>The Alarm Metric. Valid values:</p>
         * <ul>
         * <li><strong>sandbox</strong>: sandbox alerting.</li>
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
