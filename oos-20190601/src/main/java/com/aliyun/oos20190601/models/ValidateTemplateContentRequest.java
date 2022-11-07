// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ValidateTemplateContentRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateURL")
    public String templateURL;

    public static ValidateTemplateContentRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateTemplateContentRequest self = new ValidateTemplateContentRequest();
        return TeaModel.build(map, self);
    }

    public ValidateTemplateContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ValidateTemplateContentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ValidateTemplateContentRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

}
