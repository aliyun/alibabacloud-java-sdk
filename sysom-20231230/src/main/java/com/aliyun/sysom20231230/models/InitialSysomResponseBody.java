// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InitialSysomResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public InitialSysomResponseBodyData data;

    @NameInMap("message")
    public String message;

    public static InitialSysomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitialSysomResponseBody self = new InitialSysomResponseBody();
        return TeaModel.build(map, self);
    }

    public InitialSysomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitialSysomResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitialSysomResponseBody setData(InitialSysomResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InitialSysomResponseBodyData getData() {
        return this.data;
    }

    public InitialSysomResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class InitialSysomResponseBodyData extends TeaModel {
        @NameInMap("role_exist")
        public Boolean roleExist;

        public static InitialSysomResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InitialSysomResponseBodyData self = new InitialSysomResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InitialSysomResponseBodyData setRoleExist(Boolean roleExist) {
            this.roleExist = roleExist;
            return this;
        }
        public Boolean getRoleExist() {
            return this.roleExist;
        }

    }

}
