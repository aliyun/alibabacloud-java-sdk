// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadAttachedMediaRequest extends TeaModel {
    /**
     * <p>The application ID. Default value: <strong>app-1000000</strong>. If you have activated the multi-application service, specify the application ID to upload the auxiliary media asset to the specified application. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The type of the auxiliary media asset. Valid values:</p>
     * <ul>
     * <li><strong>watermark</strong>: watermark.</li>
     * <li><strong>subtitle</strong>: subtitle.</li>
     * <li><strong>material</strong>: material.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>watermark</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The category IDs. Separate multiple IDs with commas (,). A maximum of 5 IDs are supported. You can obtain category IDs by using the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Management Configuration</strong> &gt; <strong>Category Management</strong> to view category IDs.</li>
     * <li>The category ID is returned when you call the <a href="~~AddCategory~~">AddCategory</a> operation to create a category.</li>
     * <li>The category ID is returned when you call the <a href="~~GetCategories~~">GetCategories</a> operation to query categories.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1298****,0813****</p>
     */
    @NameInMap("CateIds")
    public String cateIds;

    /**
     * <p>The description of the media asset. Rules:</p>
     * <ul>
     * <li>The description can be up to 1024 bytes in length.</li>
     * <li>The description must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>uploadTest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The source file address of the auxiliary media asset to be uploaded.</p>
     * <blockquote>
     * <p>The file name extension is optional. If a file name extension is specified here and is different from the extension specified in MediaExt, the value of MediaExt takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>D:\test.png</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The file size. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("FileSize")
    public String fileSize;

    /**
     * <p>The file name extension of the auxiliary media asset source file to be uploaded. Valid values:</p>
     * <ul>
     * <li>Watermark: <strong>png, gif, apng, mov</strong>.</li>
     * <li>Subtitle: <strong>srt, ass, stl, ttml, vtt</strong>.</li>
     * <li>Material: <strong>jpg, gif, png, mp4, mat, zip, apk</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>png</p>
     */
    @NameInMap("MediaExt")
    public String mediaExt;

    /**
     * <p>The storage address. You can obtain the storage address by using the following method:</p>
     * <p>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Management Configuration</strong> &gt; <strong>Storage Management</strong> to view the storage address.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the auxiliary media asset is uploaded to the default storage address. If you specify this parameter, the auxiliary media asset is uploaded to the specified storage address.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>out-****.oss-cn-shanghai.aliyuncs.com</p>
     */
    @NameInMap("StorageLocation")
    public String storageLocation;

    /**
     * <p>The tags. Rules:</p>
     * <ul>
     * <li>A maximum of 16 tags are supported.</li>
     * <li>Separate multiple tags with commas (,).</li>
     * <li>Each tag can be up to 32 characters or Chinese characters in length.</li>
     * <li>The tags must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tag1,tag2</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The title of the auxiliary media asset. Rules:</p>
     * <ul>
     * <li>The title can be up to 128 bytes in length.</li>
     * <li>The title must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The custom settings, which is a JSON string. The settings support message callbacks, upload acceleration, and other configurations. For more information, see <a href="~~86952#section-6fg-qll-v3w~~">UserData</a>.</p>
     * <blockquote>
     * <ul>
     * <li>To use message callbacks in this parameter, you must configure an HTTP callback URL and select the corresponding callback event types in the console. Otherwise, the callback settings do not take effect. For information about how to configure HTTP callbacks in the console, see <a href="https://help.aliyun.com/document_detail/86071.html">Callback settings</a>.</li>
     * <li>To use the upload acceleration feature, submit a ticket to activate it. For more information, see <a href="https://help.aliyun.com/document_detail/55396.html">Upload instructions</a>. For information about how to submit a ticket, see <a href="https://help.aliyun.com/document_detail/464625.html">Contact us</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D,%22Extend%22:%7B%22localId%22:%22xxx%22,%22test%22:%22www%22%7D%7D">http://example.aliyundoc.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;test&quot;:&quot;www&quot;}}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateUploadAttachedMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadAttachedMediaRequest self = new CreateUploadAttachedMediaRequest();
        return TeaModel.build(map, self);
    }

    public CreateUploadAttachedMediaRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateUploadAttachedMediaRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public CreateUploadAttachedMediaRequest setCateIds(String cateIds) {
        this.cateIds = cateIds;
        return this;
    }
    public String getCateIds() {
        return this.cateIds;
    }

    public CreateUploadAttachedMediaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUploadAttachedMediaRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateUploadAttachedMediaRequest setFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public String getFileSize() {
        return this.fileSize;
    }

    public CreateUploadAttachedMediaRequest setMediaExt(String mediaExt) {
        this.mediaExt = mediaExt;
        return this;
    }
    public String getMediaExt() {
        return this.mediaExt;
    }

    public CreateUploadAttachedMediaRequest setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public String getStorageLocation() {
        return this.storageLocation;
    }

    public CreateUploadAttachedMediaRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateUploadAttachedMediaRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateUploadAttachedMediaRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
