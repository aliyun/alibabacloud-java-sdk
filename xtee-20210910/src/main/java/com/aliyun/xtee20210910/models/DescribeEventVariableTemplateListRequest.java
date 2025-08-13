// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventVariableTemplateListRequest extends TeaModel {
    /**
     * <p>Sets the language type for the request and response messages. The default value is <strong>zh</strong>. Values: </p>
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
     * <p>Input parameters, separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>age,ip</p>
     */
    @NameInMap("inputs")
    public String inputs;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Template code.</p>
     * 
     * <strong>example:</strong>
     * <p>register</p>
     */
    @NameInMap("templateCode")
    public String templateCode;

    /**
     * <p>Template type.</p>
     * 
     * <strong>example:</strong>
     * <p>NATIVE</p>
     */
    @NameInMap("type")
    public String type;

    public static DescribeEventVariableTemplateListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventVariableTemplateListRequest self = new DescribeEventVariableTemplateListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventVariableTemplateListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeEventVariableTemplateListRequest setInputs(String inputs) {
        this.inputs = inputs;
        return this;
    }
    public String getInputs() {
        return this.inputs;
    }

    public DescribeEventVariableTemplateListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeEventVariableTemplateListRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public DescribeEventVariableTemplateListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
