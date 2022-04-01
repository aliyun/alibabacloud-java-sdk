// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class BooleanResponse extends TeaModel {
    // code
    @NameInMap("code")
    public String code;

    // data
    @NameInMap("data")
    public Boolean data;

    // message
    @NameInMap("message")
    public String message;

    // requestId
    @NameInMap("requestId")
    public String requestId;

    // success
    @NameInMap("success")
    public Boolean success;

    public static BooleanResponse build(java.util.Map<String, ?> map) throws Exception {
        BooleanResponse self = new BooleanResponse();
        return TeaModel.build(map, self);
    }

    public BooleanResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BooleanResponse setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public BooleanResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BooleanResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BooleanResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
