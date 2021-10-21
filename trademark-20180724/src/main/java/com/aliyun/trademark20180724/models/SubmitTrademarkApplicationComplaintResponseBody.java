// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SubmitTrademarkApplicationComplaintResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitTrademarkApplicationComplaintResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTrademarkApplicationComplaintResponseBody self = new SubmitTrademarkApplicationComplaintResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTrademarkApplicationComplaintResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
