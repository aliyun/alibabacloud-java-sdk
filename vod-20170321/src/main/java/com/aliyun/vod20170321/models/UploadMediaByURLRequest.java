// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UploadMediaByURLRequest extends TeaModel {
    /**
     * <p>## UploadMetadata</p>
     * <br>
     * <p>| Parameter | Type | Required | Description |</p>
     * <p>| --------- | ---- | -------- | ----------- |</p>
     * <p>| SourceURL | String | Yes | The URL of the source file to be uploaded. |</p>
     * <p>| Title | String | Yes | The title of the media file. The title can be up to 128 bytes in length. The value must be encoded in UTF-8. |</p>
     * <p>| FileSize | String | No | The size of the media file. |</p>
     * <p>| Description | String | No | The description of the media file. The description can be up to 1,024 bytes in length. The value must be encoded in UTF-8. |</p>
     * <p>| CoverURL | String | No | The URL of the custom thumbnail of the media file. |</p>
     * <p>| CateId | String | No | The category ID of the media file. To view the category ID of the media file, log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com/). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Categories**. |</p>
     * <p>| Tags | String | No | The one or more tags of the media file. Each tag can be up to 32 bytes in length. You can set a maximum of 16 tags. Separate multiple tags with commas (,). The value must be encoded in UTF-8. |</p>
     * <p>| TemplateGroupId | String | No | The ID of the transcoding template group. If both the request parameter TemplateGroupId and the nested parameter TemplateGroupId are set, the value of the nested parameter takes effect. |</p>
     * <p>| WorkflowId | String | No | The ID of the workflow. If both the WorkflowId and TemplateGroupId parameters are set, the value of the WorkflowId parameter takes effect. For more information, see [Workflows](https://www.alibabacloud.com/help/en/apsaravideo-for-vod/latest/workflows). |</p>
     * <p>| FileExtension | String | No | The file name extension of the media file. For more information about file name extensions supported by ApsaraVideo VOD, see [Overview](https://www.alibabacloud.com/help/en/apsaravideo-for-vod/latest/upload-medias-overview). |</p>
     * <p>> - Do not include emoticons in the nested parameters, such as Title, Description, and Tags, under the UploadMetadata parameter.</p>
     * <p>- If you set the TemplateGroupId parameter to VOD_NO_TRANSCODE to upload videos, only the videos in the format of MP4, FLV, MP3, M3U8, or WebM can be played. Videos in the other formats are supported only for storage. You can identify the video format based on the file name extension. If you want to use ApsaraVideo Player, the version must be 3.1.0 or later.</p>
     * <p>- If you set the TemplateGroupId parameter to VOD_NO_TRANSCODE, only the [FileUploadComplete](https://www.alibabacloud.com/help/en/apsaravideo-for-vod/latest/fileuploadcomplete) but not the [StreamTranscodeComplete](https://www.alibabacloud.com/help/en/apsaravideo-for-vod/latest/streamtranscodecomplete) event notification is returned after the media file is uploaded.</p>
     * <p>- If a callback is configured, ApsaraVideo VOD sends an [UploadByURLComplete](https://www.alibabacloud.com/help/en/apsaravideo-for-vod/latest/uploadbyurlcomplete) event notification after the media file is uploaded, in addition to the FileUploadComplete and StreamTranscodeComplete event notifications.</p>
     * <p>- If you specify multiple media files at a time, ApsaraVideo VOD sends an event notification for each media file after the media file is uploaded.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The URL of the source file.</p>
     * <p>* The URL must contain a file name extension, such as mp4 in `https://****.mp4`.</p>
     * <p>    * If the URL does not contain a file name extension, you can specify one by setting the `FileExtension` parameter under the `UploadMetadatas` parameter.</p>
     * <p>    * If the URL contains a file name extension and the `FileExtension` parameter is set, the value of the `FileExtension` parameter is used.</p>
     * <p>    * For more information about file name extensions supported by ApsaraVideo VOD, see [Overview](~~55396~~).</p>
     * <p>* URL encoding is required. Separate multiple URLs with commas (,). You can specify a maximum of 20 URLs.</p>
     * <p>* Special characters may cause upload failures. Therefore, encode URLs before you separate them with commas (,).</p>
     */
    @NameInMap("StorageLocation")
    public String storageLocation;

    /**
     * <p>The information about one or more upload jobs.</p>
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
     * <p>The ID of the application. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).</p>
     */
    @NameInMap("UploadURLs")
    public String uploadURLs;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>> This operation is used to asynchronously upload media files. Upload jobs are queued for execution after they are submitted. The completion time of an upload job varies with the number of jobs in the queue.</p>
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
