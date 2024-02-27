// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_verify_agent20240131.models;

import com.aliyun.tea.*;

public class GetMobileWithTokenResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetMobileWithTokenResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetMobileWithTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMobileWithTokenResponseBody self = new GetMobileWithTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMobileWithTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMobileWithTokenResponseBody setData(GetMobileWithTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMobileWithTokenResponseBodyData getData() {
        return this.data;
    }

    public GetMobileWithTokenResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetMobileWithTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMobileWithTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMobileWithTokenResponseBodyData extends TeaModel {
        @NameInMap("mobile")
        public String mobile;

        public static GetMobileWithTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMobileWithTokenResponseBodyData self = new GetMobileWithTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMobileWithTokenResponseBodyData setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

    }

}
