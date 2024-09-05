// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class GetEnterpriseDingtalkGroupCustomerMemberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public EnterpriseDingtalkGroupMember data;

    /**
     * <strong>example:</strong>
     * <p>Invalid data</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetEnterpriseDingtalkGroupCustomerMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseDingtalkGroupCustomerMemberResponseBody self = new GetEnterpriseDingtalkGroupCustomerMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseDingtalkGroupCustomerMemberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEnterpriseDingtalkGroupCustomerMemberResponseBody setData(EnterpriseDingtalkGroupMember data) {
        this.data = data;
        return this;
    }
    public EnterpriseDingtalkGroupMember getData() {
        return this.data;
    }

    public GetEnterpriseDingtalkGroupCustomerMemberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEnterpriseDingtalkGroupCustomerMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEnterpriseDingtalkGroupCustomerMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
