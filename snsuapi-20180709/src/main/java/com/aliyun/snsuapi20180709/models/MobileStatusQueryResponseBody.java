// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709.models;

import com.aliyun.tea.*;

public class MobileStatusQueryResponseBody extends TeaModel {
    @NameInMap("ResultModule")
    public Boolean resultModule;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static MobileStatusQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MobileStatusQueryResponseBody self = new MobileStatusQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public MobileStatusQueryResponseBody setResultModule(Boolean resultModule) {
        this.resultModule = resultModule;
        return this;
    }
    public Boolean getResultModule() {
        return this.resultModule;
    }

    public MobileStatusQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MobileStatusQueryResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public MobileStatusQueryResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
