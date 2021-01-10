// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskTemplateCycleRequest extends TeaModel {
    @NameInMap("TemplateCode")
    public String templateCode;

    public static ListClriskTemplateCycleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClriskTemplateCycleRequest self = new ListClriskTemplateCycleRequest();
        return TeaModel.build(map, self);
    }

    public ListClriskTemplateCycleRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
