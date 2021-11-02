// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class SyncUnionOrderResponseBody extends TeaModel {
    @NameInMap("AliPayOrderId")
    public String aliPayOrderId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Boolean status;

    public static SyncUnionOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncUnionOrderResponseBody self = new SyncUnionOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncUnionOrderResponseBody setAliPayOrderId(String aliPayOrderId) {
        this.aliPayOrderId = aliPayOrderId;
        return this;
    }
    public String getAliPayOrderId() {
        return this.aliPayOrderId;
    }

    public SyncUnionOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SyncUnionOrderResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SyncUnionOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncUnionOrderResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
