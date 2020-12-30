// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709.models;

import com.aliyun.tea.*;

public class BandStartSpeedUpResponseBody extends TeaModel {
    @NameInMap("ResultModule")
    public Boolean resultModule;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static BandStartSpeedUpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BandStartSpeedUpResponseBody self = new BandStartSpeedUpResponseBody();
        return TeaModel.build(map, self);
    }

    public BandStartSpeedUpResponseBody setResultModule(Boolean resultModule) {
        this.resultModule = resultModule;
        return this;
    }
    public Boolean getResultModule() {
        return this.resultModule;
    }

    public BandStartSpeedUpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BandStartSpeedUpResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BandStartSpeedUpResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
