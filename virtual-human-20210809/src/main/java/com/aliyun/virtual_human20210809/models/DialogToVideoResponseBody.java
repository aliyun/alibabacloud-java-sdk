// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class DialogToVideoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message1")
    public String message1;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DialogToVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DialogToVideoResponseBody self = new DialogToVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public DialogToVideoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DialogToVideoResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DialogToVideoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DialogToVideoResponseBody setMessage1(String message1) {
        this.message1 = message1;
        return this;
    }
    public String getMessage1() {
        return this.message1;
    }

    public DialogToVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
