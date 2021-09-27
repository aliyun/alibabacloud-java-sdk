// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class StopTensorboardResponseBody extends TeaModel {
    // Tensorboad Id
    @NameInMap("TensorboardId")
    public String tensorboardId;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static StopTensorboardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopTensorboardResponseBody self = new StopTensorboardResponseBody();
        return TeaModel.build(map, self);
    }

    public StopTensorboardResponseBody setTensorboardId(String tensorboardId) {
        this.tensorboardId = tensorboardId;
        return this;
    }
    public String getTensorboardId() {
        return this.tensorboardId;
    }

    public StopTensorboardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
