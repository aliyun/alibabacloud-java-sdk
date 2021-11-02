// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateDetectionTemplateRequest extends TeaModel {
    @NameInMap("Period")
    public String period;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("TemplateName")
    public String templateName;

    public static CreateDetectionTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDetectionTemplateRequest self = new CreateDetectionTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateDetectionTemplateRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateDetectionTemplateRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateDetectionTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
