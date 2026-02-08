// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteMaterialTaskShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskIds")
    public String taskIdsShrink;

    public static DeleteMaterialTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaterialTaskShrinkRequest self = new DeleteMaterialTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMaterialTaskShrinkRequest setTaskIdsShrink(String taskIdsShrink) {
        this.taskIdsShrink = taskIdsShrink;
        return this;
    }
    public String getTaskIdsShrink() {
        return this.taskIdsShrink;
    }

}
