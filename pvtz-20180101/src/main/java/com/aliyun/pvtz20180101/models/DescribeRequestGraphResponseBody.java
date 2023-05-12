// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeRequestGraphResponseBody extends TeaModel {
    @NameInMap("RequestDetails")
    public DescribeRequestGraphResponseBodyRequestDetails requestDetails;

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
        @NameInMap("RequestCount")
        public Long requestCount;

        @NameInMap("Time")
        public String time;

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
