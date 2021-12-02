// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class AllocatePodConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public AllocatePodConfigResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static AllocatePodConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocatePodConfigResponseBody self = new AllocatePodConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocatePodConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AllocatePodConfigResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public AllocatePodConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllocatePodConfigResponseBody setResult(AllocatePodConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AllocatePodConfigResponseBodyResult getResult() {
        return this.result;
    }

    public AllocatePodConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AllocatePodConfigResponseBodyResult extends TeaModel {
        @NameInMap("ConfigData")
        public String configData;

        public static AllocatePodConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AllocatePodConfigResponseBodyResult self = new AllocatePodConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AllocatePodConfigResponseBodyResult setConfigData(String configData) {
            this.configData = configData;
            return this;
        }
        public String getConfigData() {
            return this.configData;
        }

    }

}
