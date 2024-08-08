// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class MemberPointChangeResponseBody extends TeaModel {
    @NameInMap("AccountBalance")
    public String accountBalance;

    /**
     * <strong>example:</strong>
     * <p>Lydaas.QuickMember.SystemError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("LevelName")
    public String levelName;

    /**
     * <strong>example:</strong>
     * <p>B2CD5682-12C0-51A7-82FC-1D36091CADAD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static MemberPointChangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MemberPointChangeResponseBody self = new MemberPointChangeResponseBody();
        return TeaModel.build(map, self);
    }

    public MemberPointChangeResponseBody setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
        return this;
    }
    public String getAccountBalance() {
        return this.accountBalance;
    }

    public MemberPointChangeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public MemberPointChangeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public MemberPointChangeResponseBody setLevelName(String levelName) {
        this.levelName = levelName;
        return this;
    }
    public String getLevelName() {
        return this.levelName;
    }

    public MemberPointChangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MemberPointChangeResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
