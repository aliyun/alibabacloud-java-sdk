// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20160316.models;

import com.aliyun.tea.*;

public class IsSasServiceOpeningResponse extends TeaModel {
    @NameInMap("data")
    @Validation(required = true)
    public Boolean data;

    @NameInMap("code")
    @Validation(required = true)
    public String code;

    @NameInMap("message")
    @Validation(required = true)
    public String message;

    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    public static IsSasServiceOpeningResponse build(java.util.Map<String, ?> map) throws Exception {
        IsSasServiceOpeningResponse self = new IsSasServiceOpeningResponse();
        return TeaModel.build(map, self);
    }

    public IsSasServiceOpeningResponse setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public IsSasServiceOpeningResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IsSasServiceOpeningResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IsSasServiceOpeningResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
