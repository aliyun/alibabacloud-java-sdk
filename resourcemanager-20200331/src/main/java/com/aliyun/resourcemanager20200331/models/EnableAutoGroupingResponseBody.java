// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class EnableAutoGroupingResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DF5D5C52-7BD0-40E7-94C6-23A1505038A2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableAutoGroupingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableAutoGroupingResponseBody self = new EnableAutoGroupingResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableAutoGroupingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
