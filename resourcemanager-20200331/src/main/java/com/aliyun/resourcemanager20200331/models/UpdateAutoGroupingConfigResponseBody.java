// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateAutoGroupingConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C2CBCA30-C8DD-423E-B4AD-4FB694C9180C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAutoGroupingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoGroupingConfigResponseBody self = new UpdateAutoGroupingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAutoGroupingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
