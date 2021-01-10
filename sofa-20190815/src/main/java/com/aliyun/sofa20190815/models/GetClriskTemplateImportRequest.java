// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskTemplateImportRequest extends TeaModel {
    @NameInMap("ModelCode")
    public String modelCode;

    @NameInMap("TemplateCode")
    public String templateCode;

    public static GetClriskTemplateImportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClriskTemplateImportRequest self = new GetClriskTemplateImportRequest();
        return TeaModel.build(map, self);
    }

    public GetClriskTemplateImportRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public GetClriskTemplateImportRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
