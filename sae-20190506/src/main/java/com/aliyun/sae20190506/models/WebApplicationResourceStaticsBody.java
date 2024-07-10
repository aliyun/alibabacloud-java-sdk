// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebApplicationResourceStaticsBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeWebAppStaticsOutput data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static WebApplicationResourceStaticsBody build(java.util.Map<String, ?> map) throws Exception {
        WebApplicationResourceStaticsBody self = new WebApplicationResourceStaticsBody();
        return TeaModel.build(map, self);
    }

    public WebApplicationResourceStaticsBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public WebApplicationResourceStaticsBody setData(DescribeWebAppStaticsOutput data) {
        this.data = data;
        return this;
    }
    public DescribeWebAppStaticsOutput getData() {
        return this.data;
    }

    public WebApplicationResourceStaticsBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public WebApplicationResourceStaticsBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WebApplicationResourceStaticsBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
