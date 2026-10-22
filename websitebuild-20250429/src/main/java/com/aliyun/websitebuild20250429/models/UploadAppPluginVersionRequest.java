// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UploadAppPluginVersionRequest extends TeaModel {
    /**
     * <p>The changelog.</p>
     * 
     * <strong>example:</strong>
     * <p>x x x</p>
     */
    @NameInMap("Changelog")
    public String changelog;

    /**
     * <p>The description. This parameter is optional. If this parameter is not empty, the description field in the primary table is updated accordingly.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The downloadable URL of the ZIP file. This parameter and OssKey are mutually exclusive.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://sfile.chatglm.cn/chatglm4/file/a8/a87340a5ba.pdf">https://sfile.chatglm.cn/chatglm4/file/a8/a87340a5ba.pdf</a></p>
     */
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    /**
     * <p>The extended JSON string. This parameter is optional and must be in the same format as the extend parameter synchronized from the sandbox. If this parameter is not empty, the extend field in the primary table is updated accordingly.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;deliveryNodeName&quot;:&quot;Delivery Quality Inspection&quot;,&quot;deliveryNodeStatus&quot;:&quot;Finish&quot;,&quot;deliveryOperatorRole&quot;:&quot;Provider&quot;}</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>The Object Storage Service (OSS) key after the file is directly uploaded from the frontend. This parameter and DownloadUrl are mutually exclusive.</p>
     * 
     * <strong>example:</strong>
     * <p>backend/detection/objects/r-0008ujvfksltf5j45n81/task-000hckiuwyau0gwn17vq.jpg</p>
     */
    @NameInMap("OssKey")
    public String ossKey;

    /**
     * <p>The ID of the gateway plugin.</p>
     * 
     * <strong>example:</strong>
     * <p>aliplayer-react</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    /**
     * <p>The new version number. The version number must follow the Semantic Versioning (SemVer) specification and be greater than the current version.</p>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("PluginVersion")
    public String pluginVersion;

    public static UploadAppPluginVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadAppPluginVersionRequest self = new UploadAppPluginVersionRequest();
        return TeaModel.build(map, self);
    }

    public UploadAppPluginVersionRequest setChangelog(String changelog) {
        this.changelog = changelog;
        return this;
    }
    public String getChangelog() {
        return this.changelog;
    }

    public UploadAppPluginVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UploadAppPluginVersionRequest setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public UploadAppPluginVersionRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public UploadAppPluginVersionRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public UploadAppPluginVersionRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public UploadAppPluginVersionRequest setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
        return this;
    }
    public String getPluginVersion() {
        return this.pluginVersion;
    }

}
