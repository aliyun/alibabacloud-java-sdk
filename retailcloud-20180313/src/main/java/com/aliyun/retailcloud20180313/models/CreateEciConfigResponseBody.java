// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateEciConfigResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public Integer code;

    // errMsg
    @NameInMap("ErrMsg")
    public String errMsg;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // result
    @NameInMap("Result")
    public CreateEciConfigResponseBodyResult result;

    public static CreateEciConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEciConfigResponseBody self = new CreateEciConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEciConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateEciConfigResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CreateEciConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEciConfigResponseBody setResult(CreateEciConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateEciConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateEciConfigResponseBodyResult extends TeaModel {
        // success
        @NameInMap("Success")
        public Boolean success;

        public static CreateEciConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateEciConfigResponseBodyResult self = new CreateEciConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateEciConfigResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
