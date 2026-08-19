// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshMediaPlayUrlsRequest extends TeaModel {
    /**
     * <p>Specifies the definitions of the streams that you want to purge or prefetch. You can specify multiple definitions. Separate multiple definitions with commas (,). If you do not specify this parameter, <strong>streams in all definitions are purged or prefetched by default</strong>.</p>
     * <blockquote>
     * <p>The value must be one of the values defined in <strong>Definition</strong> in <a href="https://help.aliyun.com/document_detail/124671.html">Metric description for media assets</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HD, SD</p>
     */
    @NameInMap("Definitions")
    public String definitions;

    /**
     * <p>The streaming formats that you want to refresh or prefetch. You can specify multiple formats. Separate multiple formats with commas (,). If you do not specify this parameter, <strong>streams in all formats are refreshed or prefetched by default</strong>. Valid values:</p>
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
     * <p>The IDs of the audio or video files that you want to refresh or prefetch. You can specify one or more IDs. Separate multiple IDs with commas (,). You can specify up to 20 IDs.
     * You can obtain audio or video IDs by using the following methods:</p>
     * <ul>
     * <li>For audio or video files uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the audio or video ID.</li>
     * <li>When you call the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation to obtain the upload URL and credential, the audio or video ID is the value of the VideoId response parameter.</li>
     * <li>After the audio or video file is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the audio or video ID, which is the value of the VideoId response parameter.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca3a8f6e4957b658067095869****, a6e49sfgd23p5g9ja7095863****</p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    /**
     * <p>The result type of the refresh or prefetch task. Valid values:</p>
     * <ul>
     * <li><strong>Single</strong> (default): Only the latest transcoded stream for each definition and format is refreshed or prefetched.</li>
     * <li><strong>Multiple</strong>: All transcoded streams for each definition and format are refreshed or prefetched.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Single</p>
     */
    @NameInMap("ResultType")
    public String resultType;

    /**
     * <p>The number of TS file playback URLs to refresh or prefetch for M3U8 streams. Only the first N TS file playback URLs of each M3U8 stream are refreshed or prefetched. Valid values: 1 to 20. <strong>Default value: 5</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SliceCount")
    public Integer sliceCount;

    /**
     * <p>Specifies whether to refresh or prefetch the playback URLs of TS files in M3U8 streams. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): No.</li>
     * <li><strong>true</strong>: Yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SliceFlag")
    public Boolean sliceFlag;

    /**
     * <p>The types of the streams that you want to refresh or prefetch. You can specify multiple stream types. Separate multiple stream types with commas (,). If you do not specify this parameter, <strong>all stream types are refreshed or prefetched by default</strong>. Valid values:</p>
     * <ul>
     * <li><strong>video</strong>: video.</li>
     * <li><strong>audio</strong>: audio.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("StreamType")
    public String streamType;

    /**
     * <p>The type of the task. Valid values:</p>
     * <ul>
     * <li><strong>Refresh</strong>: purge.</li>
     * <li><strong>Preload</strong>: prefetch.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Preload</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The custom settings. The value is a JSON string that supports settings such as message callbacks and upload acceleration. For more information, see <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
     * <blockquote>
     * <ul>
     * <li>To use message callbacks in this parameter, configure an HTTP callback URL and select the corresponding callback event types in the console. Otherwise, the callback settings do not take effect. For information about how to configure HTTP callbacks in the console, see <a href="https://help.aliyun.com/document_detail/86071.html">Callback settings</a>.</li>
     * <li>To use the upload acceleration feature, submit a ticket to activate it. For more information, see <a href="https://help.aliyun.com/document_detail/55396.html">Upload instructions</a>. For information about how to submit a ticket, see <a href="https://help.aliyun.com/document_detail/464625.html">Contact us</a>.</li>
     * </ul>
     * </blockquote>
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
