// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UploadMediaByURLRequest extends TeaModel {
    /**
     * <p>The ID of the application. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The storage location of the media file.</p>
     * <br>
     * <p>Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com/?spm=a2c4g.11186623.2.15.6948257eaZ4m54#/vod/settings/censored). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Storage**. On the Storage page, you can view the storage location. If you do not specify the storage location, the default storage location is used.</p>
     */
    @NameInMap("StorageLocation")
    public String storageLocation;

    /**
     * <p>The ID of the transcoding template group. You can use one of the following methods to obtain the ID of the transcoding template group:</p>
     * <p>* Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Transcoding Template Groups**. On the Transcoding Template Groups page, you can view the ID of the transcoding template group.</p>
     * <p>* View the value of the TranscodeTemplateGroupId parameter returned by the [AddTranscodeTemplateGroup](~~102665~~) operation that you called to create a transcoding template group.</p>
     * <p>* View the value of the TranscodeTemplateGroupId parameter returned by the [ListTranscodeTemplateGroup](~~102669~~) operation that you called to query a transcoding template group.</p>
     * <p>> * If this parameter is left empty, the default transcoding template group is used for transcoding. If this parameter is set to a specific value, the specified transcoding template group is used for transcoding.</p>
     * <p>> * You can also specify the ID of the transcoding template group by using the nested TemplateGroupId parameter under the `UploadMetadatas` parameter. If you set this parameter and the nested TemplateGroupId parameter, the value of the nested TemplateGroupId parameter takes effect.</p>
     */
    @NameInMap("TemplateGroupId")
    public String templateGroupId;

    /**
     * <p>The metadata of the media file to be uploaded. The value is a JSON string.</p>
     * <p>* This parameter takes effect only if the value of the SourceURL parameter matches the URL that is specified by the UploadURLs parameter.</p>
     * <p>* The JSON-formatted data, such as `[UploadMetadata, UploadMetadata,…]`, must be converted into a JSON string.</p>
     * <p>* For more information, see the **UploadMetadata** section.</p>
     */
    @NameInMap("UploadMetadatas")
    public String uploadMetadatas;

    /**
     * <p>The URL of the source file.</p>
     * <p>* The URL must contain a file name extension, such as mp4 in `https://****.mp4`.</p>
     * <p>    * If the URL does not contain a file name extension, you can specify one by setting the `FileExtension` parameter under the `UploadMetadatas` parameter.</p>
     * <p>    * If the URL contains a file name extension and the `FileExtension` parameter is set, the value of the `FileExtension` parameter is used.</p>
     * <p>    * For more information about file name extensions supported by ApsaraVideo VOD, see [Overview](~~55396~~).</p>
     * <p>* URL encoding is required. Separate multiple URLs with commas (,). You can specify a maximum of 20 URLs.</p>
     * <p>* Special characters may cause upload failures. Therefore, encode URLs before you separate them with commas (,).</p>
     */
    @NameInMap("UploadURLs")
    public String uploadURLs;

    /**
     * <p>The custom configurations, including callback configurations and upload acceleration configurations. The value is a JSON string. For more information, see the "UserData: specifies the custom configurations for media upload" section of the [Request parameters](~~86952#UserData~~) topic.</p>
     * <p>> * The callback configurations take effect only if you specify the HTTP callback URL and select the specific callback events in the ApsaraVideo VOD console. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see [Configure callback settings](~~86071~~).</p>
     * <p>> * To use the upload acceleration feature, submit a [ticket](https://ticket-intl.console.aliyun.com/#/ticket/createIndex) to enable this feature. For more information, see [Overview](~~55396~~).</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the workflow. To view the ID of the workflow, log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Workflows**.</p>
     * <p>> If both the WorkflowId and TemplateGroupId parameters are set, the value of the WorkflowId parameter takes effect. For more information, see [Workflows](~~115347~~).</p>
     */
    @NameInMap("WorkflowId")
    public String workflowId;

    public static UploadMediaByURLRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadMediaByURLRequest self = new UploadMediaByURLRequest();
        return TeaModel.build(map, self);
    }

    public UploadMediaByURLRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UploadMediaByURLRequest setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public String getStorageLocation() {
        return this.storageLocation;
    }

    public UploadMediaByURLRequest setTemplateGroupId(String templateGroupId) {
        this.templateGroupId = templateGroupId;
        return this;
    }
    public String getTemplateGroupId() {
        return this.templateGroupId;
    }

    public UploadMediaByURLRequest setUploadMetadatas(String uploadMetadatas) {
        this.uploadMetadatas = uploadMetadatas;
        return this;
    }
    public String getUploadMetadatas() {
        return this.uploadMetadatas;
    }

    public UploadMediaByURLRequest setUploadURLs(String uploadURLs) {
        this.uploadURLs = uploadURLs;
        return this;
    }
    public String getUploadURLs() {
        return this.uploadURLs;
    }

    public UploadMediaByURLRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public UploadMediaByURLRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
