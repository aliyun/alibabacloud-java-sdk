// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class SyncCatalogsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3238****739092996</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SyncCatalogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncCatalogsResponseBody self = new SyncCatalogsResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncCatalogsResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SyncCatalogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
