// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class InitialTranscodeConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static InitialTranscodeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitialTranscodeConfigResponseBody self = new InitialTranscodeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public InitialTranscodeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitialTranscodeConfigResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
