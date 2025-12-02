// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class CreatePlaybookRequest extends TeaModel {
    /**
     * <p>Language type for receiving messages. Values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Description of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>waf ip block</p>
     */
    @NameInMap("PlaybookDescription")
    public String playbookDescription;

    /**
     * <p>Input parameter configuration of the playbook.</p>
     */
    @NameInMap("PlaybookInputConfigs")
    public java.util.List<FieldInputConfig> playbookInputConfigs;

    /**
     * <p>Name of the playbook, without special characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waftest</p>
     */
    @NameInMap("PlaybookName")
    public String playbookName;

    /**
     * <p>Output parameter configuration of the playbook.</p>
     */
    @NameInMap("PlaybookOutputConfigs")
    public java.util.List<FieldOutputConfig> playbookOutputConfigs;

    /**
     * <p>Type of input parameters for the playbook.</p>
     * <ul>
     * <li><strong>template-ip</strong>: IP entity.</li>
     * <li><strong>template-file</strong>: File entity.</li>
     * <li><strong>template-process</strong>: Process entity.</li>
     * <li><strong>template-host</strong>: Host entity.</li>
     * <li><strong>template-domain</strong>: Domain entity.</li>
     * <li><strong>template-container</strong>: Container entity.</li>
     * <li><strong>template-incident</strong>: Security incident.</li>
     * <li><strong>template-alert</strong>: Security alert.</li>
     * <li><strong>custom</strong>: Custom.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("PlaybookParamType")
    public String playbookParamType;

    /**
     * <p>Workflow of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;id&quot;:&quot;58d87b7d-28d9-4f0e-b135-4adc4f1a70e4&quot;,&quot;zIndex&quot;:1,&quot;data&quot;:{&quot;nodeType&quot;:&quot;startEvent&quot;,&quot;appType&quot;:&quot;basic&quot;,&quot;nodeName&quot;:&quot;start&quot;,&quot;icon&quot;:&quot;icon-circle&quot;,&quot;description&quot;:&quot;start&quot;},&quot;position&quot;:{&quot;x&quot;:-440,&quot;y&quot;:-170}},{&quot;id&quot;:&quot;5293c3f9-e1c9-4a49-b0eb-635067dc67e8&quot;,&quot;zIndex&quot;:1,&quot;data&quot;:{&quot;nodeType&quot;:&quot;sequenceFlow&quot;,&quot;appType&quot;:&quot;basic&quot;,&quot;icon&quot;:&quot;icon-upper-right-arrow&quot;,&quot;isRequired&quot;:true},&quot;source&quot;:{&quot;cell&quot;:&quot;58d87b7d-28d9-4f0e-b135-4adc4f1a70e4&quot;},&quot;target&quot;:{&quot;cell&quot;:&quot;f9d6d1f5-b0cd-45b6-93d0-02cd4b2a6fa2&quot;},&quot;vertices&quot;:[]},{&quot;id&quot;:&quot;317dd1be-2d20-460e-977e-1fc936ffb583&quot;,&quot;zIndex&quot;:1,&quot;data&quot;:{&quot;nodeType&quot;:&quot;endEvent&quot;,&quot;appType&quot;:&quot;basic&quot;,&quot;nodeName&quot;:&quot;end&quot;,&quot;icon&quot;:&quot;icon-radio-off-full&quot;,&quot;description&quot;:&quot;end&quot;},&quot;position&quot;:{&quot;x&quot;:-140,&quot;y&quot;:-170}},{&quot;id&quot;:&quot;f9d6d1f5-b0cd-45b6-93d0-02cd4b2a6fa2&quot;,&quot;zIndex&quot;:1,&quot;data&quot;:{&quot;isDebug&quot;:false,&quot;nodeType&quot;:&quot;action&quot;,&quot;appType&quot;:&quot;component&quot;,&quot;nodeName&quot;:&quot;data&quot;,&quot;valueData&quot;:{&quot;outputFields&quot;:&quot;[{\&quot;fieldName\&quot;:\&quot;ip\&quot;,\&quot;fieldValue\&quot;:\&quot;${event.ip}\&quot;}]&quot;},&quot;icon&quot;:&quot;<a href="https://img.alicdn.com/imgextra/i2/O1CN01NCKmL026m1z8o0DeN_!!6000000007703-2-tps-248-248.png%22,%22description%22:%22%22,%22advance%22:%7B%22inputParamMode%22:false,%22onError%22:%22stop_cur_flow%22,%22rspStatusType%22:3,%22rspStatusThreshold%22:0%7D,%22componentName%22:%22DataFormat%22,%22actionName%22:%22formatdata%22%7D,%22position%22:%7B%22x%22:-340,%22y%22:-185%7D%7D,%7B%22id%22:%221c7f0021-fb93-4478-b10f-af78dd5a69d6%22,%22zIndex%22:1,%22data%22:%7B%22nodeType%22:%22sequenceFlow%22,%22appType%22:%22basic%22,%22icon%22:%22icon-upper-right-arrow%22,%22isRequired%22:true%7D,%22source%22:%7B%22cell%22:%22f9d6d1f5-b0cd-45b6-93d0-02cd4b2a6fa2%22%7D,%22target%22:%7B%22cell%22:%22317dd1be-2d20-460e-977e-1fc936ffb583%22%7D,%22vertices%22:%5B%5D%7D%5D">https://img.alicdn.com/imgextra/i2/O1CN01NCKmL026m1z8o0DeN_!!6000000007703-2-tps-248-248.png&quot;,&quot;description&quot;:&quot;&quot;,&quot;advance&quot;:{&quot;inputParamMode&quot;:false,&quot;onError&quot;:&quot;stop_cur_flow&quot;,&quot;rspStatusType&quot;:3,&quot;rspStatusThreshold&quot;:0},&quot;componentName&quot;:&quot;DataFormat&quot;,&quot;actionName&quot;:&quot;formatdata&quot;},&quot;position&quot;:{&quot;x&quot;:-340,&quot;y&quot;:-185}},{&quot;id&quot;:&quot;1c7f0021-fb93-4478-b10f-af78dd5a69d6&quot;,&quot;zIndex&quot;:1,&quot;data&quot;:{&quot;nodeType&quot;:&quot;sequenceFlow&quot;,&quot;appType&quot;:&quot;basic&quot;,&quot;icon&quot;:&quot;icon-upper-right-arrow&quot;,&quot;isRequired&quot;:true},&quot;source&quot;:{&quot;cell&quot;:&quot;f9d6d1f5-b0cd-45b6-93d0-02cd4b2a6fa2&quot;},&quot;target&quot;:{&quot;cell&quot;:&quot;317dd1be-2d20-460e-977e-1fc936ffb583&quot;},&quot;vertices&quot;:[]}]</a></p>
     */
    @NameInMap("PlaybookTaskFlow")
    public String playbookTaskFlow;

    /**
     * <p>Resource directory member account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>170*********3093</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>In a copy scenario, the UUID of the source playbook needs to be filled in. When this parameter has a value, all other parameters except the playbook name and description are invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>1B5A9144-<strong><strong>-</strong></strong>-A466-****9D64AA99</p>
     */
    @NameInMap("SrcPlaybookUuid")
    public String srcPlaybookUuid;

    public static CreatePlaybookRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePlaybookRequest self = new CreatePlaybookRequest();
        return TeaModel.build(map, self);
    }

    public CreatePlaybookRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreatePlaybookRequest setPlaybookDescription(String playbookDescription) {
        this.playbookDescription = playbookDescription;
        return this;
    }
    public String getPlaybookDescription() {
        return this.playbookDescription;
    }

    public CreatePlaybookRequest setPlaybookInputConfigs(java.util.List<FieldInputConfig> playbookInputConfigs) {
        this.playbookInputConfigs = playbookInputConfigs;
        return this;
    }
    public java.util.List<FieldInputConfig> getPlaybookInputConfigs() {
        return this.playbookInputConfigs;
    }

    public CreatePlaybookRequest setPlaybookName(String playbookName) {
        this.playbookName = playbookName;
        return this;
    }
    public String getPlaybookName() {
        return this.playbookName;
    }

    public CreatePlaybookRequest setPlaybookOutputConfigs(java.util.List<FieldOutputConfig> playbookOutputConfigs) {
        this.playbookOutputConfigs = playbookOutputConfigs;
        return this;
    }
    public java.util.List<FieldOutputConfig> getPlaybookOutputConfigs() {
        return this.playbookOutputConfigs;
    }

    public CreatePlaybookRequest setPlaybookParamType(String playbookParamType) {
        this.playbookParamType = playbookParamType;
        return this;
    }
    public String getPlaybookParamType() {
        return this.playbookParamType;
    }

    public CreatePlaybookRequest setPlaybookTaskFlow(String playbookTaskFlow) {
        this.playbookTaskFlow = playbookTaskFlow;
        return this;
    }
    public String getPlaybookTaskFlow() {
        return this.playbookTaskFlow;
    }

    public CreatePlaybookRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public CreatePlaybookRequest setSrcPlaybookUuid(String srcPlaybookUuid) {
        this.srcPlaybookUuid = srcPlaybookUuid;
        return this;
    }
    public String getSrcPlaybookUuid() {
        return this.srcPlaybookUuid;
    }

}
