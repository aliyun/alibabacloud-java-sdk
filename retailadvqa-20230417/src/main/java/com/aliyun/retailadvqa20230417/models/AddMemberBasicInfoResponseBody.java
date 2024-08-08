// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class AddMemberBasicInfoResponseBody extends TeaModel {
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
     * <p>WMS_36606164948078_23218019</p>
     */
    @NameInMap("OuterMemberId")
    public String outerMemberId;

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

    public static AddMemberBasicInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMemberBasicInfoResponseBody self = new AddMemberBasicInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMemberBasicInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AddMemberBasicInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddMemberBasicInfoResponseBody setOuterMemberId(String outerMemberId) {
        this.outerMemberId = outerMemberId;
        return this;
    }
    public String getOuterMemberId() {
        return this.outerMemberId;
    }

    public AddMemberBasicInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMemberBasicInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
