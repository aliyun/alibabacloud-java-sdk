// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventVariableTemplateListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("inputs")
    public String inputs;

    @NameInMap("regId")
    public String regId;

    @NameInMap("templateCode")
    public String templateCode;

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
