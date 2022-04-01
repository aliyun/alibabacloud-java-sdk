// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateConfigResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public UpdateConfigResult data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static UpdateConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigResponseBody self = new UpdateConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateConfigResponseBody setData(UpdateConfigResult data) {
        this.data = data;
        return this;
    }
    public UpdateConfigResult getData() {
        return this.data;
    }

    public UpdateConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
