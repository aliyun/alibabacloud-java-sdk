// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateAITaskRequest extends TeaModel {
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>GenerateTemplate</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <strong>example:</strong>
     * <p>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;}</p>
     */
    @NameInMap("Template")
    public String template;

    /**
     * <strong>example:</strong>
     * <p>ROS</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static CreateAITaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAITaskRequest self = new CreateAITaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateAITaskRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public CreateAITaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public CreateAITaskRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public CreateAITaskRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
