// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskTemplateRequest extends TeaModel {
    @NameInMap("TemplateCode")
    public String templateCode;

    public static GetClriskTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClriskTemplateRequest self = new GetClriskTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetClriskTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
