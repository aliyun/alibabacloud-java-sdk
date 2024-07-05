// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadImageRequest extends TeaModel {
    /**
     * <p>The ID of the application. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>app-1000000</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The category ID of the image. You can use one of the following methods to obtain the category ID:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Categories</strong>. On the Categories page, you can view the category ID of the image.</li>
     * <li>Obtain the value of CateId from the response to the <a href="https://help.aliyun.com/document_detail/56401.html">AddCategory</a> operation.</li>
     * <li>Obtain the value of CateId from the response to the <a href="https://help.aliyun.com/document_detail/56406.html">GetCategories</a> operation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100036****</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The description of the image.</p>
     * <ul>
     * <li>The description can be up to 1,024 characters in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>The description of the image</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The file name extension of the image. Valid values:</p>
     * <ul>
     * <li><strong>png</strong> (default)</li>
     * <li><strong>jpg</strong></li>
     * <li><strong>jpeg</strong></li>
     * <li><strong>gif</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>png</p>
     */
    @NameInMap("ImageExt")
    public String imageExt;

    /**
     * <p>The type of the image. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: the default image type.</li>
     * <li><strong>cover</strong>: the thumbnail.</li>
     * </ul>
     * <blockquote>
     * <p>You can manage only images of the <strong>default</strong> type in the ApsaraVideo VOD console.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <p>The name of the source file.</p>
     * <blockquote>
     * <p>The name must contain a file name extension. The file name extension is not case-sensitive.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>D:\picture_01.png</p>
     */
    @NameInMap("OriginalFileName")
    public String originalFileName;

    /**
     * <p>The storage address. Perform the following operations to obtain the storage address: Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Storage</strong>. On the Storage page, view the storage address.</p>
     * <blockquote>
     * <p>If you specify a storage address, media files are uploaded to the specified address.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>outin-****..oss-cn-shanghai.aliyuncs.com</p>
     */
    @NameInMap("StorageLocation")
    public String storageLocation;

    /**
     * <p>The tags of the image. The following rules apply:</p>
     * <ul>
     * <li>Each tag can be up to 32 characters in length.</li>
     * <li>You can specify a maximum of 16 tags for an image.</li>
     * <li>Separate multiple tags with commas (,).</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The title of the image. The following rules apply:</p>
     * <ul>
     * <li>The title can be up to 128 characters in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mytitle</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The custom configurations, including callback configurations and upload acceleration configurations. The value must be a JSON string. For more information, see the &quot;UserData: specifies the custom configurations for media upload&quot; section of the <a href="https://help.aliyun.com/document_detail/86952.html">Request parameters</a> topic.</p>
     * <blockquote>
     * <ul>
     * <li>The callback configurations take effect only after you specify the HTTP callback URL and select specific callback events in the ApsaraVideo VOD console. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see <a href="https://help.aliyun.com/document_detail/86071.html">Configure callback settings</a>.</li>
     * <li>If you want to enable the upload acceleration feature, <a href="https://yida.alibaba-inc.com/o/ticketapply">submit a request on Yida</a>. For more information, see <a href="https://help.aliyun.com/document_detail/55396.html">Overview</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D,%22Extend%22:%7B%22localId%22:%22xxx%22,%22test%22:%22www%22%7D%7D">http://example.aliyundoc.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;test&quot;:&quot;www&quot;}}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateUploadImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadImageRequest self = new CreateUploadImageRequest();
        return TeaModel.build(map, self);
    }

    public CreateUploadImageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateUploadImageRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public CreateUploadImageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUploadImageRequest setImageExt(String imageExt) {
        this.imageExt = imageExt;
        return this;
    }
    public String getImageExt() {
        return this.imageExt;
    }

    public CreateUploadImageRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public CreateUploadImageRequest setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
        return this;
    }
    public String getOriginalFileName() {
        return this.originalFileName;
    }

    public CreateUploadImageRequest setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public String getStorageLocation() {
        return this.storageLocation;
    }

    public CreateUploadImageRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateUploadImageRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateUploadImageRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
