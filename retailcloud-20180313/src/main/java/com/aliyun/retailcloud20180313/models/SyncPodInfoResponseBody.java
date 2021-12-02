// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class SyncPodInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public SyncPodInfoResponseBodyResult result;

    public static SyncPodInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncPodInfoResponseBody self = new SyncPodInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncPodInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SyncPodInfoResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public SyncPodInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncPodInfoResponseBody setResult(SyncPodInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SyncPodInfoResponseBodyResult getResult() {
        return this.result;
    }

    public static class SyncPodInfoResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static SyncPodInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SyncPodInfoResponseBodyResult self = new SyncPodInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SyncPodInfoResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
