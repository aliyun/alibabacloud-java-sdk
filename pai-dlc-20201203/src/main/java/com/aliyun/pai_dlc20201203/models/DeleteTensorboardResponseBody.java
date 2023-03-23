// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DeleteTensorboardResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Tensorboad Id</p>
     */
    @NameInMap("TensorboardId")
    public String tensorboardId;

    public static DeleteTensorboardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTensorboardResponseBody self = new DeleteTensorboardResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTensorboardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteTensorboardResponseBody setTensorboardId(String tensorboardId) {
        this.tensorboardId = tensorboardId;
        return this;
    }
    public String getTensorboardId() {
        return this.tensorboardId;
    }

}
