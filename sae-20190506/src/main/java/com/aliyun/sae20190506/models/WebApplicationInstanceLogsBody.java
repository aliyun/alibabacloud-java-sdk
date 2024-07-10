// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebApplicationInstanceLogsBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeInstanceLogsOutput data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static WebApplicationInstanceLogsBody build(java.util.Map<String, ?> map) throws Exception {
        WebApplicationInstanceLogsBody self = new WebApplicationInstanceLogsBody();
        return TeaModel.build(map, self);
    }

    public WebApplicationInstanceLogsBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public WebApplicationInstanceLogsBody setData(DescribeInstanceLogsOutput data) {
        this.data = data;
        return this;
    }
    public DescribeInstanceLogsOutput getData() {
        return this.data;
    }

    public WebApplicationInstanceLogsBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public WebApplicationInstanceLogsBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WebApplicationInstanceLogsBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
