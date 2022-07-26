// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class UpdateTensorboardResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TensorboardId")
    public String tensorboardId;

    public static UpdateTensorboardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTensorboardResponseBody self = new UpdateTensorboardResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTensorboardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTensorboardResponseBody setTensorboardId(String tensorboardId) {
        this.tensorboardId = tensorboardId;
        return this;
    }
    public String getTensorboardId() {
        return this.tensorboardId;
    }

}
