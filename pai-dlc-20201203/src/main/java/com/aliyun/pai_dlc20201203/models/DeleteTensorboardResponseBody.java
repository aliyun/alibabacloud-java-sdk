// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DeleteTensorboardResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The TensorBoard ID.</p>
     * 
     * <strong>example:</strong>
     * <p>tensorboard-20210114104214-vf9lowjt3pso</p>
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
