// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class ListEnterpriseDingtalkGroupCustomerMembersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<EnterpriseDingtalkGroupMember> data;

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

    public static ListEnterpriseDingtalkGroupCustomerMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseDingtalkGroupCustomerMembersResponseBody self = new ListEnterpriseDingtalkGroupCustomerMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseDingtalkGroupCustomerMembersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEnterpriseDingtalkGroupCustomerMembersResponseBody setData(java.util.List<EnterpriseDingtalkGroupMember> data) {
        this.data = data;
        return this;
    }
    public java.util.List<EnterpriseDingtalkGroupMember> getData() {
        return this.data;
    }

    public ListEnterpriseDingtalkGroupCustomerMembersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEnterpriseDingtalkGroupCustomerMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnterpriseDingtalkGroupCustomerMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
