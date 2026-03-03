// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpCommonResult extends TeaModel {
    @NameInMap("data")
    public Boolean data;

    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static PdpCommonResult build(java.util.Map<String, ?> map) throws Exception {
        PdpCommonResult self = new PdpCommonResult();
        return TeaModel.build(map, self);
    }

    public PdpCommonResult setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public PdpCommonResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
