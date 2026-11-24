// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitEditMediaManifestJobRequest extends TeaModel {
    /**
     * <p>The list of audio tracks to be added. The value is a JSON string array. Each element contains the following fields:</p>
     * <ul>
     * <li><strong>Language</strong>: the language identifier of the audio track.</li>
     * <li><strong>Name</strong>: the display name of the track. If this field is not specified, the default value is audio-{Language}.</li>
     * <li><strong>AudioUrl</strong>: the URL of the audio file, which is an OSS object URL.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Language&quot;:&quot;spa&quot;,&quot;Name&quot;:&quot;audio-spa&quot;,&quot;AudioUrl&quot;:&quot;<a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/audio/spa.aac%22%7D%5D">https://your-bucket.oss-cn-shanghai.aliyuncs.com/audio/spa.aac&quot;}]</a></p>
     */
    @NameInMap("AudioTracks")
    public String audioTracks;

    /**
     * <p>The job ID of the target AUTO stream.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2c6581d59240de5e258ffa4c71a3****</p>
     */
    @NameInMap("AutoStreamJobId")
    public String autoStreamJobId;

    /**
     * <p>The output configuration. The value is a JSON string. It contains the following fields:</p>
     * <ul>
     * <li><strong>OutputDir</strong>: the output directory. By default, this field is set to the same directory as the source manifest.</li>
     * <li><strong>ManifestName</strong>: the file name of the output master playlist. Default value: master. The .m3u8 extension is not allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;OutputDir&quot;:&quot;output/editmanifest/&quot;,&quot;ManifestName&quot;:&quot;master&quot;}</p>
     */
    @NameInMap("OutputConfig")
    public String outputConfig;

    /**
     * <p>The configuration of tracks to be removed. The value is a JSON string. It contains the following fields:</p>
     * <ul>
     * <li><strong>AudioLanguages</strong>: the list of audio language identifiers for which the entire audio tracks are to be removed.</li>
     * <li><strong>SubtitleLanguages</strong>: the list of subtitle language identifiers for which the entire subtitle tracks are to be removed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AudioLanguages&quot;:[&quot;fra&quot;],&quot;SubtitleLanguages&quot;:[&quot;ger&quot;]}</p>
     */
    @NameInMap("RemoveTracks")
    public String removeTracks;

    /**
     * <p>The list of subtitle tracks to be added. The value is a JSON string array. Each element contains the following fields:</p>
     * <ul>
     * <li><strong>Language</strong>: the language identifier of the subtitle track. If this field is not specified, the subtitle track is ignored.</li>
     * <li><strong>SubtitleUrl</strong>: the URL of the subtitle file in WebVTT format, which is an OSS object URL.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Language&quot;:&quot;eng&quot;,&quot;SubtitleUrl&quot;:&quot;<a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/sub/eng.vtt%22%7D%5D">https://your-bucket.oss-cn-shanghai.aliyuncs.com/sub/eng.vtt&quot;}]</a></p>
     */
    @NameInMap("Subtitles")
    public String subtitles;

    /**
     * <p>The manifest editing template ID, which is returned after the AddManifestEditTemplate operation is called. If this parameter is specified, the output tracks are orchestrated based on the fixed video, audio, and subtitle item configurations in the template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9c6581d59240de5e258ffa4c71a3e01b</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The custom pass-through data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;remark&quot;:&quot;add-french-remove-english&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p><strong>The target video ID</strong>, used for authentication isolation and consistency verification.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2cd8a4f4a67cb7fb8e1236f847f4****</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    /**
     * <p>The list of video tracks to be added. The value is a JSON string array. Each element contains the following fields:</p>
     * <ul>
     * <li><strong>Name</strong>: the display name of the track. If this field is not specified, the video track is ignored.</li>
     * <li><strong>VideoUrl</strong>: the URL of the video stream manifest file, which is an OSS object URL.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Name&quot;:&quot;uhd&quot;,&quot;VideoUrl&quot;:&quot;<a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/video/uhd/uhd.m3u8%22%7D%5D">https://your-bucket.oss-cn-shanghai.aliyuncs.com/video/uhd/uhd.m3u8&quot;}]</a></p>
     */
    @NameInMap("VideoTracks")
    public String videoTracks;

    public static SubmitEditMediaManifestJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitEditMediaManifestJobRequest self = new SubmitEditMediaManifestJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitEditMediaManifestJobRequest setAudioTracks(String audioTracks) {
        this.audioTracks = audioTracks;
        return this;
    }
    public String getAudioTracks() {
        return this.audioTracks;
    }

    public SubmitEditMediaManifestJobRequest setAutoStreamJobId(String autoStreamJobId) {
        this.autoStreamJobId = autoStreamJobId;
        return this;
    }
    public String getAutoStreamJobId() {
        return this.autoStreamJobId;
    }

    public SubmitEditMediaManifestJobRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public SubmitEditMediaManifestJobRequest setRemoveTracks(String removeTracks) {
        this.removeTracks = removeTracks;
        return this;
    }
    public String getRemoveTracks() {
        return this.removeTracks;
    }

    public SubmitEditMediaManifestJobRequest setSubtitles(String subtitles) {
        this.subtitles = subtitles;
        return this;
    }
    public String getSubtitles() {
        return this.subtitles;
    }

    public SubmitEditMediaManifestJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitEditMediaManifestJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitEditMediaManifestJobRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

    public SubmitEditMediaManifestJobRequest setVideoTracks(String videoTracks) {
        this.videoTracks = videoTracks;
        return this;
    }
    public String getVideoTracks() {
        return this.videoTracks;
    }

}
