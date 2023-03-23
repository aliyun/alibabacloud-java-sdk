// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class StartTensorboardResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Tensorboad Id</p>
     */
    @NameInMap("TensorboardId")
    public String tensorboardId;

    public static StartTensorboardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartTensorboardResponseBody self = new StartTensorboardResponseBody();
        return TeaModel.build(map, self);
    }

    public StartTensorboardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartTensorboardResponseBody setTensorboardId(String tensorboardId) {
        this.tensorboardId = tensorboardId;
        return this;
    }
    public String getTensorboardId() {
        return this.tensorboardId;
    }

}
