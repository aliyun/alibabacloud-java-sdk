// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateFuncSwitchRecordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public UpdateFuncSwitchRecordResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>result: code=1 msg=(Request failed, status_code != 200)</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateFuncSwitchRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFuncSwitchRecordResponseBody self = new UpdateFuncSwitchRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFuncSwitchRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateFuncSwitchRecordResponseBody setData(UpdateFuncSwitchRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateFuncSwitchRecordResponseBodyData getData() {
        return this.data;
    }

    public UpdateFuncSwitchRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateFuncSwitchRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateFuncSwitchRecordResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>63fc5acb99e642d793f42912612e8001</p>
         */
        @NameInMap("task_id")
        public String taskId;

        public static UpdateFuncSwitchRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateFuncSwitchRecordResponseBodyData self = new UpdateFuncSwitchRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateFuncSwitchRecordResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
