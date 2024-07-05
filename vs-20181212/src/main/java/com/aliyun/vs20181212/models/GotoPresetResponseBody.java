// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class GotoPresetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>348*****380-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>30295DF1-1DC7-48BA-BE5A-D58E61EB2375</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GotoPresetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GotoPresetResponseBody self = new GotoPresetResponseBody();
        return TeaModel.build(map, self);
    }

    public GotoPresetResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GotoPresetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
