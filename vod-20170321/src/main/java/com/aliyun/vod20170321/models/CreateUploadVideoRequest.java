// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadVideoRequest extends TeaModel {
    /**
     * <p>The application ID. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>app-1000000</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The category ID. You can obtain the category ID by using one of the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Management Configuration</strong> &gt; <strong>Category Management</strong> to view the category ID.</li>
     * <li>When you create a category by calling the <a href="~~AddCategory~~">AddCategory</a> operation, the category ID is the value of the CateId parameter in the response.</li>
     * <li>When you query categories by calling the <a href="~~GetCategories~~">GetCategories</a> operation, the category ID is the value of the CateId parameter in the response.</li>
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
     * <p>The description of the audio or video file displayed in ApsaraVideo VOD after the upload is complete.</p>
     * <ul>
     * <li>The description can be up to 1024 characters in length.</li>
     * <li>The value is encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UploadTest</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("EnableFirstFrameCover")
    public Boolean enableFirstFrameCover;

    /**
     * <p>The address of the audio or video source file to be uploaded.</p>
     * <ul>
     * <li>The file name extension is required and is not case-sensitive.</li>
     * <li>For supported file name extensions, see <a href="https://help.aliyun.com/document_detail/55396.html">Upload overview</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>D:\video_01.mp4</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The size of the audio or video source file to be uploaded. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("FileSize")
    public Long fileSize;

    @NameInMap("GenerateThumbnail")
    public Boolean generateThumbnail;

    /**
     * <p>The custom ID. Only lowercase letters, uppercase letters, digits, hyphens, and underscores are supported. The length is 6 to 64 characters. The ID is unique at the user level.</p>
     * 
     * <strong>example:</strong>
     * <p>123-123</p>
     */
    @NameInMap("ReferenceId")
    public String referenceId;

    /**
     * <p>The storage address. You can obtain the storage address by using the following method:
     * Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Management Configuration</strong> &gt; <strong>Storage Management</strong> to view the storage address.</p>
     * <blockquote>
     * <p>If this parameter is not specified, the audio or video file is uploaded to the default storage address. If no default storage address exists, the file is uploaded to the first storage address in the storage list. If this parameter is specified, the audio or video file is uploaded to the specified storage address.</p>
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
     * <li>You can specify up to 16 tags.</li>
     * <li>To specify multiple tags, separate them with commas (,).</li>
     * <li>Each tag can be up to 32 characters in length.</li>
     * <li>The value is encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tag1,tag2</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The ID of the transcoding template group. You can obtain the ID by using one of the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Processing Configuration</strong> &gt; <strong>Transcoding Template Groups</strong> to view the transcoding template group ID.</li>
     * <li>When you create a transcoding template group by calling the <a href="https://help.aliyun.com/document_detail/102665.html">Create a transcoding template group</a> operation, the transcoding template group ID is the value of the TranscodeTemplateGroupId parameter in the response.</li>
     * <li>When you query transcoding template groups by calling the <a href="https://help.aliyun.com/document_detail/102669.html">Query transcoding configurations</a> operation, the transcoding template group ID is the value of the TranscodeTemplateGroupId parameter in the response.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If both WorkflowId and TemplateGroupId are specified, WorkflowId takes precedence.</li>
     * <li>If this parameter is not specified, the default transcoding template group is used for transcoding. If a transcoding template group ID is specified, the specified template group is used for transcoding.</li>
     * <li>If this parameter is set to the built-in <strong>No Transcoding</strong> template group, only the <a href="https://help.aliyun.com/document_detail/55630.html">Video Upload Complete</a> event notification is sent after the audio or video file is uploaded. The <a href="https://help.aliyun.com/document_detail/55636.html">Transcode Complete for a Single Definition</a> event notification is not sent.</li>
     * <li>This parameter triggers an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous task</a>. After submission, the task is not immediately completed and is queued for asynchronous execution in the background.</li>
     * <li>To ensure normal playback, when the built-in <strong>No Transcoding</strong> template group is used, only the following formats support direct playback without transcoding after the audio or video file is uploaded: MP4, FLV, MP3, M3U8, and WEBM. Other formats support storage only (check the file name extension of FileName). If you use ApsaraVideo Player, the player version must be 3.1.0 or later.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>405477f9e214d19ea2c7c854****</p>
     */
    @NameInMap("TemplateGroupId")
    public String templateGroupId;

    /**
     * <p>The title of the audio or video file displayed in ApsaraVideo VOD after the upload is complete.</p>
     * <ul>
     * <li>The title can be up to 128 characters in length.</li>
     * <li>The value is encoded in UTF-8.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UploadTest</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The custom settings in a JSON string. The settings support message callbacks, upload acceleration, and other configurations. For more information, see <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
     * <blockquote>
     * <ul>
     * <li>To use the message callback in this parameter, you must configure an HTTP callback URL and select the corresponding callback event types in the console. Otherwise, the callback settings do not take effect. If no callback URL is specified for subsequent tasks, callbacks are sent to this address by default. To configure HTTP callbacks in the console, see <a href="https://help.aliyun.com/document_detail/86071.html">Callback settings</a>.</li>
     * <li>To use the upload acceleration feature, you must <a href="https://yida.alibaba-inc.com/o/ticketapply">submit a Yida form</a> to apply for activation. For more information, see <a href="https://help.aliyun.com/document_detail/55396.html">Upload instructions</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D,%22Extend%22:%7B%22localId%22:%22*****%22,%22test%22:%22www%22%7D%7D">http://example.aliyundoc.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;*****&quot;,&quot;test&quot;:&quot;www&quot;}}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The workflow ID. Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Processing Configuration</strong> &gt; <strong>Workflow Management</strong> to view the workflow ID.</p>
     * <blockquote>
     * <ul>
     * <li>If both WorkflowId and TemplateGroupId are specified, WorkflowId takes precedence. For more information, see <a href="https://help.aliyun.com/document_detail/115347.html">Workflows</a>.</li>
     * <li>This parameter triggers an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous task</a>. After submission, the task is not immediately completed and is queued for asynchronous execution in the background.</li>
     * </ul>
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

    public CreateUploadVideoRequest setEnableFirstFrameCover(Boolean enableFirstFrameCover) {
        this.enableFirstFrameCover = enableFirstFrameCover;
        return this;
    }
    public Boolean getEnableFirstFrameCover() {
        return this.enableFirstFrameCover;
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

    public CreateUploadVideoRequest setGenerateThumbnail(Boolean generateThumbnail) {
        this.generateThumbnail = generateThumbnail;
        return this;
    }
    public Boolean getGenerateThumbnail() {
        return this.generateThumbnail;
    }

    public CreateUploadVideoRequest setReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }
    public String getReferenceId() {
        return this.referenceId;
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
