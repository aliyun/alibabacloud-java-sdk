// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateSQLEvaluateTaskResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public CreateSQLEvaluateTaskResponseBodyData data;

    /**
     * <p>The returned message. &gt; This parameter is empty when the request succeeds. If the request fails, an error message is returned, such as an error code.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6352AC16-76BF-5135-B1EA-ED49293526E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateSQLEvaluateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSQLEvaluateTaskResponseBody self = new CreateSQLEvaluateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSQLEvaluateTaskResponseBody setData(CreateSQLEvaluateTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSQLEvaluateTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateSQLEvaluateTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSQLEvaluateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSQLEvaluateTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSQLEvaluateTaskResponseBodyData extends TeaModel {
        /**
         * <p>The Slink task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>etx-szr2rr6i*****</p>
         */
        @NameInMap("SlinkTaskId")
        public String slinkTaskId;

        public static CreateSQLEvaluateTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSQLEvaluateTaskResponseBodyData self = new CreateSQLEvaluateTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSQLEvaluateTaskResponseBodyData setSlinkTaskId(String slinkTaskId) {
            this.slinkTaskId = slinkTaskId;
            return this;
        }
        public String getSlinkTaskId() {
            return this.slinkTaskId;
        }

    }

}
