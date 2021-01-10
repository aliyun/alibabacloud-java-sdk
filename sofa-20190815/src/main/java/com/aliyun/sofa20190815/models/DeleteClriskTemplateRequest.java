// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteClriskTemplateRequest extends TeaModel {
    @NameInMap("TemplateCode")
    public String templateCode;

    public static DeleteClriskTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClriskTemplateRequest self = new DeleteClriskTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClriskTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
