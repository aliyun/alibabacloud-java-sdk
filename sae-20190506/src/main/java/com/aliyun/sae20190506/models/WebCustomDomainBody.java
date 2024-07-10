// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebCustomDomainBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public WebCustomDomain data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static WebCustomDomainBody build(java.util.Map<String, ?> map) throws Exception {
        WebCustomDomainBody self = new WebCustomDomainBody();
        return TeaModel.build(map, self);
    }

    public WebCustomDomainBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public WebCustomDomainBody setData(WebCustomDomain data) {
        this.data = data;
        return this;
    }
    public WebCustomDomain getData() {
        return this.data;
    }

    public WebCustomDomainBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public WebCustomDomainBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WebCustomDomainBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
