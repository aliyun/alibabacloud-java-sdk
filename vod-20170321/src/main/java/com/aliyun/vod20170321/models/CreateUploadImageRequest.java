// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadImageRequest extends TeaModel {
    /**
     * <p>The application ID. Default value: <strong>app-1000000</strong>. If you have activated the multi-application service, specify the application ID to upload the image to the specified application. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>app-1000000</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The category ID. You can obtain the category ID by using the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Categories</strong> to view the category ID.</li>
     * <li>Obtain the value of CateId from the response when you call the <a href="~~AddCategory~~">AddCategory</a> operation to create a category.</li>
     * <li>Obtain the value of CateId from the response when you call the <a href="~~GetCategories~~">GetCategories</a> operation to query categories.</li>
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
     * <li>The description can be up to 1024 characters in length.</li>
     * <li>The description must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Image upload test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The file name extension of the image source file to upload. Valid values:</p>
     * <ul>
     * <li><strong>png</strong> (default)</li>
     * <li><strong>jpg</strong></li>
     * <li><strong>jpeg</strong></li>
     * <li><strong>gif</strong></li>
     * <li><strong>heic</strong></li>
     * <li><strong>webp</strong></li>
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
     * <li><strong>default</strong> (default): a common image.</li>
     * <li><strong>cover</strong>: a video thumbnail.</li>
     * </ul>
     * <blockquote>
     * <p>The ApsaraVideo VOD console supports viewing and managing only images of the <strong>default</strong> type.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <p>The address of the image source file to upload.</p>
     * <blockquote>
     * <p>The file name extension is optional. If a file name extension is included here and is different from the value specified in <code>ImageExt</code>, the value of <code>ImageExt</code> takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>D:\picture_01</p>
     */
    @NameInMap("OriginalFileName")
    public String originalFileName;

    /**
     * <p>The storage address. You can obtain the storage address by using the following method:
     * Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Storage</strong> to view the storage address.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the image is uploaded to the default storage address. If you specify this parameter, the image is uploaded to the specified storage address.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>outin-****..oss-cn-shanghai.aliyuncs.com</p>
     */
    @NameInMap("StorageLocation")
    public String storageLocation;

    /**
     * <p>The tags of the image. Rules:</p>
     * <ul>
     * <li>Each tag can be up to 32 characters in length.</li>
     * <li>You can specify up to 16 tags.</li>
     * <li>Separate multiple tags with commas (,).</li>
     * <li>The tags must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The title of the image. Rules:</p>
     * <ul>
     * <li>The title can be up to 128 characters in length.</li>
     * <li>The title must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mytitle</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The custom settings in a JSON string. The settings support message callbacks, upload acceleration, and other configurations. For more information, see <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
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
