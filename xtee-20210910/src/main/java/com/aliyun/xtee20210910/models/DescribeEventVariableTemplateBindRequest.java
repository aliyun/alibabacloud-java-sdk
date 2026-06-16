// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventVariableTemplateBindRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The input parameters. Separate multiple values with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>age,ip</p>
     */
    @NameInMap("inputs")
    public String inputs;

    /**
     * <p>The region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>The template code.</p>
     * 
     * <strong>example:</strong>
     * <p>register</p>
     */
    @NameInMap("templateCode")
    public String templateCode;

    /**
     * <p>The type.</p>
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
