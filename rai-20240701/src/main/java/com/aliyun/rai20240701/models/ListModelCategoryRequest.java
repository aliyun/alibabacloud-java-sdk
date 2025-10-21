// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ListModelCategoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("ContentSafeImageSupported")
    public Integer contentSafeImageSupported;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("ContentSafeTextSupported")
    public Integer contentSafeTextSupported;

    /**
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("ModelCategoryName")
    public String modelCategoryName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ModelSource")
    public String modelSource;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("PromptAttackTextSupported")
    public Integer promptAttackTextSupported;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("SensitiveTopicTextSupported")
    public Integer sensitiveTopicTextSupported;

    public static ListModelCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelCategoryRequest self = new ListModelCategoryRequest();
        return TeaModel.build(map, self);
    }

    public ListModelCategoryRequest setContentSafeImageSupported(Integer contentSafeImageSupported) {
        this.contentSafeImageSupported = contentSafeImageSupported;
        return this;
    }
    public Integer getContentSafeImageSupported() {
        return this.contentSafeImageSupported;
    }

    public ListModelCategoryRequest setContentSafeTextSupported(Integer contentSafeTextSupported) {
        this.contentSafeTextSupported = contentSafeTextSupported;
        return this;
    }
    public Integer getContentSafeTextSupported() {
        return this.contentSafeTextSupported;
    }

    public ListModelCategoryRequest setModelCategoryName(String modelCategoryName) {
        this.modelCategoryName = modelCategoryName;
        return this;
    }
    public String getModelCategoryName() {
        return this.modelCategoryName;
    }

    public ListModelCategoryRequest setModelSource(String modelSource) {
        this.modelSource = modelSource;
        return this;
    }
    public String getModelSource() {
        return this.modelSource;
    }

    public ListModelCategoryRequest setPromptAttackTextSupported(Integer promptAttackTextSupported) {
        this.promptAttackTextSupported = promptAttackTextSupported;
        return this;
    }
    public Integer getPromptAttackTextSupported() {
        return this.promptAttackTextSupported;
    }

    public ListModelCategoryRequest setSensitiveTopicTextSupported(Integer sensitiveTopicTextSupported) {
        this.sensitiveTopicTextSupported = sensitiveTopicTextSupported;
        return this;
    }
    public Integer getSensitiveTopicTextSupported() {
        return this.sensitiveTopicTextSupported;
    }

}
