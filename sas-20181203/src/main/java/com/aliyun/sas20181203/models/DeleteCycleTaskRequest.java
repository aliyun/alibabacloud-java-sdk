// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteCycleTaskRequest extends TeaModel {
    /**
     * <p>The ID of the task configuration.</p>
     * <br>
     * <p>>  You can call the [DescribeCycleTaskList](~~DescribeCycleTaskList~~) operation to query the IDs of task configurations.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    public static DeleteCycleTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCycleTaskRequest self = new DeleteCycleTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCycleTaskRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

}
