// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateTagRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174952ab-9825-4cc9-a5e2-de82d7fa4cdd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the script.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0fe7f71c-8771-42ef-9bb1-19aa16ae7120</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The tag group name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>目标学历</p>
     */
    @NameInMap("TagGroup")
    public String tagGroup;

    /**
     * <p>The tag name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>研究生</p>
     */
    @NameInMap("TagName")
    public String tagName;

    public static CreateTagRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTagRequest self = new CreateTagRequest();
        return TeaModel.build(map, self);
    }

    public CreateTagRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTagRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public CreateTagRequest setTagGroup(String tagGroup) {
        this.tagGroup = tagGroup;
        return this;
    }
    public String getTagGroup() {
        return this.tagGroup;
    }

    public CreateTagRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

}
