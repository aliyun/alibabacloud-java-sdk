// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class CalculateMemberLevelResponseBody extends TeaModel {
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
     * <p>1</p>
     */
    @NameInMap("Grade")
    public String grade;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6062f9067f170700a2e7ef5a</p>
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

    public static CalculateMemberLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CalculateMemberLevelResponseBody self = new CalculateMemberLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public CalculateMemberLevelResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CalculateMemberLevelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CalculateMemberLevelResponseBody setGrade(String grade) {
        this.grade = grade;
        return this;
    }
    public String getGrade() {
        return this.grade;
    }

    public CalculateMemberLevelResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CalculateMemberLevelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CalculateMemberLevelResponseBody setOuterMemberId(String outerMemberId) {
        this.outerMemberId = outerMemberId;
        return this;
    }
    public String getOuterMemberId() {
        return this.outerMemberId;
    }

    public CalculateMemberLevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CalculateMemberLevelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
