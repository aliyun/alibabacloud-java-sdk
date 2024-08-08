// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class SyncMemberBehaviorInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Lydaas.QuickMember.SystemError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>1DEFC4F1-AF11-5A3C-93B9-2880768DA218</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SyncMemberBehaviorInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncMemberBehaviorInfoResponseBody self = new SyncMemberBehaviorInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncMemberBehaviorInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SyncMemberBehaviorInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SyncMemberBehaviorInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncMemberBehaviorInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
