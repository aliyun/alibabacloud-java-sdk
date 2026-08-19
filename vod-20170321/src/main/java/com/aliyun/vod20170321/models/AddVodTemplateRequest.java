// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodTemplateRequest extends TeaModel {
    /**
     * <p>The application ID. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The template name.</p>
     * <ul>
     * <li>The name can be up to 128 bytes in length.</li>
     * <li>UTF-8 encoded.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The template configuration data in JSON format. For more information about the data structure, see <a href="https://help.aliyun.com/document_detail/98618.html">Snapshot template configuration</a> or <a href="https://help.aliyun.com/document_detail/98618.html">Animated image template configuration</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;SnapshotConfig&quot;:{&quot;Count&quot;:10,&quot;SpecifiedOffsetTime&quot;:0,&quot;Interval&quot;:1,&quot;FrameType&quot;:&quot;normal&quot;},&quot;SnapshotType&quot;:&quot;NormalSnapshot&quot;}</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfig;

    /**
     * <p>The templatetype. Valid values:</p>
     * <ul>
     * <li><strong>Snapshot</strong>: snapshot.</li>
     * <li><strong>DynamicImage</strong>: animated image.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Snapshot</p>
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
