// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventVariableTemplateBindRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages. Default value is <strong>zh</strong>. Values:</p>
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
     * <p>Input parameters, separated by commas if multiple.</p>
     * <p>This parameter is required.</p>
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
     * <p>Type</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NATIVE</p>
     */
    @NameInMap("type")
    public String type;

    public static DescribeEventVariableTemplateBindRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventVariableTemplateBindRequest self = new DescribeEventVariableTemplateBindRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventVariableTemplateBindRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeEventVariableTemplateBindRequest setInputs(String inputs) {
        this.inputs = inputs;
        return this;
    }
    public String getInputs() {
        return this.inputs;
    }

    public DescribeEventVariableTemplateBindRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeEventVariableTemplateBindRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public DescribeEventVariableTemplateBindRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
