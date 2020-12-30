// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709.models;

import com.aliyun.tea.*;

public class MobileStartSpeedUpResponseBody extends TeaModel {
    @NameInMap("ResultModule")
    public String resultModule;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static MobileStartSpeedUpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MobileStartSpeedUpResponseBody self = new MobileStartSpeedUpResponseBody();
        return TeaModel.build(map, self);
    }

    public MobileStartSpeedUpResponseBody setResultModule(String resultModule) {
        this.resultModule = resultModule;
        return this;
    }
    public String getResultModule() {
        return this.resultModule;
    }

    public MobileStartSpeedUpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MobileStartSpeedUpResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public MobileStartSpeedUpResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
