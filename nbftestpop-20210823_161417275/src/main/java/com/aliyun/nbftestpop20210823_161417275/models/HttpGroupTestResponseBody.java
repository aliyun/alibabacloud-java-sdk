// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210823_161417275.models;

import com.aliyun.tea.*;

public class HttpGroupTestResponseBody extends TeaModel {
    @NameInMap("result")
    public String result;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    public static HttpGroupTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HttpGroupTestResponseBody self = new HttpGroupTestResponseBody();
        return TeaModel.build(map, self);
    }

    public HttpGroupTestResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public HttpGroupTestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HttpGroupTestResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public HttpGroupTestResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

}
