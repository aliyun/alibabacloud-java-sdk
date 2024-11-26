// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class GetDiagnosisResultResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Object data;

    @NameInMap("msg")
    public String msg;

    @NameInMap("requestId")
    public String requestId;

    public static GetDiagnosisResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDiagnosisResultResponseBody self = new GetDiagnosisResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDiagnosisResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDiagnosisResultResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public GetDiagnosisResultResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetDiagnosisResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
