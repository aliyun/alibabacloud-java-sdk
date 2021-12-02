// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeletePersistentVolumeResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DeletePersistentVolumeResponseBodyResult result;

    public static DeletePersistentVolumeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePersistentVolumeResponseBody self = new DeletePersistentVolumeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePersistentVolumeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeletePersistentVolumeResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DeletePersistentVolumeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeletePersistentVolumeResponseBody setResult(DeletePersistentVolumeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeletePersistentVolumeResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeletePersistentVolumeResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static DeletePersistentVolumeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeletePersistentVolumeResponseBodyResult self = new DeletePersistentVolumeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeletePersistentVolumeResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
