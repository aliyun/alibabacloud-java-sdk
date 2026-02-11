// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribePocTaskListResponseBody extends TeaModel {
    /**
     * <p>Status code. A return value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>Return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public Boolean message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4A91D2D1-AEC9-1658-ABCE-5A39DE66A5C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result.</p>
     */
    @NameInMap("ResultObject")
    public java.util.List<DescribePocTaskListResponseBodyResultObject> resultObject;

    public static DescribePocTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePocTaskListResponseBody self = new DescribePocTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePocTaskListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePocTaskListResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribePocTaskListResponseBody setMessage(Boolean message) {
        this.message = message;
        return this;
    }
    public Boolean getMessage() {
        return this.message;
    }

    public DescribePocTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePocTaskListResponseBody setResultObject(java.util.List<DescribePocTaskListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribePocTaskListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribePocTaskListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Retro task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>Retro task name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        public static DescribePocTaskListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribePocTaskListResponseBodyResultObject self = new DescribePocTaskListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribePocTaskListResponseBodyResultObject setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribePocTaskListResponseBodyResultObject setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
