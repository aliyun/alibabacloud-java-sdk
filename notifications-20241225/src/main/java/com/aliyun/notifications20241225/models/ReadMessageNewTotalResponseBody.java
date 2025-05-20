// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadMessageNewTotalResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Long data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ReadMessageNewTotalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadMessageNewTotalResponseBody self = new ReadMessageNewTotalResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadMessageNewTotalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReadMessageNewTotalResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public ReadMessageNewTotalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadMessageNewTotalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReadMessageNewTotalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
