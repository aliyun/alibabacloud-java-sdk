// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateScheduledTaskResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success. A value of a backend error code such as ERR.* or InvalidParameter.* indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message. This parameter is empty when the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleTaskId</p>
     */
    @NameInMap("taskId")
    public String taskId;

    /**
     * <p>Specifies whether an actual update is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("updated")
    public Boolean updated;

    public static UpdateScheduledTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduledTaskResponseBody self = new UpdateScheduledTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateScheduledTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateScheduledTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateScheduledTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateScheduledTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateScheduledTaskResponseBody setUpdated(Boolean updated) {
        this.updated = updated;
        return this;
    }
    public Boolean getUpdated() {
        return this.updated;
    }

}
