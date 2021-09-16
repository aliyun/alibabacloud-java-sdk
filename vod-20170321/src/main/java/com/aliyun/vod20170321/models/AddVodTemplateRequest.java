// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodTemplateRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("TemplateType")
    public String templateType;

    @NameInMap("TemplateConfig")
    public String templateConfig;

    @NameInMap("AppId")
    public String appId;

    public static AddVodTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddVodTemplateRequest self = new AddVodTemplateRequest();
        return TeaModel.build(map, self);
    }

    public AddVodTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddVodTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public AddVodTemplateRequest setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    public AddVodTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
