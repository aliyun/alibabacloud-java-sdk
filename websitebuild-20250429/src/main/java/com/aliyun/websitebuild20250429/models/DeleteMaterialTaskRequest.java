// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteMaterialTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    public static DeleteMaterialTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaterialTaskRequest self = new DeleteMaterialTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMaterialTaskRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

}
