// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadAttachedMediaRequest extends TeaModel {
    /**
     * <p>The ID of the application. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The type of the media asset. Valid values:</p>
     * <ul>
     * <li><strong>watermark</strong></li>
     * <li><strong>subtitle</strong></li>
     * <li><strong>material</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>watermark</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The one or more category IDs of the auxiliary media asset. Separate multiple category IDs with commas (,). A maximum of five category IDs can be specified. You can use one of the following methods to obtain the category ID:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Categories</strong>. On the Categories page, you can view the category ID.</li>
     * <li>View the value of the CateId parameter returned by the <a href="https://help.aliyun.com/document_detail/56401.html">AddCategory</a> operation that you called to create a category.</li>
     * <li>View the value of the CateId parameter returned by the <a href="https://help.aliyun.com/document_detail/56406.html">GetCategories</a> operation that you called to query a category.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1298****,0813****</p>
     */
    @NameInMap("CateIds")
    public String cateIds;

    /**
     * <p>The description of the auxiliary media asset. Take note of the following items:</p>
     * <ul>
     * <li>The description can be up to 1,024 bytes in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>uploadTest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the source file.</p>
     * 
     * <strong>example:</strong>
     * <p>D:\test.png</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The size of the auxiliary media asset. Unit: byte.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("FileSize")
    public String fileSize;

    /**
     * <p>The file name extension. Valid values:</p>
     * <ul>
     * <li>Valid values for watermarks: <strong>png, gif, apng, and mov</strong></li>
     * <li>Valid values for subtitles: <strong>srt, ass, stl, ttml, and vtt</strong></li>
     * <li>Valid values for materials: <strong>jpg, gif, png, mp4, mat, zip, and apk</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>png</p>
     */
    @NameInMap("MediaExt")
    public String mediaExt;

    /**
     * <p>The storage location. You can use one of the following methods to obtain the storage location:</p>
     * <p>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Storage</strong>. On the Storage page, you can view the storage location.</p>
     * <blockquote>
     * <p> If this parameter is set to a specific value, the auxiliary media asset is uploaded to the specified storage location.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>out-****.oss-cn-shanghai.aliyuncs.com</p>
     */
    @NameInMap("StorageLocation")
    public String storageLocation;

    /**
     * <p>The one or more tags of the auxiliary media asset. Take note of the following items:</p>
     * <ul>
     * <li>You can specify a maximum of 16 tags.</li>
     * <li>If you need to specify multiple tags, separate the tags with commas (,).</li>
     * <li>Each tag can be up to 32 characters in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tag1,tag2</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The title of the media asset. Take note of the following items:</p>
     * <ul>
     * <li>The title can be up to 128 bytes in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testTitle</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The custom configurations, including callback configurations and upload acceleration configurations. The value is a JSON string. For more information, see the &quot;UserData: specifies the custom configurations for media upload&quot; section of the <a href="https://help.aliyun.com/document_detail/86952.html">Request parameters</a> topic.</p>
     * <blockquote>
     * <ul>
     * <li>The callback configurations take effect only after you specify the HTTP callback URL and select the specific callback events in the ApsaraVideo VOD console. For more information about how to configure an HTTP callback in the ApsaraVideo VOD console, see <a href="https://help.aliyun.com/document_detail/86071.html">Configure callback settings</a>.</li>
     * <li>To use the upload acceleration feature, submit a <a href="https://ticket-intl.console.aliyun.com/#/ticket/createIndex">ticket</a> to enable this feature. For more information, see <a href="https://help.aliyun.com/document_detail/55396.html">Overview</a>.</li>
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
