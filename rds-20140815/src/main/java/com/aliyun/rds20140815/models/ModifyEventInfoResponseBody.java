// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyEventInfoResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>mst.errorcode.success.errormessage</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12343</p>
     */
    @NameInMap("ErrorEventId")
    public String errorEventId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>224DB9F7-3100-4899-AB9C-C938BCCB43E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of successful records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SuccessCount")
    public Integer successCount;

    /**
     * <p>The ID of the successful event.</p>
     * 
     * <strong>example:</strong>
     * <p>234221</p>
     */
    @NameInMap("SuccessEventId")
    public String successEventId;

    public static ModifyEventInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyEventInfoResponseBody self = new ModifyEventInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyEventInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ModifyEventInfoResponseBody setErrorEventId(String errorEventId) {
        this.errorEventId = errorEventId;
        return this;
    }
    public String getErrorEventId() {
        return this.errorEventId;
    }

    public ModifyEventInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyEventInfoResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public ModifyEventInfoResponseBody setSuccessEventId(String successEventId) {
        this.successEventId = successEventId;
        return this;
    }
    public String getSuccessEventId() {
        return this.successEventId;
    }

}
