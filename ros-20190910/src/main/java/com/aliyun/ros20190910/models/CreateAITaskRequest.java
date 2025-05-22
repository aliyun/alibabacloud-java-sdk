// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateAITaskRequest extends TeaModel {
    /**
     * <p>The input description for the AI task.</p>
     * <ul>
     * <li>When the task type is Generate Template, this parameter specifies the functionality of the template to be generated.</li>
     * <li>When the task type is FixTemplate, this parameter can describe how the template should be repaired.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>创建一台ECS，部署nignx服务</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The type of AI task. Values:</p>
     * <ul>
     * <li>GenerateTemplate: AI template generation</li>
     * <li>FixTemplate: AI template repair</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GenerateTemplate</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>When the task type is AI template repair, specify the original template that needs to be fixed or modified.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;}</p>
     */
    @NameInMap("Template")
    public String template;

    /**
     * <p>The type of the template to be generated or repaired. Default is ROS.</p>
     * 
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
