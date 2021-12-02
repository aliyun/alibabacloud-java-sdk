// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateSlbAPResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateSlbAPResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static CreateSlbAPResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSlbAPResponseBody self = new CreateSlbAPResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSlbAPResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateSlbAPResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CreateSlbAPResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSlbAPResponseBody setResult(CreateSlbAPResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateSlbAPResponseBodyResult getResult() {
        return this.result;
    }

    public CreateSlbAPResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSlbAPResponseBodyResult extends TeaModel {
        @NameInMap("SlbAPId")
        public Long slbAPId;

        public static CreateSlbAPResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateSlbAPResponseBodyResult self = new CreateSlbAPResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateSlbAPResponseBodyResult setSlbAPId(Long slbAPId) {
            this.slbAPId = slbAPId;
            return this;
        }
        public Long getSlbAPId() {
            return this.slbAPId;
        }

    }

}
