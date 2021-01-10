// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskTemplateCycleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Cycles")
    public java.util.List<String> cycles;

    public static ListClriskTemplateCycleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClriskTemplateCycleResponseBody self = new ListClriskTemplateCycleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClriskTemplateCycleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClriskTemplateCycleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListClriskTemplateCycleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListClriskTemplateCycleResponseBody setCycles(java.util.List<String> cycles) {
        this.cycles = cycles;
        return this;
    }
    public java.util.List<String> getCycles() {
        return this.cycles;
    }

}
