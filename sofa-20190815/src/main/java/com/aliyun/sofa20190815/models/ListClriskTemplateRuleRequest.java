// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskTemplateRuleRequest extends TeaModel {
    @NameInMap("TemplateCode")
    public String templateCode;

    public static ListClriskTemplateRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClriskTemplateRuleRequest self = new ListClriskTemplateRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListClriskTemplateRuleRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
