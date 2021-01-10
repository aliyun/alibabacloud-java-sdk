// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDSTBizLogConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("BizLogConfigId")
    public Long bizLogConfigId;

    public static CreateDSTBizLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDSTBizLogConfigResponseBody self = new CreateDSTBizLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDSTBizLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDSTBizLogConfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateDSTBizLogConfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateDSTBizLogConfigResponseBody setBizLogConfigId(Long bizLogConfigId) {
        this.bizLogConfigId = bizLogConfigId;
        return this;
    }
    public Long getBizLogConfigId() {
        return this.bizLogConfigId;
    }

}
