// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeServiceAppKeyResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public Boolean resultObject;

    @NameInMap("uccess")
    public Boolean uccess;

    public static DescribeServiceAppKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceAppKeyResponseBody self = new DescribeServiceAppKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceAppKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeServiceAppKeyResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeServiceAppKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeServiceAppKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceAppKeyResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

    public DescribeServiceAppKeyResponseBody setUccess(Boolean uccess) {
        this.uccess = uccess;
        return this;
    }
    public Boolean getUccess() {
        return this.uccess;
    }

}
