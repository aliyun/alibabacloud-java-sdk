// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsSgRelationSwitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Resp")
    public String resp;

    public static GetMsSgRelationSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMsSgRelationSwitchResponseBody self = new GetMsSgRelationSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMsSgRelationSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMsSgRelationSwitchResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMsSgRelationSwitchResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetMsSgRelationSwitchResponseBody setResp(String resp) {
        this.resp = resp;
        return this;
    }
    public String getResp() {
        return this.resp;
    }

}
