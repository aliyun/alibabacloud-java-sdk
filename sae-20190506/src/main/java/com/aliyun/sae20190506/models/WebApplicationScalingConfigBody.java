// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebApplicationScalingConfigBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public WebScalingConfig data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static WebApplicationScalingConfigBody build(java.util.Map<String, ?> map) throws Exception {
        WebApplicationScalingConfigBody self = new WebApplicationScalingConfigBody();
        return TeaModel.build(map, self);
    }

    public WebApplicationScalingConfigBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public WebApplicationScalingConfigBody setData(WebScalingConfig data) {
        this.data = data;
        return this;
    }
    public WebScalingConfig getData() {
        return this.data;
    }

    public WebApplicationScalingConfigBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public WebApplicationScalingConfigBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WebApplicationScalingConfigBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
