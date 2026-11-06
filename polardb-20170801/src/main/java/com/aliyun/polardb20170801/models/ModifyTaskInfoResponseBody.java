// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyTaskInfoResponseBody extends TeaModel {
    /**
     * <p>The error code returned when the task update fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The ID of the task that failed to be updated.</p>
     * 
     * <strong>example:</strong>
     * <p>32077061</p>
     */
    @NameInMap("ErrorTaskId")
    public String errorTaskId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of tasks that were successfully updated.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SuccessCount")
    public String successCount;

    public static ModifyTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTaskInfoResponseBody self = new ModifyTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTaskInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ModifyTaskInfoResponseBody setErrorTaskId(String errorTaskId) {
        this.errorTaskId = errorTaskId;
        return this;
    }
    public String getErrorTaskId() {
        return this.errorTaskId;
    }

    public ModifyTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyTaskInfoResponseBody setSuccessCount(String successCount) {
        this.successCount = successCount;
        return this;
    }
    public String getSuccessCount() {
        return this.successCount;
    }

}
