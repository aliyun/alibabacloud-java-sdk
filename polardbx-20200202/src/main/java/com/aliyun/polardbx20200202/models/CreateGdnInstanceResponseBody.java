// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateGdnInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateGdnInstanceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0DBA1657-7607-56D6-BB6D-641BF17CCFDB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateGdnInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGdnInstanceResponseBody self = new CreateGdnInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGdnInstanceResponseBody setData(CreateGdnInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateGdnInstanceResponseBodyData getData() {
        return this.data;
    }

    public CreateGdnInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateGdnInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGdnInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateGdnInstanceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2209883</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static CreateGdnInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateGdnInstanceResponseBodyData self = new CreateGdnInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateGdnInstanceResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}
