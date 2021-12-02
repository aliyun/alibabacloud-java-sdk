// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateEnvironmentResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateEnvironmentResponseBodyResult result;

    public static CreateEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentResponseBody self = new CreateEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateEnvironmentResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CreateEnvironmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEnvironmentResponseBody setResult(CreateEnvironmentResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateEnvironmentResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateEnvironmentResponseBodyResult extends TeaModel {
        @NameInMap("AppEnvId")
        public Long appEnvId;

        public static CreateEnvironmentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateEnvironmentResponseBodyResult self = new CreateEnvironmentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateEnvironmentResponseBodyResult setAppEnvId(Long appEnvId) {
            this.appEnvId = appEnvId;
            return this;
        }
        public Long getAppEnvId() {
            return this.appEnvId;
        }

    }

}
