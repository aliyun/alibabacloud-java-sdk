// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>Invalid data</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody self = new DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
