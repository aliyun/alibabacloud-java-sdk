// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class GetModelOutputContentDetectResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>5d85cd38-03b2-49fd-86b2-be85c4b13215</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetModelOutputContentDetectResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModelOutputContentDetectResultRequest self = new GetModelOutputContentDetectResultRequest();
        return TeaModel.build(map, self);
    }

    public GetModelOutputContentDetectResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetModelOutputContentDetectResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
