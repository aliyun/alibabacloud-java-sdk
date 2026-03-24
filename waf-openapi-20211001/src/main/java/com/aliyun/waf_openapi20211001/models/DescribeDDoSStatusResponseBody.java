// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDDoSStatusResponseBody extends TeaModel {
    /**
     * <p>The current DDoS status.</p>
     */
    @NameInMap("DDoSStatus")
    public java.util.List<DescribeDDoSStatusResponseBodyDDoSStatus> DDoSStatus;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDDoSStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSStatusResponseBody self = new DescribeDDoSStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSStatusResponseBody setDDoSStatus(java.util.List<DescribeDDoSStatusResponseBodyDDoSStatus> DDoSStatus) {
        this.DDoSStatus = DDoSStatus;
        return this;
    }
    public java.util.List<DescribeDDoSStatusResponseBodyDDoSStatus> getDDoSStatus() {
        return this.DDoSStatus;
    }

    public DescribeDDoSStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDDoSStatusResponseBodyDDoSStatus extends TeaModel {
        /**
         * <p>The name of the event type. Valid values:</p>
         * <ul>
         * <li><p>defense: DDoS traffic scrubbing event.</p>
         * </li>
         * <li><p>blackhole: DDoS blackhole filtering event.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>blackhole</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The DDoS status:</p>
         * <p><strong>doing</strong>: Under DDoS attack.</p>
         * 
         * <strong>example:</strong>
         * <p>doing</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDDoSStatusResponseBodyDDoSStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDDoSStatusResponseBodyDDoSStatus self = new DescribeDDoSStatusResponseBodyDDoSStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDDoSStatusResponseBodyDDoSStatus setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeDDoSStatusResponseBodyDDoSStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
