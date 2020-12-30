// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709.models;

import com.aliyun.tea.*;

public class MobileStopSpeedUpResponseBody extends TeaModel {
    @NameInMap("ResultModule")
    public Boolean resultModule;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static MobileStopSpeedUpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MobileStopSpeedUpResponseBody self = new MobileStopSpeedUpResponseBody();
        return TeaModel.build(map, self);
    }

    public MobileStopSpeedUpResponseBody setResultModule(Boolean resultModule) {
        this.resultModule = resultModule;
        return this;
    }
    public Boolean getResultModule() {
        return this.resultModule;
    }

    public MobileStopSpeedUpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MobileStopSpeedUpResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public MobileStopSpeedUpResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
