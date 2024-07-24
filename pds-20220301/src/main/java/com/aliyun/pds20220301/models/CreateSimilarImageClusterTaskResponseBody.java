// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateSimilarImageClusterTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>i:SimilarImageClustering-b67d53e7-2fe8-460f-9b95-1e93636923eb</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static CreateSimilarImageClusterTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSimilarImageClusterTaskResponseBody self = new CreateSimilarImageClusterTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSimilarImageClusterTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
