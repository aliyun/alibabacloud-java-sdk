// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppPluginRequest extends TeaModel {
    /**
     * <p>The category of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Depth\&quot;: 4, \&quot;ParentCategoryId\&quot;: 5281, \&quot;Name\&quot;: \&quot;1\&quot;, \&quot;CategoryId\&quot;: 5282, \&quot;CreateTime\&quot;: \&quot;2025-08-26 10:20:37\&quot;}</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The description of the skill. The description must be 10 to 512 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The URL of the downloadable ZIP file. Specify either this parameter or OssKey.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://geoip-sdk-user.oss-cn-zhangjiakou.aliyuncs.com/product/v1/ipv6-inner/common/v1.20230608104522.dex?Expires=1753324652&OSSAccessKeyId=x6R87i97yKeKRggz&Signature=IwS6V56TlgjcX0AgikXLvf3CVtw%3D">http://geoip-sdk-user.oss-cn-zhangjiakou.aliyuncs.com/product/v1/ipv6-inner/common/v1.20230608104522.dex?Expires=1753324652&amp;OSSAccessKeyId=x6R87i97yKeKRggz&amp;Signature=IwS6V56TlgjcX0AgikXLvf3CVtw%3D</a></p>
     */
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    /**
     * <p>The extended JSON data. The format is the same as the extend parameter synchronized with the sandbox. If this parameter is not empty, it is saved to the database. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;user_device_id\&quot;:\&quot;6bef45cb0c76de284d24de074c088b73\&quot;}\n</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>The URL of the icon.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Icon")
    public String icon;

    /**
     * <p>The Object Storage Service (OSS) key generated after a direct upload from the frontend. Specify either this parameter or DownloadUrl.</p>
     * 
     * <strong>example:</strong>
     * <p>backend/detection/objects/r-0008ujvfksltf5j45n81/task-000hckiuwyau0gwn17vq.jpg</p>
     */
    @NameInMap("OssKey")
    public String ossKey;

    /**
     * <p>The unique identifier of the skill. The identifier must be 3 to 64 characters in length and can contain only lowercase letters, digits, and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>1bae9ceaceea432d91c7069fab0dfc02</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    /**
     * <p>The name of the skill. The name must be 2 to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>alisecguard</p>
     */
    @NameInMap("PluginName")
    public String pluginName;

    /**
     * <p>The version number of the plug-in. The version number must be in the Semantic Versioning (SemVer) format. Default value: 0.1.0.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.6</p>
     */
    @NameInMap("PluginVersion")
    public String pluginVersion;

    /**
     * <p>The tags of the skill. Separate multiple tags with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The visibility of the skill. Default value: private.</p>
     * 
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    public static CreateAppPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppPluginRequest self = new CreateAppPluginRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppPluginRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateAppPluginRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAppPluginRequest setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public CreateAppPluginRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public CreateAppPluginRequest setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public CreateAppPluginRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public CreateAppPluginRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public CreateAppPluginRequest setPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }
    public String getPluginName() {
        return this.pluginName;
    }

    public CreateAppPluginRequest setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
        return this;
    }
    public String getPluginVersion() {
        return this.pluginVersion;
    }

    public CreateAppPluginRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateAppPluginRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

}
