// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadVideoRequest extends TeaModel {
    /**
     * <p>The ID of the application. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The category ID of the media file. You can use one of the following methods to obtain the category ID:</p>
     * <br>
     * <p>*   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Categories** to view the category ID of the media file.</p>
     * <p>*   Obtain the value of CateId from the response to the [AddCategory](~~56401~~) operation.</p>
     * <p>*   Obtain the value of CateId from the response to the [GetCategories](~~56406~~) operation.</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The URL of the custom video thumbnail.</p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <p>The description of the audio or video file.</p>
     * <br>
     * <p>*   The value can be up to 1,024 characters in length.</p>
     * <p>*   The value must be encoded in UTF-8.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the audio or video file.</p>
     * <br>
     * <p>*   The name must contain a file name extension, which is not case-sensitive.</p>
     * <p>*   For more information about file name extensions supported by ApsaraVideo VOD, see [Overview](~~55396~~).</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The size of the source file. Unit: bytes.</p>
     */
    @NameInMap("FileSize")
    public Long fileSize;

    /**
     * <p>The storage address. To obtain the storage address, log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Storage**.</p>
     * <br>
     * <p>> If you specify a storage address, media files are uploaded to the specified address.</p>
     */
    @NameInMap("StorageLocation")
    public String storageLocation;

    /**
     * <p>The tags of the audio or video file.</p>
     * <br>
     * <p>*   You can specify a maximum of 16 tags.</p>
     * <p>*   If you want to specify multiple tags, separate the tags with commas (,).</p>
     * <p>*   Each tag can be up to 32 characters in length.</p>
     * <p>*   The value must be encoded in UTF-8.</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The ID of the transcoding template group. You can use one of the following methods to obtain the ID of the transcoding template group:</p>
     * <br>
     * <p>*   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Transcoding Template Groups** to view the ID of the transcoding template group.</p>
     * <p>*   Obtain the value of TranscodeTemplateGroupId in the response to the [AddTranscodeTemplateGroup](~~102665~~) operation.</p>
     * <p>*   Obtain the value of TranscodeTemplateGroupId in the response to the [ListTranscodeTemplateGroup](~~102669~~) operation.</p>
     * <br>
     * <p>> If you leave this parameter empty, the default transcoding template group is used. If you specify this parameter, the specified transcoding template group is used for transcoding.</p>
     */
    @NameInMap("TemplateGroupId")
    public String templateGroupId;

    /**
     * <p>The title of the audio or video file.</p>
     * <br>
     * <p>*   The title can be up to 128 characters in length.</p>
     * <p>*   The value must be encoded in UTF-8.</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The custom configurations such as callback configurations and upload acceleration configurations. The value must be a JSON string. For more information, see [Request parameters](~~86952~~).</p>
     * <br>
     * <p>> *   The callback configurations take effect only after you specify the HTTP callback URL and select specific callback events in the ApsaraVideo VOD console. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see [Configure callback settings](~~86071~~).</p>
     * <p>>*   If you want to enable the upload acceleration feature, [submit a request on Yida](https://yida.alibaba-inc.com/o/ticketapply). For more information, see [Overview](~~55396~~).</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the workflow. To view the ID of the workflow, log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Workflows**.</p>
     * <br>
     * <p>> If you specify the WorkflowId and TemplateGroupId parameters, the value of the WorkflowId parameter takes effect. For more information, see [Workflows](~~115347~~).</p>
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
