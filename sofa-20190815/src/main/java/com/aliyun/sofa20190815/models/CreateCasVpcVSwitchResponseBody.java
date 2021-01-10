// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasVpcVSwitchResponseBody extends TeaModel {
    @NameInMap("VswitchSequence")
    public String vswitchSequence;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateCasVpcVSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCasVpcVSwitchResponseBody self = new CreateCasVpcVSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCasVpcVSwitchResponseBody setVswitchSequence(String vswitchSequence) {
        this.vswitchSequence = vswitchSequence;
        return this;
    }
    public String getVswitchSequence() {
        return this.vswitchSequence;
    }

    public CreateCasVpcVSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCasVpcVSwitchResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateCasVpcVSwitchResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
