// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StartParentPlatformResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>359*****374-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartParentPlatformResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartParentPlatformResponseBody self = new StartParentPlatformResponseBody();
        return TeaModel.build(map, self);
    }

    public StartParentPlatformResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public StartParentPlatformResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
