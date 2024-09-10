// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ReceiveFunctionTrialRewardByAliUidResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>94004FDB-27EC-5666-83D4-D0C5C624****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReceiveFunctionTrialRewardByAliUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReceiveFunctionTrialRewardByAliUidResponseBody self = new ReceiveFunctionTrialRewardByAliUidResponseBody();
        return TeaModel.build(map, self);
    }

    public ReceiveFunctionTrialRewardByAliUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
