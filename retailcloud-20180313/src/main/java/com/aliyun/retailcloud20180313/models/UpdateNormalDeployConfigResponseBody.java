// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class UpdateNormalDeployConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateNormalDeployConfigResponseBodyResult result;

    public static UpdateNormalDeployConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNormalDeployConfigResponseBody self = new UpdateNormalDeployConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNormalDeployConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateNormalDeployConfigResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public UpdateNormalDeployConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateNormalDeployConfigResponseBody setResult(UpdateNormalDeployConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateNormalDeployConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateNormalDeployConfigResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static UpdateNormalDeployConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateNormalDeployConfigResponseBodyResult self = new UpdateNormalDeployConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateNormalDeployConfigResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
