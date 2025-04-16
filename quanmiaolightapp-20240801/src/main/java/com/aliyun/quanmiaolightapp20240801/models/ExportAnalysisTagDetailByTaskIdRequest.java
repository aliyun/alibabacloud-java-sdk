// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class ExportAnalysisTagDetailByTaskIdRequest extends TeaModel {
    @NameInMap("categories")
    public java.util.List<String> categories;

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

    public static ExportAnalysisTagDetailByTaskIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportAnalysisTagDetailByTaskIdRequest self = new ExportAnalysisTagDetailByTaskIdRequest();
        return TeaModel.build(map, self);
    }

    public ExportAnalysisTagDetailByTaskIdRequest setCategories(java.util.List<String> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<String> getCategories() {
        return this.categories;
    }

    public ExportAnalysisTagDetailByTaskIdRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ExportAnalysisTagDetailByTaskIdRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
