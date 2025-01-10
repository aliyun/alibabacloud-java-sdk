// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class VideoPreviewPlayInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>live_transcoding</p>
     */
    @NameInMap("category")
    public String category;

    @NameInMap("live_transcoding_subtitle_task_list")
    public java.util.List<VideoPreviewSubtitleInfo> liveTranscodingSubtitleTaskList;

    @NameInMap("live_transcoding_task_list")
    public java.util.List<VideoPreviewPlayInfoLiveTranscodingTaskList> liveTranscodingTaskList;

    @NameInMap("master_url")
    public String masterUrl;

    @NameInMap("meta")
    public VideoPreviewPlayInfoMeta meta;

    @NameInMap("offline_video_transcoding_list")
    public java.util.List<VideoPreviewPlayInfoOfflineVideoTranscodingList> offlineVideoTranscodingList;

    @NameInMap("offline_video_transcoding_subtitle_list")
    public java.util.List<VideoPreviewSubtitleInfo> offlineVideoTranscodingSubtitleList;

    @NameInMap("quick_video_list")
    public java.util.List<VideoPreviewPlayInfoQuickVideoList> quickVideoList;

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
        @NameInMap("keep_original_resolution")
        public Boolean keepOriginalResolution;

        @NameInMap("status")
        public String status;

        @NameInMap("template_id")
        public String templateId;

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
        @NameInMap("duration")
        public Double duration;

        @NameInMap("height")
        public Long height;

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
        @NameInMap("keep_original_resolution")
        public Boolean keepOriginalResolution;

        @NameInMap("status")
        public String status;

        @NameInMap("template_id")
        public String templateId;

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
        @NameInMap("status")
        public String status;

        @NameInMap("template_id")
        public String templateId;

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
