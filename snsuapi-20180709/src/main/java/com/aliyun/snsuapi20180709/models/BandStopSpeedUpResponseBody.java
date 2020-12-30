// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709.models;

import com.aliyun.tea.*;

public class BandStopSpeedUpResponseBody extends TeaModel {
    @NameInMap("ResultModule")
    public Boolean resultModule;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static BandStopSpeedUpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BandStopSpeedUpResponseBody self = new BandStopSpeedUpResponseBody();
        return TeaModel.build(map, self);
    }

    public BandStopSpeedUpResponseBody setResultModule(Boolean resultModule) {
        this.resultModule = resultModule;
        return this;
    }
    public Boolean getResultModule() {
        return this.resultModule;
    }

    public BandStopSpeedUpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BandStopSpeedUpResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BandStopSpeedUpResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
