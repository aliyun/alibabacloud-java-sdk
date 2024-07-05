// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshMediaPlayUrlsRequest extends TeaModel {
    /**
     * <p>Specifies the resolutions of the media streams you want to refresh or prefetch. You can specify multiple resolutions. Separate multiple resolutions with commas (,). If you leave this parameter empty, media streams in all resolutions are refreshed or prefetched by default.</p>
     * <blockquote>
     * <p> The value must be supported in the <strong>Definition</strong> section in <a href="https://help.aliyun.com/document_detail/124671.html">Parameters for media assets</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HD, SD</p>
     */
    @NameInMap("Definitions")
    public String definitions;

    /**
     * <p>The formats of the media streams you want to refresh or prefetch. You can specify multiple formats. Separate multiple formats with commas (,). If you leave this parameter empty, media streams in all formats are refreshed or prefetched by default. Valid values:</p>
     * <ul>
     * <li><strong>mp4</strong></li>
     * <li><strong>m3u8</strong></li>
     * <li><strong>mp3</strong></li>
     * <li><strong>flv</strong></li>
     * <li><strong>webm</strong></li>
     * <li><strong>ts</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mp4,m3u8</p>
     */
    @NameInMap("Formats")
    public String formats;

    /**
     * <p>The IDs of the media files that you want to refresh or prefetch. You can specify a maximum of 20 IDs. Separate multiple IDs with commas (,). You can use one of the following methods to obtain the ID:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD</a> console. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong>. On the Video and Audio page, view the ID of the audio or video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</li>
     * <li>Obtain the value of VideoId from the response to the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation that you call to upload media files.</li>
     * <li>Obtain the value of VideoId from the response to the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation that you call to query the media ID after the media file is uploaded.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca3a8f6e4957b658067095869****, a6e49sfgd23p5g9ja7095863****</p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    /**
     * <p>Specifies the type of the refresh or prefetch operation. Default value: Single. Valid values:</p>
     * <ul>
     * <li><strong>Single</strong>: Only one latest transcoded stream is refreshed or prefetched for each resolution and format.</li>
     * <li><strong>Multiple</strong>: All transcoded streams are refreshed or prefetched for each resolution and format.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Single</p>
     */
    @NameInMap("ResultType")
    public String resultType;

    /**
     * <p>Specifies the number of the playback URLs of the TS files for the M3U8 media stream you want to refresh or prefetch. After you set this parameter, only the playback URLs of the first N TS files will be refreshed or prefetched. Valid values: 1 to 20. Default value: 5.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SliceCount")
    public Integer sliceCount;

    /**
     * <p>Specifies whether to refresh or prefetch the playback URLs of the TS files of the M3U8 media stream. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>false</strong></li>
     * <li><strong>true</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SliceFlag")
    public Boolean sliceFlag;

    /**
     * <p>Specifies the types of media streams you want to refresh or prefetch. You can specify multiple types. Separate multiple types with commas (,). If you leave this parameter empty, media streams in all types are refreshed or prefetched by default. Valid values:</p>
     * <ul>
     * <li><strong>video</strong></li>
     * <li><strong>audio</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("StreamType")
    public String streamType;

    /**
     * <p>The type of the task that you want to create. Valid values:</p>
     * <ul>
     * <li><strong>Refresh</strong></li>
     * <li><strong>Preload</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Preload</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The custom configurations such as callback configurations and upload acceleration configurations. The value is a JSON string. For more information, see <a href="https://help.aliyun.com/document_detail/86952.html">Request parameter</a>.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>The callback configurations take effect only after you specify the HTTP callback URL and select specific callback events in the ApsaraVideo VOD console. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see <a href="https://help.aliyun.com/document_detail/86071.html">Configure callback settings</a>.</li>
     * <li>You must submit a ticket to enable the upload acceleration feature. For more information, see <a href="https://help.aliyun.com/document_detail/55396.html">Overview</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D">http://example.aliyundoc.com&quot;}</a>, &quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;test&quot;:&quot;www&quot;}}</p>
     */
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
