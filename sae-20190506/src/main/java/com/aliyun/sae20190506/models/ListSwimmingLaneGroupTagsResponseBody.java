// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListSwimmingLaneGroupTagsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListSwimmingLaneGroupTagsResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>30375C38-F4ED-4135-A0AE-5C75DC7F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>ac1a0b2215622920113732501e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ListSwimmingLaneGroupTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSwimmingLaneGroupTagsResponseBody self = new ListSwimmingLaneGroupTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSwimmingLaneGroupTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSwimmingLaneGroupTagsResponseBody setData(java.util.List<ListSwimmingLaneGroupTagsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSwimmingLaneGroupTagsResponseBodyData> getData() {
        return this.data;
    }

    public ListSwimmingLaneGroupTagsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListSwimmingLaneGroupTagsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSwimmingLaneGroupTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSwimmingLaneGroupTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSwimmingLaneGroupTagsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListSwimmingLaneGroupTagsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;version&quot;:&quot;1.0.0&quot;,&quot;owner&quot;:&quot;team-a&quot;}</p>
         */
        @NameInMap("Metadata")
        public String metadata;

        /**
         * <strong>example:</strong>
         * <p>{&quot;alicloud.service.tag&quot;:&quot;g1&quot;}</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static ListSwimmingLaneGroupTagsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSwimmingLaneGroupTagsResponseBodyData self = new ListSwimmingLaneGroupTagsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSwimmingLaneGroupTagsResponseBodyData setMetadata(String metadata) {
            this.metadata = metadata;
            return this;
        }
        public String getMetadata() {
            return this.metadata;
        }

        public ListSwimmingLaneGroupTagsResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
