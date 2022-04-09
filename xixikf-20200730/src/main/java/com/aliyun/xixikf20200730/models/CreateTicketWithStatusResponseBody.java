// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class CreateTicketWithStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Long data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateTicketWithStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketWithStatusResponseBody self = new CreateTicketWithStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTicketWithStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTicketWithStatusResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateTicketWithStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTicketWithStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTicketWithStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
