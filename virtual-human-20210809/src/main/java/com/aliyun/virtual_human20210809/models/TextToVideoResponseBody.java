// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class TextToVideoResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message1")
    public String message1;

    @NameInMap("Data")
    public String data;

    public static TextToVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TextToVideoResponseBody self = new TextToVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public TextToVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TextToVideoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TextToVideoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public TextToVideoResponseBody setMessage1(String message1) {
        this.message1 = message1;
        return this;
    }
    public String getMessage1() {
        return this.message1;
    }

    public TextToVideoResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
