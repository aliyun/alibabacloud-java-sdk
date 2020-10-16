// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UploadImageResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    public static UploadImageResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadImageResponse self = new UploadImageResponse();
        return TeaModel.build(map, self);
    }

    public UploadImageResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadImageResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadImageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadImageResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
