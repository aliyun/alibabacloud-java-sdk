// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddUserGroupMembersResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 接口执行结果。取值范围：true：请求成功false：请求失败
    @NameInMap("Result")
    public Boolean result;

    // 是否请求成功。取值范围：true：请求成功false：请求失败
    @NameInMap("Success")
    public Boolean success;

    public static AddUserGroupMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUserGroupMembersResponseBody self = new AddUserGroupMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUserGroupMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddUserGroupMembersResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public AddUserGroupMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
