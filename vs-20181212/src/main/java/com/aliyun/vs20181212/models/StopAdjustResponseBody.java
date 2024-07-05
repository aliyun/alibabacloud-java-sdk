// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopAdjustResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>348*****380-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopAdjustResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopAdjustResponseBody self = new StopAdjustResponseBody();
        return TeaModel.build(map, self);
    }

    public StopAdjustResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public StopAdjustResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
