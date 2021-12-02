// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreatePersistentVolumeClaimResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreatePersistentVolumeClaimResponseBodyResult result;

    public static CreatePersistentVolumeClaimResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePersistentVolumeClaimResponseBody self = new CreatePersistentVolumeClaimResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePersistentVolumeClaimResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreatePersistentVolumeClaimResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CreatePersistentVolumeClaimResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePersistentVolumeClaimResponseBody setResult(CreatePersistentVolumeClaimResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreatePersistentVolumeClaimResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreatePersistentVolumeClaimResponseBodyResult extends TeaModel {
        @NameInMap("PersistentVolumeClaimId")
        public Long persistentVolumeClaimId;

        public static CreatePersistentVolumeClaimResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreatePersistentVolumeClaimResponseBodyResult self = new CreatePersistentVolumeClaimResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreatePersistentVolumeClaimResponseBodyResult setPersistentVolumeClaimId(Long persistentVolumeClaimId) {
            this.persistentVolumeClaimId = persistentVolumeClaimId;
            return this;
        }
        public Long getPersistentVolumeClaimId() {
            return this.persistentVolumeClaimId;
        }

    }

}
