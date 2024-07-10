// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebApplicationTrafficConfigBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public WebTrafficConfig data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static WebApplicationTrafficConfigBody build(java.util.Map<String, ?> map) throws Exception {
        WebApplicationTrafficConfigBody self = new WebApplicationTrafficConfigBody();
        return TeaModel.build(map, self);
    }

    public WebApplicationTrafficConfigBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public WebApplicationTrafficConfigBody setData(WebTrafficConfig data) {
        this.data = data;
        return this;
    }
    public WebTrafficConfig getData() {
        return this.data;
    }

    public WebApplicationTrafficConfigBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public WebApplicationTrafficConfigBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WebApplicationTrafficConfigBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
