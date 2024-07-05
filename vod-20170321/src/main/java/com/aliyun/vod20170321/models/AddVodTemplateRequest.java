// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the application. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application service</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the template.</p>
     * <ul>
     * <li>The name cannot exceed 128 bytes.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The configurations of the snapshot template. The value must be a JSON string. For more information about the data structure, see <a href="https://help.aliyun.com/document_detail/98618.html">SnapshotTemplateConfig</a> and <a href="https://help.aliyun.com/document_detail/98618.html">DynamicImageTemplateConfig</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;SnapshotConfig&quot;:{&quot;Count&quot;:10,&quot;SpecifiedOffsetTime&quot;:0,&quot;Interval&quot;:1,&quot;FrameType&quot;:&quot;normal&quot;},&quot;SnapshotType&quot;:&quot;NormalSnapshot&quot;}</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfig;

    /**
     * <p>The type of the template. Set the value to <strong>Snapshot</strong>.</p>
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
