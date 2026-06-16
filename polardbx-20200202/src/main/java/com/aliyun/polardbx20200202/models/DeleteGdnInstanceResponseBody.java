// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteGdnInstanceResponseBody extends TeaModel {
    /**
     * <p>The data struct.</p>
     */
    @NameInMap("Data")
    public DeleteGdnInstanceResponseBodyData data;

    /**
     * <p>The response message.</p>
     * <blockquote>
     * <p>This parameter is empty when the request succeeds. If the request fails, an exception message is returned, such as an error code.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>14036EBE-CF2E-44DB-ACE9-AC6157D3A6FC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteGdnInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGdnInstanceResponseBody self = new DeleteGdnInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGdnInstanceResponseBody setData(DeleteGdnInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteGdnInstanceResponseBodyData getData() {
        return this.data;
    }

    public DeleteGdnInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteGdnInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteGdnInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteGdnInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2209883</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static DeleteGdnInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteGdnInstanceResponseBodyData self = new DeleteGdnInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteGdnInstanceResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}
