// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ValidateTemplateContentRequest extends TeaModel {
    /**
     * <p>The content of the template.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The URL that is used to store the content of the Operation Orchestration Service (OOS) template in the Alibaba Cloud Object Storage Service (OSS). Only the public-read URL is supported. You can use this parameter to specify the tasks that you want to run. This way, you do not need to create a template before you start an execution. If you select an existing template, you do not need to specify this parameter.</p>
     */
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
