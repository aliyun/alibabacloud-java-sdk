// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class OfflineRecallManagementServiceResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OfflineRecallManagementServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OfflineRecallManagementServiceResponseBody self = new OfflineRecallManagementServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OfflineRecallManagementServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
