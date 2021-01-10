// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskOdpsTemplateRequest extends TeaModel {
    @NameInMap("TemplateCode")
    public String templateCode;

    public static GetClriskOdpsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClriskOdpsTemplateRequest self = new GetClriskOdpsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetClriskOdpsTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
