// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeRequestGraphResponseBody extends TeaModel {
    /**
     * <p>The information about the DNS requests.</p>
     */
    @NameInMap("RequestDetails")
    public DescribeRequestGraphResponseBodyRequestDetails requestDetails;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EB71815-A421-4E51-8E8D-667F44ABE633</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRequestGraphResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestGraphResponseBody self = new DescribeRequestGraphResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRequestGraphResponseBody setRequestDetails(DescribeRequestGraphResponseBodyRequestDetails requestDetails) {
        this.requestDetails = requestDetails;
        return this;
    }
    public DescribeRequestGraphResponseBodyRequestDetails getRequestDetails() {
        return this.requestDetails;
    }

    public DescribeRequestGraphResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRequestGraphResponseBodyRequestDetailsZoneRequestTop extends TeaModel {
        /**
         * <p>The number of DNS requests.</p>
         * 
         * <strong>example:</strong>
         * <p>103</p>
         */
        @NameInMap("RequestCount")
        public Long requestCount;

        /**
         * <p>The statistical time. The value is a string. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-21T10:00Z</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The statistical timestamp. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1571652000000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeRequestGraphResponseBodyRequestDetailsZoneRequestTop build(java.util.Map<String, ?> map) throws Exception {
            DescribeRequestGraphResponseBodyRequestDetailsZoneRequestTop self = new DescribeRequestGraphResponseBodyRequestDetailsZoneRequestTop();
            return TeaModel.build(map, self);
        }

        public DescribeRequestGraphResponseBodyRequestDetailsZoneRequestTop setRequestCount(Long requestCount) {
            this.requestCount = requestCount;
            return this;
        }
        public Long getRequestCount() {
            return this.requestCount;
        }

        public DescribeRequestGraphResponseBodyRequestDetailsZoneRequestTop setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeRequestGraphResponseBodyRequestDetailsZoneRequestTop setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class DescribeRequestGraphResponseBodyRequestDetails extends TeaModel {
        @NameInMap("ZoneRequestTop")
        public java.util.List<DescribeRequestGraphResponseBodyRequestDetailsZoneRequestTop> zoneRequestTop;

        public static DescribeRequestGraphResponseBodyRequestDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeRequestGraphResponseBodyRequestDetails self = new DescribeRequestGraphResponseBodyRequestDetails();
            return TeaModel.build(map, self);
        }

        public DescribeRequestGraphResponseBodyRequestDetails setZoneRequestTop(java.util.List<DescribeRequestGraphResponseBodyRequestDetailsZoneRequestTop> zoneRequestTop) {
            this.zoneRequestTop = zoneRequestTop;
            return this;
        }
        public java.util.List<DescribeRequestGraphResponseBodyRequestDetailsZoneRequestTop> getZoneRequestTop() {
            return this.zoneRequestTop;
        }

    }

}
