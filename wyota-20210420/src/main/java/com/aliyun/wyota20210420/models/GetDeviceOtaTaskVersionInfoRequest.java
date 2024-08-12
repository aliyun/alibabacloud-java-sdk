// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetDeviceOtaTaskVersionInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetDeviceOtaTaskVersionInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceOtaTaskVersionInfoRequest self = new GetDeviceOtaTaskVersionInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceOtaTaskVersionInfoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
