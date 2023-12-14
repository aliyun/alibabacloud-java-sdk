// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddSasContainerWebDefenseRuleResponseBody extends TeaModel {
    /**
     * <p>The unique value of the created rule.</p>
     */
    @NameInMap("Data")
    public Long data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddSasContainerWebDefenseRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSasContainerWebDefenseRuleResponseBody self = new AddSasContainerWebDefenseRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSasContainerWebDefenseRuleResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public AddSasContainerWebDefenseRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
