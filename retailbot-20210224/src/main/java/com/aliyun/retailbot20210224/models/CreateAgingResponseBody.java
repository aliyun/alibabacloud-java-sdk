// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CreateAgingResponseBody extends TeaModel {
    // 返回code
    @NameInMap("Code")
    public String code;

    // 创建的时效ID
    @NameInMap("Data")
    public Long data;

    // 返回信息
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功标示
    @NameInMap("Success")
    public Boolean success;

    public static CreateAgingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgingResponseBody self = new CreateAgingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAgingResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateAgingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAgingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAgingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
