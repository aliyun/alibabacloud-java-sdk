// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyTaskInfoResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>mst.errorcode.success.errormessage</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The ID of the failed task. This parameter is returned when a task fails.</p>
     * 
     * <strong>example:</strong>
     * <p>t-83br18hlw11ue610yo</p>
     */
    @NameInMap("ErrorTaskId")
    public String errorTaskId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>18B3000C-2B06-5D4F-AA5B-456D5FBCA55B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of completed tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
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
