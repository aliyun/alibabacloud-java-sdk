// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SaveAnalysisColumnRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Custom columns</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;variableName\&quot;:\&quot;requestId\&quot;,\&quot;variableTitle\&quot;:\&quot;RequestId\&quot;,\&quot;variableType\&quot;:\&quot;SYSTEM_BIND\&quot;,\&quot;isDefault\&quot;:true},{\&quot;variableName\&quot;:\&quot;eventTime\&quot;,\&quot;variableTitle\&quot;:\&quot;事件时间\&quot;,\&quot;variableType\&quot;:\&quot;SYSTEM_BIND\&quot;,\&quot;isDefault\&quot;:true},{\&quot;variableName\&quot;:\&quot;accountId\&quot;,\&quot;variableTitle\&quot;:\&quot;账号\&quot;,\&quot;variableType\&quot;:\&quot;SYSTEM_BIND\&quot;,\&quot;isDefault\&quot;:true},{\&quot;variableName\&quot;:\&quot;deviceId\&quot;,\&quot;variableTitle\&quot;:\&quot;设备ID\&quot;,\&quot;variableType\&quot;:\&quot;SYSTEM_BIND\&quot;,\&quot;isDefault\&quot;:true},{\&quot;variableName\&quot;:\&quot;eventCode\&quot;,\&quot;variableTitle\&quot;:\&quot;事件编码\&quot;,\&quot;variableType\&quot;:\&quot;SYSTEM_BIND\&quot;,\&quot;isDefault\&quot;:true},{\&quot;variableName\&quot;:\&quot;ip\&quot;,\&quot;variableTitle\&quot;:\&quot;IP\&quot;,\&quot;variableType\&quot;:\&quot;SYSTEM_BIND\&quot;,\&quot;isDefault\&quot;:true},{\&quot;variableName\&quot;:\&quot;score\&quot;,\&quot;variableTitle\&quot;:\&quot;分值\&quot;,\&quot;variableType\&quot;:\&quot;SYSTEM_BIND\&quot;,\&quot;isDefault\&quot;:true},{\&quot;variableName\&quot;:\&quot;tags\&quot;,\&quot;variableTitle\&quot;:\&quot;标签\&quot;,\&quot;variableType\&quot;:\&quot;SYSTEM_BIND\&quot;,\&quot;isDefault\&quot;:true},{\&quot;variableName\&quot;:\&quot;DEtest222\&quot;,\&quot;variableTitle\&quot;:\&quot;测试222\&quot;,\&quot;variableType\&quot;:\&quot;NATIVE\&quot;,\&quot;isDefault\&quot;:false}]</p>
     */
    @NameInMap("columns")
    public String columns;

    /**
     * <p>Region code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static SaveAnalysisColumnRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveAnalysisColumnRequest self = new SaveAnalysisColumnRequest();
        return TeaModel.build(map, self);
    }

    public SaveAnalysisColumnRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveAnalysisColumnRequest setColumns(String columns) {
        this.columns = columns;
        return this;
    }
    public String getColumns() {
        return this.columns;
    }

    public SaveAnalysisColumnRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
