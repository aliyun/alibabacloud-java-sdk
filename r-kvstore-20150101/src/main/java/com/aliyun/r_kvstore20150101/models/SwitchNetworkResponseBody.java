// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class SwitchNetworkResponseBody extends TeaModel {
    /**
     * <p>Switches the network type of an ApsaraDB for Redis instance from classic network to Virtual Private Cloud (VPC).</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Specifies whether to retain the original endpoint for the classic network after you switch the instance from classic network to VPC. Valid values:</p>
     * <br>
     * <p>*   **True**: retains the original endpoint.</p>
     * <p>*   **False**: does not retain the original endpoint. This is the default value.</p>
     * <br>
     * <p>>  This parameter can be used only when the network type of the instance is classic network.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static SwitchNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchNetworkResponseBody self = new SwitchNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SwitchNetworkResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
