// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class DisableRoleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static DisableRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableRoleResponseBody self = new DisableRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableRoleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisableRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableRoleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DisableRoleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
