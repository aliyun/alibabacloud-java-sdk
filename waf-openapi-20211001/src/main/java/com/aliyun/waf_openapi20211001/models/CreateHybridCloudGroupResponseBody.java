// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateHybridCloudGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the node group.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Data")
    public Long data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>48F7C7BA-0932-50EA-89AD-5B0E1***274</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateHybridCloudGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHybridCloudGroupResponseBody self = new CreateHybridCloudGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHybridCloudGroupResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateHybridCloudGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
