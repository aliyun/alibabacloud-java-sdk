// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the application. Default value: **app-1000000**. For more information, see [Multi-application service](~~113600~~).</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the template.</p>
     * <br>
     * <p>*   The name cannot exceed 128 bytes.</p>
     * <p>*   The value must be encoded in UTF-8.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The configurations of the snapshot template. The value must be a JSON string. For more information about the data structure, see [SnapshotTemplateConfig](~~98618~~).</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfig;

    /**
     * <p>The type of the template. Set the value to **Snapshot**.</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static AddVodTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddVodTemplateRequest self = new AddVodTemplateRequest();
        return TeaModel.build(map, self);
    }

    public AddVodTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddVodTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddVodTemplateRequest setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    public AddVodTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
