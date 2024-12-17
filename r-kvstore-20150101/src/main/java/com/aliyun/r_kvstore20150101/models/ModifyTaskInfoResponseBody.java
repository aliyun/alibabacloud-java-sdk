// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyTaskInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>mst.errorcode.success.errormessage</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>t-0mqaj5hnyofczv****</p>
     */
    @NameInMap("ErrorTaskId")
    public String errorTaskId;

    /**
     * <strong>example:</strong>
     * <p>2B98499B-E62B-56D4-8D7F-3D6D4DB260F2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
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
