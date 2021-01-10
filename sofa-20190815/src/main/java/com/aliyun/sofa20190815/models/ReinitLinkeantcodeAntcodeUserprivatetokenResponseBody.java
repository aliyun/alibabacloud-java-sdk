// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReinitLinkeantcodeAntcodeUserprivatetokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("PrivateToken")
    public String privateToken;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    public static ReinitLinkeantcodeAntcodeUserprivatetokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReinitLinkeantcodeAntcodeUserprivatetokenResponseBody self = new ReinitLinkeantcodeAntcodeUserprivatetokenResponseBody();
        return TeaModel.build(map, self);
    }

    public ReinitLinkeantcodeAntcodeUserprivatetokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReinitLinkeantcodeAntcodeUserprivatetokenResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ReinitLinkeantcodeAntcodeUserprivatetokenResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ReinitLinkeantcodeAntcodeUserprivatetokenResponseBody setPrivateToken(String privateToken) {
        this.privateToken = privateToken;
        return this;
    }
    public String getPrivateToken() {
        return this.privateToken;
    }

    public ReinitLinkeantcodeAntcodeUserprivatetokenResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

}
