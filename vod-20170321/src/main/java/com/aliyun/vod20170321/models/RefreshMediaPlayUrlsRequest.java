// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshMediaPlayUrlsRequest extends TeaModel {
    // Specifies the resolutions of the media streams you want to refresh or prefetch. You can specify multiple resolutions. Separate multiple resolutions with commas (,). If you leave this parameter empty, media streams in all resolutions are refreshed or prefetched by default.
    // 
    // >  The value must be supported in the **Definition** section in [Parameters for media assets](~~124671~~).
    @NameInMap("Definitions")
    public String definitions;

    // The formats of the media streams you want to refresh or prefetch. You can specify multiple formats. Separate multiple formats with commas (,). If you leave this parameter empty, media streams in all formats are refreshed or prefetched by default. Valid values:
    // 
    // *   **mp4**
    // *   **m3u8**
    // *   **mp3**
    // *   **flv**
    // *   **webm**
    // *   **ts**
    @NameInMap("Formats")
    public String formats;

    // The IDs of the media files that you want to refresh or prefetch. You can specify a maximum of 20 IDs. Separate multiple IDs with commas (,). You can use one of the following methods to obtain the ID:
    // 
    // *   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, view the ID of the audio or video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.
    // *   Obtain the value of VideoId from the response to the [CreateUploadVideo](~~55407~~) operation that you call to upload media files.
    // *   Obtain the value of VideoId from the response to the [SearchMedia](~~86044~~) operation that you call to query the media ID after the media file is uploaded.
    @NameInMap("MediaIds")
    public String mediaIds;

    // Specifies the type of the refresh or prefetch operation. Default value: Single. Valid values:
    // 
    // *   **Single**: Only one latest transcoded stream is refreshed or prefetched for each resolution and format.
    // *   **Multiple**: All transcoded streams are refreshed or prefetched for each resolution and format.
    @NameInMap("ResultType")
    public String resultType;

    // Specifies the number of the playback URLs of the TS files for the M3U8 media stream you want to refresh or prefetch. After you set this parameter, only the playback URLs of the first N TS files will be refreshed or prefetched. Valid values: 1 to 20. Default value: 5.
    @NameInMap("SliceCount")
    public Integer sliceCount;

    // Specifies whether to refresh or prefetch the playback URLs of the TS files of the M3U8 media stream. Default value: false. Valid values:
    // 
    // *   **false**
    // *   **true**
    @NameInMap("SliceFlag")
    public Boolean sliceFlag;

    // Specifies the types of media streams you want to refresh or prefetch. You can specify multiple types. Separate multiple types with commas (,). If you leave this parameter empty, media streams in all types are refreshed or prefetched by default. Valid values:
    // 
    // *   **video**
    // *   **audio**
    @NameInMap("StreamType")
    public String streamType;

    // The type of the task that you want to create. Valid values:
    // 
    // *   **Refresh**
    // *   **Preload**
    @NameInMap("TaskType")
    public String taskType;

    // The custom configurations such as callback configurations and upload acceleration configurations. The value is a JSON string. For more information, see [Request parameter](~~86952~~).
    // > 
    // - The callback configurations take effect only after you specify the HTTP callback URL and select specific callback events in the ApsaraVideo VOD console. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see [Configure callback settings](~~86071~~).
    // - You must submit a ticket to enable the upload acceleration feature. For more information, see [Overview](~~55396~~).
    @NameInMap("UserData")
    public String userData;

    public static RefreshMediaPlayUrlsRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshMediaPlayUrlsRequest self = new RefreshMediaPlayUrlsRequest();
        return TeaModel.build(map, self);
    }

    public RefreshMediaPlayUrlsRequest setDefinitions(String definitions) {
        this.definitions = definitions;
        return this;
    }
    public String getDefinitions() {
        return this.definitions;
    }

    public RefreshMediaPlayUrlsRequest setFormats(String formats) {
        this.formats = formats;
        return this;
    }
    public String getFormats() {
        return this.formats;
    }

    public RefreshMediaPlayUrlsRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

    public RefreshMediaPlayUrlsRequest setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public RefreshMediaPlayUrlsRequest setSliceCount(Integer sliceCount) {
        this.sliceCount = sliceCount;
        return this;
    }
    public Integer getSliceCount() {
        return this.sliceCount;
    }

    public RefreshMediaPlayUrlsRequest setSliceFlag(Boolean sliceFlag) {
        this.sliceFlag = sliceFlag;
        return this;
    }
    public Boolean getSliceFlag() {
        return this.sliceFlag;
    }

    public RefreshMediaPlayUrlsRequest setStreamType(String streamType) {
        this.streamType = streamType;
        return this;
    }
    public String getStreamType() {
        return this.streamType;
    }

    public RefreshMediaPlayUrlsRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public RefreshMediaPlayUrlsRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
