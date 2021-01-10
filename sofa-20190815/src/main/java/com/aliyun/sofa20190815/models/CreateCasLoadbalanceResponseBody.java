// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasLoadbalanceResponseBody extends TeaModel {
    @NameInMap("LoadbalanceSequences")
    public java.util.List<String> loadbalanceSequences;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateCasLoadbalanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCasLoadbalanceResponseBody self = new CreateCasLoadbalanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCasLoadbalanceResponseBody setLoadbalanceSequences(java.util.List<String> loadbalanceSequences) {
        this.loadbalanceSequences = loadbalanceSequences;
        return this;
    }
    public java.util.List<String> getLoadbalanceSequences() {
        return this.loadbalanceSequences;
    }

    public CreateCasLoadbalanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCasLoadbalanceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateCasLoadbalanceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
