// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskRuleCyclesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Cycles")
    public java.util.List<String> cycles;

    public static ListClriskRuleCyclesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClriskRuleCyclesResponseBody self = new ListClriskRuleCyclesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClriskRuleCyclesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClriskRuleCyclesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListClriskRuleCyclesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListClriskRuleCyclesResponseBody setCycles(java.util.List<String> cycles) {
        this.cycles = cycles;
        return this;
    }
    public java.util.List<String> getCycles() {
        return this.cycles;
    }

}
