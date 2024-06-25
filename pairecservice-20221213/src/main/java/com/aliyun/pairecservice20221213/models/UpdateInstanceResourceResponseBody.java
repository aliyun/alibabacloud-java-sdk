// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateInstanceResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3AAA45F6-0798-5461-9360-81D133823CE7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateInstanceResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceResourceResponseBody self = new UpdateInstanceResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
