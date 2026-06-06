// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetTaskExecutionStatisticsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EssayCorrectionTask</p>
     */
    @NameInMap("taskCode")
    public String taskCode;

    public static GetTaskExecutionStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskExecutionStatisticsRequest self = new GetTaskExecutionStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskExecutionStatisticsRequest setTaskCode(String taskCode) {
        this.taskCode = taskCode;
        return this;
    }
    public String getTaskCode() {
        return this.taskCode;
    }

}
