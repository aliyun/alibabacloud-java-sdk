// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceVideoUrlResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Url")
    @Validation(required = true)
    public String url;

    @NameInMap("OutProtocol")
    @Validation(required = true)
    public String outProtocol;

    public static GetDeviceVideoUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceVideoUrlResponse self = new GetDeviceVideoUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceVideoUrlResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceVideoUrlResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceVideoUrlResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceVideoUrlResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public GetDeviceVideoUrlResponse setOutProtocol(String outProtocol) {
        this.outProtocol = outProtocol;
        return this;
    }
    public String getOutProtocol() {
        return this.outProtocol;
    }

}
