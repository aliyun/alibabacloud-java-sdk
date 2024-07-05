// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeletePresetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>348*****380-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>F18FD685-B194-4489-9609-F80A9490A258</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePresetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePresetResponseBody self = new DeletePresetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePresetResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeletePresetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
