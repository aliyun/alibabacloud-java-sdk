// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateServiceResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static CreateServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceResponseBody self = new CreateServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateServiceResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CreateServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceResponseBody setResult(CreateServiceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateServiceResponseBodyResult getResult() {
        return this.result;
    }

    public CreateServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateServiceResponseBodyResult extends TeaModel {
        @NameInMap("ServiceId")
        public Long serviceId;

        public static CreateServiceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceResponseBodyResult self = new CreateServiceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateServiceResponseBodyResult setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

    }

}
