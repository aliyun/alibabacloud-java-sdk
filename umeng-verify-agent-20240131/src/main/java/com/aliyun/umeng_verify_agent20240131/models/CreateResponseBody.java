// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_verify_agent20240131.models;

import com.aliyun.tea.*;

public class CreateResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static CreateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResponseBody self = new CreateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateResponseBody setData(CreateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateResponseBodyData getData() {
        return this.data;
    }

    public CreateResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CreateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateResponseBodyData extends TeaModel {
        @NameInMap("schemeCode")
        public String schemeCode;

        public static CreateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateResponseBodyData self = new CreateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateResponseBodyData setSchemeCode(String schemeCode) {
            this.schemeCode = schemeCode;
            return this;
        }
        public String getSchemeCode() {
            return this.schemeCode;
        }

    }

}
