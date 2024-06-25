// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class OnlineLaboratoryResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8C27790E-CCA5-56BB-BA17-646295DEC0A2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnlineLaboratoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnlineLaboratoryResponseBody self = new OnlineLaboratoryResponseBody();
        return TeaModel.build(map, self);
    }

    public OnlineLaboratoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
