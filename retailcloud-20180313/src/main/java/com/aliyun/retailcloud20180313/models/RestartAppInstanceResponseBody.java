// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class RestartAppInstanceResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public Integer code;

    // errMsg
    @NameInMap("ErrMsg")
    public String errMsg;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // result
    @NameInMap("Result")
    public String result;

    public static RestartAppInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartAppInstanceResponseBody self = new RestartAppInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartAppInstanceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public RestartAppInstanceResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public RestartAppInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RestartAppInstanceResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
