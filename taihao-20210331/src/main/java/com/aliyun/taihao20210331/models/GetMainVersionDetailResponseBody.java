// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetMainVersionDetailResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public MainVersionMeta data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetMainVersionDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMainVersionDetailResponseBody self = new GetMainVersionDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMainVersionDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMainVersionDetailResponseBody setData(MainVersionMeta data) {
        this.data = data;
        return this;
    }
    public MainVersionMeta getData() {
        return this.data;
    }

    public GetMainVersionDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMainVersionDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMainVersionDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
