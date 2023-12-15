// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyEventInfoResponseBody extends TeaModel {
    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Error eventId.</p>
     */
    @NameInMap("ErrorEventId")
    public String errorEventId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of devices that were created.</p>
     */
    @NameInMap("SuccessCount")
    public Integer successCount;

    /**
     * <p>Success eventId.</p>
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
