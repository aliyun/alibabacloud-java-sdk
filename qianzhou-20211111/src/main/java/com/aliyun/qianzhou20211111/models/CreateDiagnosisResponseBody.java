// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class CreateDiagnosisResponseBody extends TeaModel {
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public Object data;

    @NameInMap("requestId")
    public String requestId;

    public static CreateDiagnosisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosisResponseBody self = new CreateDiagnosisResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosisResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateDiagnosisResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public CreateDiagnosisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
