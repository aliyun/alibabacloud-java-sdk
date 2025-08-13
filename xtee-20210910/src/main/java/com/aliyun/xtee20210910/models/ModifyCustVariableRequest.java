// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyCustVariableRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values: </p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Condition value.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;currentId\&quot;:1,\&quot;deepCount\&quot;:0,\&quot;list\&quot;:[{\&quot;currentId\&quot;:2,\&quot;deepCount\&quot;:1,\&quot;left\&quot;:{\&quot;code\&quot;:\&quot;__hit_rules\&quot;,\&quot;fieldType\&quot;:\&quot;STRING\&quot;,\&quot;functionName\&quot;:\&quot;\&quot;,\&quot;hasRightVariable\&quot;:true,\&quot;name\&quot;:\&quot;hitRules\&quot;,\&quot;operatorCode\&quot;:\&quot;deNotInNameList\&quot;},\&quot;operatorCode\&quot;:\&quot;deNotInNameList\&quot;,\&quot;parentId\&quot;:1,\&quot;right\&quot;:{\&quot;code\&quot;:\&quot;\&quot;nl_Xcufc8wV6624\&quot;\&quot;,\&quot;name\&quot;:\&quot;nl_Xcufc8wV6624\&quot;,\&quot;rightVariableType\&quot;:\&quot;variable\&quot;}},{\&quot;currentId\&quot;:3,\&quot;deepCount\&quot;:1,\&quot;list\&quot;:[{\&quot;currentId\&quot;:4,\&quot;deepCount\&quot;:2,\&quot;left\&quot;:{\&quot;code\&quot;:\&quot;__v_safde\&quot;,\&quot;fieldType\&quot;:\&quot;DOUBLE\&quot;,\&quot;functionName\&quot;:\&quot;\&quot;,\&quot;hasRightVariable\&quot;:true,\&quot;name\&quot;:\&quot;score\&quot;,\&quot;operatorCode\&quot;:\&quot;equals\&quot;},\&quot;operatorCode\&quot;:\&quot;equals\&quot;,\&quot;parentId\&quot;:3,\&quot;right\&quot;:{\&quot;code\&quot;:\&quot;\&quot;99\&quot;\&quot;,\&quot;name\&quot;:\&quot;99\&quot;,\&quot;rightVariableType\&quot;:\&quot;constant\&quot;}},{\&quot;currentId\&quot;:5,\&quot;deepCount\&quot;:2,\&quot;left\&quot;:{\&quot;code\&quot;:\&quot;queryPhoneSimulatorInfo(deviceToken)?\&quot;,\&quot;fieldType\&quot;:\&quot;STRING\&quot;,\&quot;functionName\&quot;:\&quot;\&quot;,\&quot;hasRightVariable\&quot;:false,\&quot;name\&quot;:\&quot;<strong>device-test01</strong>\&quot;,\&quot;operatorCode\&quot;:\&quot;isNotEmptyWrapper\&quot;},\&quot;operatorCode\&quot;:\&quot;isNotEmptyWrapper\&quot;,\&quot;parentId\&quot;:3,\&quot;right\&quot;:{\&quot;functionName\&quot;:\&quot;\&quot;,\&quot;name\&quot;:\&quot;\&quot;,\&quot;rightVariableType\&quot;:\&quot;constant\&quot;}}],\&quot;parentId\&quot;:1,\&quot;relationship\&quot;:\&quot;and\&quot;}],\&quot;parentId\&quot;:0,\&quot;relationship\&quot;:\&quot;and\&quot;}</p>
     */
    @NameInMap("condition")
    public String condition;

    /**
     * <p>Data version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("dataVersion")
    public Long dataVersion;

    /**
     * <p>Description information.</p>
     * 
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Event code.</p>
     * 
     * <strong>example:</strong>
     * <p>account_abuse_pro,account_abuse</p>
     */
    @NameInMap("eventCodes")
    public String eventCodes;

    /**
     * <p>Variable ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>376773</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>Variable name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dxkkLw8fe18</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Output</p>
     * 
     * <strong>example:</strong>
     * <p>STRING</p>
     */
    @NameInMap("outputs")
    public String outputs;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static ModifyCustVariableRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustVariableRequest self = new ModifyCustVariableRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCustVariableRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyCustVariableRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public ModifyCustVariableRequest setDataVersion(Long dataVersion) {
        this.dataVersion = dataVersion;
        return this;
    }
    public Long getDataVersion() {
        return this.dataVersion;
    }

    public ModifyCustVariableRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyCustVariableRequest setEventCodes(String eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public String getEventCodes() {
        return this.eventCodes;
    }

    public ModifyCustVariableRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyCustVariableRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyCustVariableRequest setOutputs(String outputs) {
        this.outputs = outputs;
        return this;
    }
    public String getOutputs() {
        return this.outputs;
    }

    public ModifyCustVariableRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
