// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class OfflineLaboratoryResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OfflineLaboratoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OfflineLaboratoryResponseBody self = new OfflineLaboratoryResponseBody();
        return TeaModel.build(map, self);
    }

    public OfflineLaboratoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
