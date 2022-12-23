// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadVideoRequest extends TeaModel {
    // The ID of the application. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).
    @NameInMap("AppId")
    public String appId;

    // The category ID of the audio or video file. You can use one of the following methods to obtain the category ID:
    // 
    // * Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Categories**. On the Categories page, you can view the category ID.
    // * View the value of the CateId parameter returned by the [AddCategory](~~56401~~) operation that you called to create a category.
    // * View the value of the CateId parameter returned by the [GetCategories](~~56406~~) operation that you called to query a category.
    @NameInMap("CateId")
    public Long cateId;

    // The URL of the custom video thumbnail.
    @NameInMap("CoverURL")
    public String coverURL;

    // The description of the audio or video file.
    // 
    // * The description can be up to 1,024 characters in length.
    // * The value must be encoded in UTF-8.
    @NameInMap("Description")
    public String description;

    // The name of the audio or video file.
    // 
    // * The name must contain a file name extension, which is not case-sensitive.
    // * For more information about file name extensions supported by ApsaraVideo VOD, see [Overview](~~55396~~).
    @NameInMap("FileName")
    public String fileName;

    // The size of the audio or video file. Unit: byte.
    @NameInMap("FileSize")
    public Long fileSize;

    // The storage location. You can use one of the following methods to obtain the storage location:
    // 
    // Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Storage**. On the Storage page, you can view the storage location.
    // 
    // > If this parameter is set to a specific value, the audio or video file is uploaded to the specified storage location.
    @NameInMap("StorageLocation")
    public String storageLocation;

    // The one or more tags of the audio or video file.
    // 
    // * You can specify a maximum of 16 tags.
    // * If you need to specify multiple tags, separate the tags with commas (,).
    // * Each tag can be up to 32 characters in length.
    // * The value must be encoded in UTF-8.
    @NameInMap("Tags")
    public String tags;

    // The ID of the transcoding template group. You can use one of the following methods to obtain the ID of the transcoding template group:
    // 
    // * Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Transcoding Template Groups**. On the Transcoding Template Groups page, you can view the ID of the transcoding template group.
    // * View the value of the TranscodeTemplateGroupId parameter returned by the [AddTranscodeTemplateGroup](~~102665~~) operation that you called to create a transcoding template group.
    // * View the value of the TranscodeTemplateGroupId parameter returned by the [ListTranscodeTemplateGroup](~~102669~~) operation that you called to query a transcoding template group.
    // 
    // > If you leave this parameter empty, the default transcoding template group is used for transcoding. If you set this parameter to the ID of a specific transcoding template group, the specified transcoding template group is used for transcoding.
    @NameInMap("TemplateGroupId")
    public String templateGroupId;

    // The title of the audio or video file.
    // 
    // * The title can be up to 128 characters in length.
    // * The value must be encoded in UTF-8.
    @NameInMap("Title")
    public String title;

    // The custom configurations, including callback configurations and upload acceleration configurations. The value is a JSON string. For more information, see the "UserData: specifies the custom configurations for media upload" section of the [Request parameters](~~86952~~) topic.
    // 
    // > * The callback configurations take effect only after you specify the HTTP callback URL and select the specific callback events in the ApsaraVideo VOD console. For more information about how to configure an HTTP callback in the ApsaraVideo VOD console, see [Configure callback settings](~~86071~~).
    // > * To use the upload acceleration feature, submit a [ticket](https://ticket-intl.console.aliyun.com/#/ticket/createIndex) to enable this feature. For more information, see [Overview](~~55396~~).
    @NameInMap("UserData")
    public String userData;

    // The ID of the workflow. To view the ID of the workflow, log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Workflows**.
    // 
    // > If both the WorkflowId and TemplateGroupId parameters are set, the value of the WorkflowId parameter takes effect. For more information, see [Workflows](~~115347~~).
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
