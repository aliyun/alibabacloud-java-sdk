// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskTemplateContrastRequest extends TeaModel {
    @NameInMap("ModelCode")
    public String modelCode;

    @NameInMap("TemplateCode")
    public String templateCode;

    public static GetClriskTemplateContrastRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClriskTemplateContrastRequest self = new GetClriskTemplateContrastRequest();
        return TeaModel.build(map, self);
    }

    public GetClriskTemplateContrastRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public GetClriskTemplateContrastRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
