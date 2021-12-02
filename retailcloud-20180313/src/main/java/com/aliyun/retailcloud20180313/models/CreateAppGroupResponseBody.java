// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateAppGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateAppGroupResponseBodyResult result;

    public static CreateAppGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppGroupResponseBody self = new CreateAppGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateAppGroupResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CreateAppGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppGroupResponseBody setResult(CreateAppGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateAppGroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateAppGroupResponseBodyResult extends TeaModel {
        @NameInMap("AppGroupId")
        public Long appGroupId;

        public static CreateAppGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAppGroupResponseBodyResult self = new CreateAppGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAppGroupResponseBodyResult setAppGroupId(Long appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public Long getAppGroupId() {
            return this.appGroupId;
        }

    }

}
