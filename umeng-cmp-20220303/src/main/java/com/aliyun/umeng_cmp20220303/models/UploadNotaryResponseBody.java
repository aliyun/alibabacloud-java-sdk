// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_cmp20220303.models;

import com.aliyun.tea.*;

public class UploadNotaryResponseBody extends TeaModel {
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public String data;

    // Id of the request
    @NameInMap("msg")
    public String msg;

    @NameInMap("requestId")
    public String requestId;

    public static UploadNotaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadNotaryResponseBody self = new UploadNotaryResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadNotaryResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public UploadNotaryResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UploadNotaryResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public UploadNotaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
