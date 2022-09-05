// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class TaskTemplateConfig extends TeaModel {
    @NameInMap("Exif")
    public java.util.Map<String, String> exif;

    @NameInMap("ResourceKey")
    public String resourceKey;

    @NameInMap("SelectQuestions")
    public java.util.List<String> selectQuestions;

    @NameInMap("TemplateOptionMap")
    public java.util.Map<String, String> templateOptionMap;

    @NameInMap("TemplateRelationId")
    public String templateRelationId;

    public static TaskTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
        TaskTemplateConfig self = new TaskTemplateConfig();
        return TeaModel.build(map, self);
    }

    public TaskTemplateConfig setExif(java.util.Map<String, String> exif) {
        this.exif = exif;
        return this;
    }
    public java.util.Map<String, String> getExif() {
        return this.exif;
    }

    public TaskTemplateConfig setResourceKey(String resourceKey) {
        this.resourceKey = resourceKey;
        return this;
    }
    public String getResourceKey() {
        return this.resourceKey;
    }

    public TaskTemplateConfig setSelectQuestions(java.util.List<String> selectQuestions) {
        this.selectQuestions = selectQuestions;
        return this;
    }
    public java.util.List<String> getSelectQuestions() {
        return this.selectQuestions;
    }

    public TaskTemplateConfig setTemplateOptionMap(java.util.Map<String, String> templateOptionMap) {
        this.templateOptionMap = templateOptionMap;
        return this;
    }
    public java.util.Map<String, String> getTemplateOptionMap() {
        return this.templateOptionMap;
    }

    public TaskTemplateConfig setTemplateRelationId(String templateRelationId) {
        this.templateRelationId = templateRelationId;
        return this;
    }
    public String getTemplateRelationId() {
        return this.templateRelationId;
    }

}
