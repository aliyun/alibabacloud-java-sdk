// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreatePersistentVolumeResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreatePersistentVolumeResponseBodyResult result;

    public static CreatePersistentVolumeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePersistentVolumeResponseBody self = new CreatePersistentVolumeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePersistentVolumeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreatePersistentVolumeResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CreatePersistentVolumeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePersistentVolumeResponseBody setResult(CreatePersistentVolumeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreatePersistentVolumeResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreatePersistentVolumeResponseBodyResult extends TeaModel {
        @NameInMap("PersistentVolumeId")
        public Long persistentVolumeId;

        public static CreatePersistentVolumeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreatePersistentVolumeResponseBodyResult self = new CreatePersistentVolumeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreatePersistentVolumeResponseBodyResult setPersistentVolumeId(Long persistentVolumeId) {
            this.persistentVolumeId = persistentVolumeId;
            return this;
        }
        public Long getPersistentVolumeId() {
            return this.persistentVolumeId;
        }

    }

}
