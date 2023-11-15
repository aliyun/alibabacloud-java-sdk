// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class RecordBankBalanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static RecordBankBalanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecordBankBalanceResponseBody self = new RecordBankBalanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RecordBankBalanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecordBankBalanceResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
