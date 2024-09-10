// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddSasContainerWebDefenseRuleResponseBody extends TeaModel {
    /**
     * <p>The unique value of the created rule.</p>
     * 
     * <strong>example:</strong>
     * <p>200634</p>
     */
    @NameInMap("Data")
    public Long data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8B4B6E6D-B0B0-5F05-A14E-82917D9648EE</p>
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
