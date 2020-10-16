// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceLiveUrlResponse extends TeaModel {
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

    @NameInMap("StreamType")
    @Validation(required = true)
    public Integer streamType;

    public static GetDeviceLiveUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceLiveUrlResponse self = new GetDeviceLiveUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceLiveUrlResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceLiveUrlResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceLiveUrlResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceLiveUrlResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public GetDeviceLiveUrlResponse setOutProtocol(String outProtocol) {
        this.outProtocol = outProtocol;
        return this;
    }
    public String getOutProtocol() {
        return this.outProtocol;
    }

    public GetDeviceLiveUrlResponse setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

}
