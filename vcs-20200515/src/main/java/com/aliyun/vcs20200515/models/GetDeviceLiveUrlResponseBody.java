// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceLiveUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("OutProtocol")
    public String outProtocol;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StreamType")
    public Long streamType;

    @NameInMap("Url")
    public String url;

    public static GetDeviceLiveUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceLiveUrlResponseBody self = new GetDeviceLiveUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceLiveUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceLiveUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceLiveUrlResponseBody setOutProtocol(String outProtocol) {
        this.outProtocol = outProtocol;
        return this;
    }
    public String getOutProtocol() {
        return this.outProtocol;
    }

    public GetDeviceLiveUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceLiveUrlResponseBody setStreamType(Long streamType) {
        this.streamType = streamType;
        return this;
    }
    public Long getStreamType() {
        return this.streamType;
    }

    public GetDeviceLiveUrlResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
