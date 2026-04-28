// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class VideoPreviewPlayInfo extends TeaModel {
    /**
     * <p>Category</p>
     * 
     * <strong>example:</strong>
     * <p>live_transcoding</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>Live transcoding subtitle information.</p>
     */
    @NameInMap("live_transcoding_subtitle_task_list")
    public java.util.List<VideoPreviewSubtitleInfo> liveTranscodingSubtitleTaskList;

    /**
     * <p>The information about video playback.</p>
     */
    @NameInMap("live_transcoding_task_list")
    public java.util.List<VideoPreviewPlayInfoLiveTranscodingTaskList> liveTranscodingTaskList;

    /**
     * <p>Playback URL of master m3u8.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://pds-xxx-valueadd.oss-xxx.aliyuncs.com/qv/xxx/master.m3u8">https://pds-xxx-valueadd.oss-xxx.aliyuncs.com/qv/xxx/master.m3u8</a></p>
     */
    @NameInMap("master_url")
    public String masterUrl;

    /**
     * <p>Video meta information.</p>
     */
    @NameInMap("meta")
    public VideoPreviewPlayInfoMeta meta;

    /**
     * <p>Offline transcoding playback information.</p>
     */
    @NameInMap("offline_video_transcoding_list")
    public java.util.List<VideoPreviewPlayInfoOfflineVideoTranscodingList> offlineVideoTranscodingList;

    /**
     * <p>Offline transcoding subtitle information.</p>
     */
    @NameInMap("offline_video_transcoding_subtitle_list")
    public java.util.List<VideoPreviewSubtitleInfo> offlineVideoTranscodingSubtitleList;

    /**
     * <p>The information about video playback.</p>
     */
    @NameInMap("quick_video_list")
    public java.util.List<VideoPreviewPlayInfoQuickVideoList> quickVideoList;

    /**
     * <p>Quick transcoding subtitle information.</p>
     */
    @NameInMap("quick_video_subtitle_list")
    public java.util.List<VideoPreviewSubtitleInfo> quickVideoSubtitleList;

    public static VideoPreviewPlayInfo build(java.util.Map<String, ?> map) throws Exception {
        VideoPreviewPlayInfo self = new VideoPreviewPlayInfo();
        return TeaModel.build(map, self);
    }

    public VideoPreviewPlayInfo setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public VideoPreviewPlayInfo setLiveTranscodingSubtitleTaskList(java.util.List<VideoPreviewSubtitleInfo> liveTranscodingSubtitleTaskList) {
        this.liveTranscodingSubtitleTaskList = liveTranscodingSubtitleTaskList;
        return this;
    }
    public java.util.List<VideoPreviewSubtitleInfo> getLiveTranscodingSubtitleTaskList() {
        return this.liveTranscodingSubtitleTaskList;
    }

    public VideoPreviewPlayInfo setLiveTranscodingTaskList(java.util.List<VideoPreviewPlayInfoLiveTranscodingTaskList> liveTranscodingTaskList) {
        this.liveTranscodingTaskList = liveTranscodingTaskList;
        return this;
    }
    public java.util.List<VideoPreviewPlayInfoLiveTranscodingTaskList> getLiveTranscodingTaskList() {
        return this.liveTranscodingTaskList;
    }

    public VideoPreviewPlayInfo setMasterUrl(String masterUrl) {
        this.masterUrl = masterUrl;
        return this;
    }
    public String getMasterUrl() {
        return this.masterUrl;
    }

    public VideoPreviewPlayInfo setMeta(VideoPreviewPlayInfoMeta meta) {
        this.meta = meta;
        return this;
    }
    public VideoPreviewPlayInfoMeta getMeta() {
        return this.meta;
    }

    public VideoPreviewPlayInfo setOfflineVideoTranscodingList(java.util.List<VideoPreviewPlayInfoOfflineVideoTranscodingList> offlineVideoTranscodingList) {
        this.offlineVideoTranscodingList = offlineVideoTranscodingList;
        return this;
    }
    public java.util.List<VideoPreviewPlayInfoOfflineVideoTranscodingList> getOfflineVideoTranscodingList() {
        return this.offlineVideoTranscodingList;
    }

    public VideoPreviewPlayInfo setOfflineVideoTranscodingSubtitleList(java.util.List<VideoPreviewSubtitleInfo> offlineVideoTranscodingSubtitleList) {
        this.offlineVideoTranscodingSubtitleList = offlineVideoTranscodingSubtitleList;
        return this;
    }
    public java.util.List<VideoPreviewSubtitleInfo> getOfflineVideoTranscodingSubtitleList() {
        return this.offlineVideoTranscodingSubtitleList;
    }

    public VideoPreviewPlayInfo setQuickVideoList(java.util.List<VideoPreviewPlayInfoQuickVideoList> quickVideoList) {
        this.quickVideoList = quickVideoList;
        return this;
    }
    public java.util.List<VideoPreviewPlayInfoQuickVideoList> getQuickVideoList() {
        return this.quickVideoList;
    }

    public VideoPreviewPlayInfo setQuickVideoSubtitleList(java.util.List<VideoPreviewSubtitleInfo> quickVideoSubtitleList) {
        this.quickVideoSubtitleList = quickVideoSubtitleList;
        return this;
    }
    public java.util.List<VideoPreviewSubtitleInfo> getQuickVideoSubtitleList() {
        return this.quickVideoSubtitleList;
    }

    public static class VideoPreviewPlayInfoLiveTranscodingTaskList extends TeaModel {
        /**
         * <p>Whether the original resolution is maintained.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("keep_original_resolution")
        public Boolean keepOriginalResolution;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>finished: The index is complete, and the url can be obtained.</li>
         * <li>running: Indexing in progress. Wait a moment and try again.</li>
         * <li>failed: Transcoding failed. Check the media file. If you have any questions, contact customer service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>finished</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>264_480p</p>
         */
        @NameInMap("template_id")
        public String templateId;

        /**
         * <p>Playback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.data.aliyunpds.com/lt/xxx/media.m3u8">https://example.data.aliyunpds.com/lt/xxx/media.m3u8</a></p>
         */
        @NameInMap("url")
        public String url;

        public static VideoPreviewPlayInfoLiveTranscodingTaskList build(java.util.Map<String, ?> map) throws Exception {
            VideoPreviewPlayInfoLiveTranscodingTaskList self = new VideoPreviewPlayInfoLiveTranscodingTaskList();
            return TeaModel.build(map, self);
        }

        public VideoPreviewPlayInfoLiveTranscodingTaskList setKeepOriginalResolution(Boolean keepOriginalResolution) {
            this.keepOriginalResolution = keepOriginalResolution;
            return this;
        }
        public Boolean getKeepOriginalResolution() {
            return this.keepOriginalResolution;
        }

        public VideoPreviewPlayInfoLiveTranscodingTaskList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public VideoPreviewPlayInfoLiveTranscodingTaskList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public VideoPreviewPlayInfoLiveTranscodingTaskList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class VideoPreviewPlayInfoMeta extends TeaModel {
        /**
         * <p>Video length.</p>
         * 
         * <strong>example:</strong>
         * <p>4.2898</p>
         */
        @NameInMap("duration")
        public Double duration;

        /**
         * <p>Height of the video</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("height")
        public Long height;

        /**
         * <p>Width of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("width")
        public Long width;

        public static VideoPreviewPlayInfoMeta build(java.util.Map<String, ?> map) throws Exception {
            VideoPreviewPlayInfoMeta self = new VideoPreviewPlayInfoMeta();
            return TeaModel.build(map, self);
        }

        public VideoPreviewPlayInfoMeta setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public VideoPreviewPlayInfoMeta setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public VideoPreviewPlayInfoMeta setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

    public static class VideoPreviewPlayInfoOfflineVideoTranscodingList extends TeaModel {
        /**
         * <p>Whether the transcoded video has the same resolution as the source video.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("keep_original_resolution")
        public Boolean keepOriginalResolution;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>finished</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>264_1080p</p>
         */
        @NameInMap("template_id")
        public String templateId;

        /**
         * <p>Playback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.data.aliyunpds.com/xxx/master.mp4">https://example.data.aliyunpds.com/xxx/master.mp4</a></p>
         */
        @NameInMap("url")
        public String url;

        public static VideoPreviewPlayInfoOfflineVideoTranscodingList build(java.util.Map<String, ?> map) throws Exception {
            VideoPreviewPlayInfoOfflineVideoTranscodingList self = new VideoPreviewPlayInfoOfflineVideoTranscodingList();
            return TeaModel.build(map, self);
        }

        public VideoPreviewPlayInfoOfflineVideoTranscodingList setKeepOriginalResolution(Boolean keepOriginalResolution) {
            this.keepOriginalResolution = keepOriginalResolution;
            return this;
        }
        public Boolean getKeepOriginalResolution() {
            return this.keepOriginalResolution;
        }

        public VideoPreviewPlayInfoOfflineVideoTranscodingList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public VideoPreviewPlayInfoOfflineVideoTranscodingList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public VideoPreviewPlayInfoOfflineVideoTranscodingList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class VideoPreviewPlayInfoQuickVideoList extends TeaModel {
        /**
         * <p>Valid values:</p>
         * <ul>
         * <li>finished: The index is complete, and the url can be obtained.</li>
         * <li>running: Indexing in progress. Wait a moment and try again.</li>
         * <li>failed: Transcoding failed. Check the media file. If you have any questions, contact customer service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>finished</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Template ID</p>
         * 
         * <strong>example:</strong>
         * <p>264_480p</p>
         */
        @NameInMap("template_id")
        public String templateId;

        /**
         * <p>Playback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.data.aliyunpds.com/qv/xxx/media.m3u8">https://example.data.aliyunpds.com/qv/xxx/media.m3u8</a></p>
         */
        @NameInMap("url")
        public String url;

        public static VideoPreviewPlayInfoQuickVideoList build(java.util.Map<String, ?> map) throws Exception {
            VideoPreviewPlayInfoQuickVideoList self = new VideoPreviewPlayInfoQuickVideoList();
            return TeaModel.build(map, self);
        }

        public VideoPreviewPlayInfoQuickVideoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public VideoPreviewPlayInfoQuickVideoList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public VideoPreviewPlayInfoQuickVideoList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
