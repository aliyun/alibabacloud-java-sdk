// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAlarmBannerResponseBody extends TeaModel {
    @NameInMap("BannerStatus")
    public DescribeAlarmBannerResponseBodyBannerStatus bannerStatus;

    /**
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
         * <strong>example:</strong>
         * <p>4count</p>
         */
        @NameInMap("Cause")
        public String cause;

        /**
         * <strong>example:</strong>
         * <p>9008</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Status")
        public Boolean status;

        /**
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
