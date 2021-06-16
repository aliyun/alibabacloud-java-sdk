// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tunnel_service20210509.models;

import com.aliyun.tea.*;

public class UnRegisterInstanceResponseBody extends TeaModel {
    // 错误码
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public UnRegisterInstanceResponseBodyData data;

    // 错误详情
    @NameInMap("message")
    public String message;

    // 请求ID
    @NameInMap("requestId")
    public String requestId;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    public static UnRegisterInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnRegisterInstanceResponseBody self = new UnRegisterInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UnRegisterInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnRegisterInstanceResponseBody setData(UnRegisterInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UnRegisterInstanceResponseBodyData getData() {
        return this.data;
    }

    public UnRegisterInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnRegisterInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnRegisterInstanceResponseBody setSuccess(Boolean success) {
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

}
