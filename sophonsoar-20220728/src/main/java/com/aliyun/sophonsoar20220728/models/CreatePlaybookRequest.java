// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class CreatePlaybookRequest extends TeaModel {
    /**
     * <p>The description of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a new version</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the playbook.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test09</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The input configuration of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;key1\&quot;: \&quot;value1\&quot;, \&quot;key2\&quot;: \&quot;value2\&quot;}</p>
     */
    @NameInMap("InputParams")
    public String inputParams;

    /**
     * <p>The language of the messages to receive. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The output configuration of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;result\&quot;: \&quot;success\&quot;}</p>
     */
    @NameInMap("OutputParams")
    public String outputParams;

    /**
     * <p>The configuration format of the playbook.</p>
     * <ul>
     * <li><p><strong>xml</strong>: XML format.</p>
     * </li>
     * <li><p><strong>x6</strong>: JSON format.</p>
     * </li>
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
