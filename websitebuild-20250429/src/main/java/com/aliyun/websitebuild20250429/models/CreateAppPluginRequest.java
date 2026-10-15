// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppPluginRequest extends TeaModel {
    /**
     * <p>The category of the plug-in.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Depth\&quot;: 4, \&quot;ParentCategoryId\&quot;: 5281, \&quot;Name\&quot;: \&quot;1\&quot;, \&quot;CategoryId\&quot;: 5282, \&quot;CreateTime\&quot;: \&quot;2025-08-26 10:20:37\&quot;}</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The description of the plug-in. The value must be 10 to 512 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The downloadable ZIP URL. This parameter is mutually exclusive with OssKey.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://geoip-sdk-user.oss-cn-zhangjiakou.aliyuncs.com/product/v1/ipv6-inner/common/v1.20230608104522.dex?Expires=1753324652&OSSAccessKeyId=x6R87i97yKeKRggz&Signature=IwS6V56TlgjcX0AgikXLvf3CVtw%3D">http://geoip-sdk-user.oss-cn-zhangjiakou.aliyuncs.com/product/v1/ipv6-inner/common/v1.20230608104522.dex?Expires=1753324652&amp;OSSAccessKeyId=x6R87i97yKeKRggz&amp;Signature=IwS6V56TlgjcX0AgikXLvf3CVtw%3D</a></p>
     */
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    /**
     * <p>The extended JSON. This parameter is optional and uses the same format as the extend field in sandbox synchronization. If this parameter is not empty, the value is written to the database.</p>
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
     * <p>The OSS key after frontend direct upload. This parameter is mutually exclusive with DownloadUrl.</p>
     * 
     * <strong>example:</strong>
     * <p>backend/detection/objects/r-0008ujvfksltf5j45n81/task-000hckiuwyau0gwn17vq.jpg</p>
     */
    @NameInMap("OssKey")
    public String ossKey;

    /**
     * <p>The unique identifier of the plug-in. The value can contain lowercase letters, digits, and hyphens (-), and must be 3 to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1bae9ceaceea432d91c7069fab0dfc02</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    /**
     * <p>The name of the plug-in. The value must be 2 to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>alisecguard</p>
     */
    @NameInMap("PluginName")
    public String pluginName;

    /**
     * <p>The version number in semver format. Default value: 0.1.0.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.6</p>
     */
    @NameInMap("PluginVersion")
    public String pluginVersion;

    /**
     * <p>The tags, separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The visibility of the plug-in. Default value: private.</p>
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
