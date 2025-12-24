// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class CreatePlaybookRequest extends TeaModel {
    /**
     * <p>Description of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a new version</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Name of the playbook.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test09</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;: &quot;value1&quot;, &quot;key2&quot;: &quot;value2&quot;}</p>
     */
    @NameInMap("InputParams")
    public String inputParams;

    /**
     * <p>Language type for receiving messages. Values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>{&quot;result&quot;: &quot;success&quot;}</p>
     */
    @NameInMap("OutputParams")
    public String outputParams;

    /**
     * <p>Playbook TaskFlow type.</p>
     * <ul>
     * <li><strong>x6</strong> : x6</li>
     * <li><strong>bpmn</strong>: bpmn</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>x6</p>
     */
    @NameInMap("TaskflowType")
    public String taskflowType;

    public static CreatePlaybookRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePlaybookRequest self = new CreatePlaybookRequest();
        return TeaModel.build(map, self);
    }

    public CreatePlaybookRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePlaybookRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreatePlaybookRequest setInputParams(String inputParams) {
        this.inputParams = inputParams;
        return this;
    }
    public String getInputParams() {
        return this.inputParams;
    }

    public CreatePlaybookRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreatePlaybookRequest setOutputParams(String outputParams) {
        this.outputParams = outputParams;
        return this;
    }
    public String getOutputParams() {
        return this.outputParams;
    }

    public CreatePlaybookRequest setTaskflowType(String taskflowType) {
        this.taskflowType = taskflowType;
        return this;
    }
    public String getTaskflowType() {
        return this.taskflowType;
    }

}
