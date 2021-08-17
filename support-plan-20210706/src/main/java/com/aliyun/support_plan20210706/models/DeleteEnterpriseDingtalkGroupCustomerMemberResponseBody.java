// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody extends TeaModel {
    // 接口请求的唯一ID, 每次调用requestID唯一
    @NameInMap("RequestId")
    public String requestId;

    // 调用接口返回是否成功, true代表调用正常
    @NameInMap("Success")
    public Boolean success;

    // 错误信息, 当success=false的时候, 可以取到message
    @NameInMap("Message")
    public String message;

    // 接口请求结果返回码
    @NameInMap("Code")
    public String code;

    public static DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody self = new DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody();
        return TeaModel.build(map, self);
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

    public DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
