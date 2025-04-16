// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class ExportAnalysisTagDetailByTaskIdShrinkRequest extends TeaModel {
    @NameInMap("categories")
    public String categoriesShrink;

    @NameInMap("category")
    public String category;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a3d1c2ac-f086-4a21-9069-f5631542f5a2</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static ExportAnalysisTagDetailByTaskIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportAnalysisTagDetailByTaskIdShrinkRequest self = new ExportAnalysisTagDetailByTaskIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExportAnalysisTagDetailByTaskIdShrinkRequest setCategoriesShrink(String categoriesShrink) {
        this.categoriesShrink = categoriesShrink;
        return this;
    }
    public String getCategoriesShrink() {
        return this.categoriesShrink;
    }

    public ExportAnalysisTagDetailByTaskIdShrinkRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ExportAnalysisTagDetailByTaskIdShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
