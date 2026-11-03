// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListSwimmingLaneGroupTagsResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: Success.</li>
     * <li><strong>3xx</strong>: Redirection.</li>
     * <li><strong>4xx</strong>: Request error.</li>
     * <li><strong>5xx</strong>: Server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListSwimmingLaneGroupTagsResponseBodyData> data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>Successful request: The <strong>ErrorCode</strong> field is not returned.</li>
     * <li>Failed request: The <strong>ErrorCode</strong> field is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter.NotEmpty</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information. Valid values:</p>
     * <ul>
     * <li><strong>success</strong>: The request is successful.</li>
     * <li>Specific error code: The request is abnormal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30375C38-F4ED-4135-A0AE-5C75DC7F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Successful.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to precisely query call information.</p>
     * 
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
         * <p>The metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;tag\&quot;:\&quot;g1\&quot;,\&quot;priority\&quot;:100,\&quot;type\&quot;:\&quot;tag\&quot;,\&quot;desc\&quot;:\&quot;sys-label\&quot;}</p>
         */
        @NameInMap("Metadata")
        public String metadata;

        /**
         * <p>The lane tag.</p>
         * 
         * <strong>example:</strong>
         * <p>g1</p>
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
