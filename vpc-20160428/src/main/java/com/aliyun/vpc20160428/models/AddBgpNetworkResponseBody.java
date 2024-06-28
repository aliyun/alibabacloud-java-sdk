// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddBgpNetworkResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9C7FA9D6-72E0-48A9-A9C3-2DA8569CD5EB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddBgpNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddBgpNetworkResponseBody self = new AddBgpNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public AddBgpNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
