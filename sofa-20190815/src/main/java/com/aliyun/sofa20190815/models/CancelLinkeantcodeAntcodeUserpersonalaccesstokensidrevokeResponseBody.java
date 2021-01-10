// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeResponseBody extends TeaModel {
    @NameInMap("Status")
    public Boolean status;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public Boolean data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeResponseBody self = new CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
