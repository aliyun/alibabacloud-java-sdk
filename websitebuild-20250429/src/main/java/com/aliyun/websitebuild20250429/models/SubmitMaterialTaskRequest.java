// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SubmitMaterialTaskRequest extends TeaModel {
    /**
     * <p>The business group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("BizGroupId")
    public String bizGroupId;

    /**
     * <p>The task parameters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;brandName&quot;: &quot;Brand name&quot;,
     *     &quot;direction&quot;: &quot;HORIZONTAL&quot;,
     *     &quot;userPrompt&quot;: &quot;Design requirements&quot;
     * }</p>
     */
    @NameInMap("TaskParam")
    public String taskParam;

    /**
     * <p>The task type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IMAGE_LOGO</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static SubmitMaterialTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMaterialTaskRequest self = new SubmitMaterialTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMaterialTaskRequest setBizGroupId(String bizGroupId) {
        this.bizGroupId = bizGroupId;
        return this;
    }
    public String getBizGroupId() {
        return this.bizGroupId;
    }

    public SubmitMaterialTaskRequest setTaskParam(String taskParam) {
        this.taskParam = taskParam;
        return this;
    }
    public String getTaskParam() {
        return this.taskParam;
    }

    public SubmitMaterialTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
