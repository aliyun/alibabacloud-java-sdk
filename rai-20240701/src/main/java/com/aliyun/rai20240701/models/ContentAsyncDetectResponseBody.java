// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ContentAsyncDetectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ContentAsyncDetectResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ContentAsyncDetectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ContentAsyncDetectResponseBody self = new ContentAsyncDetectResponseBody();
        return TeaModel.build(map, self);
    }

    public ContentAsyncDetectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ContentAsyncDetectResponseBody setData(ContentAsyncDetectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ContentAsyncDetectResponseBodyData getData() {
        return this.data;
    }

    public ContentAsyncDetectResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ContentAsyncDetectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ContentAsyncDetectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ContentAsyncDetectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ContentAsyncDetectResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5d85cd38-03b2-49fd-86b2-be85c4b13215</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ContentAsyncDetectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ContentAsyncDetectResponseBodyData self = new ContentAsyncDetectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ContentAsyncDetectResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
