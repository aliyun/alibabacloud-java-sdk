// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class ImportMediaRequest extends TeaModel {
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <p>The cover image URL. This parameter is valid only for video media assets.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://outin-55c9ab3fb1b911ee817b00163e32b0a3.oss-cn-shanghai.aliyuncs.com/60425a2758a971f181385017f0e90102/covers/ice-generated/d4aee2d6c6f84769ac89f18c667699c6-cover.png">https://outin-55c9ab3fb1b911ee817b00163e32b0a3.oss-cn-shanghai.aliyuncs.com/60425a2758a971f181385017f0e90102/covers/ice-generated/d4aee2d6c6f84769ac89f18c667699c6-cover.png</a></p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <p>The description of the media asset.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The dynamic metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("DynamicMetaData")
    public String dynamicMetaData;

    /**
     * <p>The entity ID.</p>
     * 
     * <strong>example:</strong>
     * <p>urn:cruise:mock-saml-idp</p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <p>The media asset source. Set this parameter to url.</p>
     * 
     * <strong>example:</strong>
     * <p>url</p>
     */
    @NameInMap("ImportSource")
    public String importSource;

    /**
     * <p>The URL of the media asset.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4">https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</a></p>
     */
    @NameInMap("InputURL")
    public String inputURL;

    /**
     * <p>The tags of the media asset. Separate multiple tags with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>AdvancedImageToVideo,AIGenerated.</p>
     */
    @NameInMap("MediaTags")
    public String mediaTags;

    /**
     * <p>The type of the media asset.</p>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>Specifies whether to overwrite existing media assets.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Overwrite")
    public Boolean overwrite;

    /**
     * <p>The configuration for registering the media asset.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;SearchLibName\&quot;:\&quot;AiSaasLib_34140718_MA\&quot;}</p>
     */
    @NameInMap("RegisterConfig")
    public String registerConfig;

    /**
     * <p>The title of the media asset.</p>
     * 
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The user data. The maximum size is 1024 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static ImportMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportMediaRequest self = new ImportMediaRequest();
        return TeaModel.build(map, self);
    }

    public ImportMediaRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public ImportMediaRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public ImportMediaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ImportMediaRequest setDynamicMetaData(String dynamicMetaData) {
        this.dynamicMetaData = dynamicMetaData;
        return this;
    }
    public String getDynamicMetaData() {
        return this.dynamicMetaData;
    }

    public ImportMediaRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public ImportMediaRequest setImportSource(String importSource) {
        this.importSource = importSource;
        return this;
    }
    public String getImportSource() {
        return this.importSource;
    }

    public ImportMediaRequest setInputURL(String inputURL) {
        this.inputURL = inputURL;
        return this;
    }
    public String getInputURL() {
        return this.inputURL;
    }

    public ImportMediaRequest setMediaTags(String mediaTags) {
        this.mediaTags = mediaTags;
        return this;
    }
    public String getMediaTags() {
        return this.mediaTags;
    }

    public ImportMediaRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public ImportMediaRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public ImportMediaRequest setRegisterConfig(String registerConfig) {
        this.registerConfig = registerConfig;
        return this;
    }
    public String getRegisterConfig() {
        return this.registerConfig;
    }

    public ImportMediaRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ImportMediaRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
