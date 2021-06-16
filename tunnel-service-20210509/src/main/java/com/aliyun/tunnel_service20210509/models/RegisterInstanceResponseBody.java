// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tunnel_service20210509.models;

import com.aliyun.tea.*;

public class RegisterInstanceResponseBody extends TeaModel {
    // 错误码
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public RegisterInstanceResponseBodyData data;

    // 错误详情
    @NameInMap("message")
    public String message;

    // 请求ID
    @NameInMap("requestId")
    public String requestId;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    public static RegisterInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterInstanceResponseBody self = new RegisterInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RegisterInstanceResponseBody setData(RegisterInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RegisterInstanceResponseBodyData getData() {
        return this.data;
    }

    public RegisterInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RegisterInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RegisterInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UnRegisterInstanceResponseBodyData extends TeaModel {
        // 实例ID
        @NameInMap("instanceId")
        public String instanceId;

        public static UnRegisterInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UnRegisterInstanceResponseBodyData self = new UnRegisterInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UnRegisterInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class RegisterInstanceResponseBodyData extends TeaModel {
        // 实例ID
        @NameInMap("instanceId")
        public String instanceId;

        public static RegisterInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RegisterInstanceResponseBodyData self = new RegisterInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RegisterInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
