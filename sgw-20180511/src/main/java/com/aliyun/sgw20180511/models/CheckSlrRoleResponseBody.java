// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CheckSlrRoleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Exist")
    public Boolean exist;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RequireOldWayCheck")
    public Boolean requireOldWayCheck;

    @NameInMap("Success")
    public Boolean success;

    public static CheckSlrRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckSlrRoleResponseBody self = new CheckSlrRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckSlrRoleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckSlrRoleResponseBody setExist(Boolean exist) {
        this.exist = exist;
        return this;
    }
    public Boolean getExist() {
        return this.exist;
    }

    public CheckSlrRoleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckSlrRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckSlrRoleResponseBody setRequireOldWayCheck(Boolean requireOldWayCheck) {
        this.requireOldWayCheck = requireOldWayCheck;
        return this;
    }
    public Boolean getRequireOldWayCheck() {
        return this.requireOldWayCheck;
    }

    public CheckSlrRoleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
