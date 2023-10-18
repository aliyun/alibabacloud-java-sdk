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
     * <p>The custom identifier for deduplication. If you specify this parameter and send a request, an error is returned if a request with the same identifier was sent in the last 10 minutes. A custom identifier can be up to 50 characters in length and can contain letters, digits, hyphens (-), and underscores (\_). If you do not specify this parameter or leave this parameter empty, duplicate requests are not filtered.</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The storage address of the media file.</p>
     * <br>
     * <p>To view the storage address, log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com/?spm=a2c4g.11186623.2.15.6948257eaZ4m54#/vod/settings/censored). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Storage**. If you do not specify a storage address, the default storage address is used.</p>
     */
    @NameInMap("StorageLocation")
    public String storageLocation;

    /**
     * <p>The ID of the transcoding template group. You can use one of the following methods to obtain the ID of the transcoding template group:</p>
     * <br>
     * <p>*   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Transcoding Template Groups**. On the Transcoding Template Groups page, view the ID of the transcoding template group.</p>
     * <p>*   Obtain the value of TranscodeTemplateGroupId from the response to the [AddTranscodeTemplateGroup](~~102665~~) operation.</p>
     * <p>*   Obtain the value of TranscodeTemplateGroupId from the response to the [ListTranscodeTemplateGroup](~~102669~~) operation.</p>
     * <br>
     * <p>>-   If you leave this parameter empty, the default transcoding template group is used for transcoding. If you specify this parameter, the specified transcoding template group is used for transcoding.</p>
     * <p>>-   You can also specify the ID of the transcoding template group in `UploadMetadatas`. If you specify this parameter and TemplateGroupId in UploadMetadatas, the TemplateGroupId in UploadMetadatas takes effect.</p>
     */
    @NameInMap("TemplateGroupId")
    public String templateGroupId;

    /**
     * <p>The metadata of the media file that you want to upload. The value must be a JSON string.</p>
     * <br>
     * <p>*   This parameter takes effect only if SourceURL matches the URL that you specified for UploadURLs.</p>
     * <p>*   You must convert the JSON-formatted data such as `[UploadMetadata, UploadMetadata,…]` to a JSON string.</p>
     * <p>*   For more information, see the **UploadMetadata** table.</p>
     */
    @NameInMap("UploadMetadatas")
    public String uploadMetadatas;

    /**
     * <p>The URL of the media file.</p>
     * <br>
     * <p>*   You must include a file name extension in the URL, such as `https://****.mp4`.</p>
     * <br>
     * <p>    *   If the URL does not contain a file name extension, specify a file name extension for `FileExtension` in `UploadMetadatas`.</p>
     * <p>    *   If you specify `FileExtension` when the URL contains a file name extension, the file name extension that you specified for `FileExtension` takes effect.</p>
     * <p>    *   For more information about file name extensions supported by ApsaraVideo VOD, see [Overview](~~55396~~).</p>
     * <br>
     * <p>*   URL encoding is required. Separate multiple URLs with commas (,). You can specify a maximum of 20 URLs.</p>
     * <br>
     * <p>*   Special characters may cause upload failures. You must encode URLs before you separate them with commas (,).</p>
     */
    @NameInMap("UploadURLs")
    public String uploadURLs;

    /**
     * <p>The custom configurations such as callback configurations and upload acceleration configurations. The value must be a JSON string. For more information, see [Request parameters](~~86952#UserData~~).</p>
     * <br>
     * <p>>-   The callback configurations take effect only after you specify the HTTP callback URL and select specific callback events in the ApsaraVideo VOD console. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see [Configure callback settings](~~86071~~).</p>
     * <p>>-   If you want to enable the upload acceleration feature, [submit a request on Yida](https://yida.alibaba-inc.com/o/ticketapply). For more information, see [Overview](~~55396~~).</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the workflow. To view the ID of the workflow, log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Workflows**.</p>
     * <br>
     * <p>> If you specify WorkflowId and TemplateGroupId, the value of WorkflowId takes effect. For more information, see [Workflows](~~115347~~).</p>
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

    public UploadMediaByURLRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
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
