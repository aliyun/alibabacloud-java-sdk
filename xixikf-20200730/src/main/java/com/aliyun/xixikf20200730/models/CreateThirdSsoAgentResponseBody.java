// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class CreateThirdSsoAgentResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // 新创建的坐席id
    @NameInMap("Data")
    public Long data;

    // httpStatusCode
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    // message
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static CreateThirdSsoAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateThirdSsoAgentResponseBody self = new CreateThirdSsoAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateThirdSsoAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateThirdSsoAgentResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateThirdSsoAgentResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateThirdSsoAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateThirdSsoAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateThirdSsoAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
