// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUserlimitsettingsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("LimitRateKbytesPerSec")
    public Long limitRateKbytesPerSec;

    @NameInMap("LimitReqPerSec")
    public Long limitReqPerSec;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    public static UpdateLinkeantcodeAntcodeUserlimitsettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUserlimitsettingsResponseBody self = new UpdateLinkeantcodeAntcodeUserlimitsettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUserlimitsettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeantcodeAntcodeUserlimitsettingsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeantcodeAntcodeUserlimitsettingsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeantcodeAntcodeUserlimitsettingsResponseBody setLimitRateKbytesPerSec(Long limitRateKbytesPerSec) {
        this.limitRateKbytesPerSec = limitRateKbytesPerSec;
        return this;
    }
    public Long getLimitRateKbytesPerSec() {
        return this.limitRateKbytesPerSec;
    }

    public UpdateLinkeantcodeAntcodeUserlimitsettingsResponseBody setLimitReqPerSec(Long limitReqPerSec) {
        this.limitReqPerSec = limitReqPerSec;
        return this;
    }
    public Long getLimitReqPerSec() {
        return this.limitReqPerSec;
    }

    public UpdateLinkeantcodeAntcodeUserlimitsettingsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

}
