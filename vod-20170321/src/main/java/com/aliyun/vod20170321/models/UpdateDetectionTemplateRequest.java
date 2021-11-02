// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateDetectionTemplateRequest extends TeaModel {
    @NameInMap("Period")
    public String period;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateName")
    public String templateName;

    public static UpdateDetectionTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDetectionTemplateRequest self = new UpdateDetectionTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDetectionTemplateRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public UpdateDetectionTemplateRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public UpdateDetectionTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateDetectionTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
