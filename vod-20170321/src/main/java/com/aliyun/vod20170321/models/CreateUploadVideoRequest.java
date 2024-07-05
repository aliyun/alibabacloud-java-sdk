// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadVideoRequest extends TeaModel {
    /**
     * <p>The ID of the application. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>app-1000000</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The category ID of the media file. You can use one of the following methods to obtain the category ID:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Categories</strong> to view the category ID of the media file.</li>
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
     * <p>The URL of the custom video thumbnail.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.aliyundoc.com/image/D22F553TEST****.jpeg">https://example.aliyundoc.com/image/D22F553TEST****.jpeg</a></p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <p>The description of the audio or video file.</p>
     * <ul>
     * <li>The value can be up to 1,024 characters in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UploadTest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the audio or video file.</p>
     * <ul>
     * <li>The name must contain a file name extension, which is not case-sensitive.</li>
     * <li>For more information about file name extensions supported by ApsaraVideo VOD, see <a href="https://help.aliyun.com/document_detail/55396.html">Overview</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>D:\video_01.mp4</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The size of the source file. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("FileSize")
    public Long fileSize;

    /**
     * <p>The storage address. To obtain the storage address, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Storage</strong>.</p>
     * <blockquote>
     * <p>If you specify a storage address, media files are uploaded to the specified address.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>out-****.oss-cn-shanghai.aliyuncs.com</p>
     */
    @NameInMap("StorageLocation")
    public String storageLocation;

    /**
     * <p>The tags of the audio or video file.</p>
     * <ul>
     * <li>You can specify a maximum of 16 tags.</li>
     * <li>If you want to specify multiple tags, separate the tags with commas (,).</li>
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
     * <p>The ID of the transcoding template group. You can use one of the following methods to obtain the ID of the transcoding template group:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Processing</strong> &gt; <strong>Transcoding Template Groups</strong> to view the ID of the transcoding template group.</li>
     * <li>Obtain the value of TranscodeTemplateGroupId in the response to the <a href="https://help.aliyun.com/document_detail/102665.html">AddTranscodeTemplateGroup</a> operation.</li>
     * <li>Obtain the value of TranscodeTemplateGroupId in the response to the <a href="https://help.aliyun.com/document_detail/102669.html">ListTranscodeTemplateGroup</a> operation.</li>
     * </ul>
     * <blockquote>
     * <p>If you leave this parameter empty, the default transcoding template group is used. If you specify this parameter, the specified transcoding template group is used for transcoding.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>405477f9e214d19ea2c7c854****</p>
     */
    @NameInMap("TemplateGroupId")
    public String templateGroupId;

    /**
     * <p>The title of the audio or video file.</p>
     * <ul>
     * <li>The title can be up to 128 characters in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UploadTest</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The custom configurations such as callback configurations and upload acceleration configurations. The value must be a JSON string. For more information, see <a href="https://help.aliyun.com/document_detail/86952.html">Request parameters</a>.</p>
     * <blockquote>
     * <ul>
     * <li>The callback configurations take effect only after you specify the HTTP callback URL and select specific callback events in the ApsaraVideo VOD console. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see <a href="https://help.aliyun.com/document_detail/86071.html">Configure callback settings</a>.</li>
     * <li>If you want to enable the upload acceleration feature, <a href="https://yida.alibaba-inc.com/o/ticketapply">submit a request on Yida</a>. For more information, see <a href="https://help.aliyun.com/document_detail/55396.html">Overview</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D,%22Extend%22:%7B%22localId%22:%22*****%22,%22test%22:%22www%22%7D%7D">http://example.aliyundoc.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;*****&quot;,&quot;test&quot;:&quot;www&quot;}}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the workflow. To view the ID of the workflow, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Processing</strong> &gt; <strong>Workflows</strong>.</p>
     * <blockquote>
     * <p>If you specify the WorkflowId and TemplateGroupId parameters, the value of the WorkflowId parameter takes effect. For more information, see <a href="https://help.aliyun.com/document_detail/115347.html">Workflows</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>613efff3887ec34af685714cc461****</p>
     */
    @NameInMap("WorkflowId")
    public String workflowId;

    public static CreateUploadVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadVideoRequest self = new CreateUploadVideoRequest();
        return TeaModel.build(map, self);
    }

    public CreateUploadVideoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateUploadVideoRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public CreateUploadVideoRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public CreateUploadVideoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUploadVideoRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateUploadVideoRequest setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public CreateUploadVideoRequest setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public String getStorageLocation() {
        return this.storageLocation;
    }

    public CreateUploadVideoRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateUploadVideoRequest setTemplateGroupId(String templateGroupId) {
        this.templateGroupId = templateGroupId;
        return this;
    }
    public String getTemplateGroupId() {
        return this.templateGroupId;
    }

    public CreateUploadVideoRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateUploadVideoRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public CreateUploadVideoRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
