// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteSasContainerWebDefenseRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSasContainerWebDefenseRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSasContainerWebDefenseRuleResponseBody self = new DeleteSasContainerWebDefenseRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSasContainerWebDefenseRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
