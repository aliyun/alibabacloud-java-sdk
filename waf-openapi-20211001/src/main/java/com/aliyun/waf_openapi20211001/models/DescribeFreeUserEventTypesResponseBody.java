// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeFreeUserEventTypesResponseBody extends TeaModel {
    /**
     * <p>The types of security events on which basic detection is performed.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeFreeUserEventTypesResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B9D6AD11-DD3D-5A27-B1D9-8A37F7777196</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFreeUserEventTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFreeUserEventTypesResponseBody self = new DescribeFreeUserEventTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFreeUserEventTypesResponseBody setData(java.util.List<DescribeFreeUserEventTypesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeFreeUserEventTypesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeFreeUserEventTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFreeUserEventTypesResponseBodyData extends TeaModel {
        /**
         * <p>The number of security events.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("EventNum")
        public String eventNum;

        /**
         * <p>The type of the security event.</p>
         * 
         * <strong>example:</strong>
         * <p>SMSInterfaceAbuse</p>
         */
        @NameInMap("EventType")
        public String eventType;

        public static DescribeFreeUserEventTypesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeFreeUserEventTypesResponseBodyData self = new DescribeFreeUserEventTypesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeFreeUserEventTypesResponseBodyData setEventNum(String eventNum) {
            this.eventNum = eventNum;
            return this;
        }
        public String getEventNum() {
            return this.eventNum;
        }

        public DescribeFreeUserEventTypesResponseBodyData setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

    }

}
