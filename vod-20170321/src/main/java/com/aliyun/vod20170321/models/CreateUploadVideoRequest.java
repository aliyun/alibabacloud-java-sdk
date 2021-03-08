// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadVideoRequest extends TeaModel {
    @NameInMap("CoverURL")
    public String coverURL;

    @NameInMap("Description")
    public String description;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileSize")
    public Long fileSize;

    @NameInMap("IP")
    public String IP;

    @NameInMap("Title")
    public String title;

    @NameInMap("CateId")
    public Long cateId;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("TranscodeMode")
    public String transcodeMode;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("TemplateGroupId")
    public String templateGroupId;

    @NameInMap("WorkflowId")
    public String workflowId;

    @NameInMap("StorageLocation")
    public String storageLocation;

    @NameInMap("CustomMediaInfo")
    public String customMediaInfo;

    @NameInMap("AppId")
    public String appId;

    public static CreateUploadVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadVideoRequest self = new CreateUploadVideoRequest();
        return TeaModel.build(map, self);
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

    public CreateUploadVideoRequest setIP(String IP) {
        this.IP = IP;
        return this;
    }
    public String getIP() {
        return this.IP;
    }

    public CreateUploadVideoRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateUploadVideoRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public CreateUploadVideoRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateUploadVideoRequest setTranscodeMode(String transcodeMode) {
        this.transcodeMode = transcodeMode;
        return this;
    }
    public String getTranscodeMode() {
        return this.transcodeMode;
    }

    public CreateUploadVideoRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public CreateUploadVideoRequest setTemplateGroupId(String templateGroupId) {
        this.templateGroupId = templateGroupId;
        return this;
    }
    public String getTemplateGroupId() {
        return this.templateGroupId;
    }

    public CreateUploadVideoRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

    public CreateUploadVideoRequest setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public String getStorageLocation() {
        return this.storageLocation;
    }

    public CreateUploadVideoRequest setCustomMediaInfo(String customMediaInfo) {
        this.customMediaInfo = customMediaInfo;
        return this;
    }
    public String getCustomMediaInfo() {
        return this.customMediaInfo;
    }

    public CreateUploadVideoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
