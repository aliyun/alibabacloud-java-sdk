// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class StartTensorboardResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>tensorboard-20210114104214-vf9lowjt3pso</p>
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
