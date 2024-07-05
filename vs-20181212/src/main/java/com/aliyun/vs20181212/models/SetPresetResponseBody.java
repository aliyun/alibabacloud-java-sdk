// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class SetPresetResponseBody extends TeaModel {
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

    public static SetPresetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetPresetResponseBody self = new SetPresetResponseBody();
        return TeaModel.build(map, self);
    }

    public SetPresetResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SetPresetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
