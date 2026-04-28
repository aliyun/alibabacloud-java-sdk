// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class VideoPreviewPlayMeta extends TeaModel {
    /**
     * <p>Category</p>
     * 
     * <strong>example:</strong>
     * <p>live_transcoding</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>Status of the live transcoding job.</p>
     */
    @NameInMap("live_transcoding_task_list")
    public java.util.List<VideoPreviewPlayMetaLiveTranscodingTaskList> liveTranscodingTaskList;

    /**
     * <p>Video meta information.</p>
     */
    @NameInMap("meta")
    public VideoPreviewPlayMetaMeta meta;

    /**
     * <p>The status of the offline transcoding job.</p>
     */
    @NameInMap("offline_video_transcoding_list")
    public java.util.List<VideoPreviewPlayMetaOfflineVideoTranscodingList> offlineVideoTranscodingList;

    /**
     * <p>The state of the transcoding job.</p>
     */
    @NameInMap("quick_video_list")
    public java.util.List<VideoPreviewPlayMetaQuickVideoList> quickVideoList;

    public static VideoPreviewPlayMeta build(java.util.Map<String, ?> map) throws Exception {
        VideoPreviewPlayMeta self = new VideoPreviewPlayMeta();
        return TeaModel.build(map, self);
    }

    public VideoPreviewPlayMeta setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public VideoPreviewPlayMeta setLiveTranscodingTaskList(java.util.List<VideoPreviewPlayMetaLiveTranscodingTaskList> liveTranscodingTaskList) {
        this.liveTranscodingTaskList = liveTranscodingTaskList;
        return this;
    }
    public java.util.List<VideoPreviewPlayMetaLiveTranscodingTaskList> getLiveTranscodingTaskList() {
        return this.liveTranscodingTaskList;
    }

    public VideoPreviewPlayMeta setMeta(VideoPreviewPlayMetaMeta meta) {
        this.meta = meta;
        return this;
    }
    public VideoPreviewPlayMetaMeta getMeta() {
        return this.meta;
    }

    public VideoPreviewPlayMeta setOfflineVideoTranscodingList(java.util.List<VideoPreviewPlayMetaOfflineVideoTranscodingList> offlineVideoTranscodingList) {
        this.offlineVideoTranscodingList = offlineVideoTranscodingList;
        return this;
    }
    public java.util.List<VideoPreviewPlayMetaOfflineVideoTranscodingList> getOfflineVideoTranscodingList() {
        return this.offlineVideoTranscodingList;
    }

    public VideoPreviewPlayMeta setQuickVideoList(java.util.List<VideoPreviewPlayMetaQuickVideoList> quickVideoList) {
        this.quickVideoList = quickVideoList;
        return this;
    }
    public java.util.List<VideoPreviewPlayMetaQuickVideoList> getQuickVideoList() {
        return this.quickVideoList;
    }

    public static class VideoPreviewPlayMetaLiveTranscodingTaskList extends TeaModel {
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
         * <p>Template ID</p>
         * 
         * <strong>example:</strong>
         * <p>264_720p</p>
         */
        @NameInMap("template_id")
        public String templateId;

        public static VideoPreviewPlayMetaLiveTranscodingTaskList build(java.util.Map<String, ?> map) throws Exception {
            VideoPreviewPlayMetaLiveTranscodingTaskList self = new VideoPreviewPlayMetaLiveTranscodingTaskList();
            return TeaModel.build(map, self);
        }

        public VideoPreviewPlayMetaLiveTranscodingTaskList setKeepOriginalResolution(Boolean keepOriginalResolution) {
            this.keepOriginalResolution = keepOriginalResolution;
            return this;
        }
        public Boolean getKeepOriginalResolution() {
            return this.keepOriginalResolution;
        }

        public VideoPreviewPlayMetaLiveTranscodingTaskList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public VideoPreviewPlayMetaLiveTranscodingTaskList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class VideoPreviewPlayMetaMeta extends TeaModel {
        /**
         * <p>Length of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("duration")
        public Double duration;

        /**
         * <p>Height of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("height")
        public Long height;

        /**
         * <p>Width of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("width")
        public Long width;

        public static VideoPreviewPlayMetaMeta build(java.util.Map<String, ?> map) throws Exception {
            VideoPreviewPlayMetaMeta self = new VideoPreviewPlayMetaMeta();
            return TeaModel.build(map, self);
        }

        public VideoPreviewPlayMetaMeta setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public VideoPreviewPlayMetaMeta setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public VideoPreviewPlayMetaMeta setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

    public static class VideoPreviewPlayMetaOfflineVideoTranscodingList extends TeaModel {
        /**
         * <p>Whether the original resolution is maintained.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("keep_original_resolution")
        public String keepOriginalResolution;

        /**
         * <p>The status. finished: The index is completed, and the url can be obtained. running: Indexing in progress. Wait a moment and try again. failed: Transcoding failed. Check the media file. If you have any questions, contact customer service.</p>
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
         * <p>264_720p</p>
         */
        @NameInMap("template_id")
        public String templateId;

        public static VideoPreviewPlayMetaOfflineVideoTranscodingList build(java.util.Map<String, ?> map) throws Exception {
            VideoPreviewPlayMetaOfflineVideoTranscodingList self = new VideoPreviewPlayMetaOfflineVideoTranscodingList();
            return TeaModel.build(map, self);
        }

        public VideoPreviewPlayMetaOfflineVideoTranscodingList setKeepOriginalResolution(String keepOriginalResolution) {
            this.keepOriginalResolution = keepOriginalResolution;
            return this;
        }
        public String getKeepOriginalResolution() {
            return this.keepOriginalResolution;
        }

        public VideoPreviewPlayMetaOfflineVideoTranscodingList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public VideoPreviewPlayMetaOfflineVideoTranscodingList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class VideoPreviewPlayMetaQuickVideoList extends TeaModel {
        /**
         * <p>The status. finished: The index is completed, and the url can be obtained. running: Indexing in progress. Wait a moment and try again. failed: Transcoding failed. Check the media file. If you have any questions, contact customer service.</p>
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
         * <p>264_720p</p>
         */
        @NameInMap("template_id")
        public String templateId;

        public static VideoPreviewPlayMetaQuickVideoList build(java.util.Map<String, ?> map) throws Exception {
            VideoPreviewPlayMetaQuickVideoList self = new VideoPreviewPlayMetaQuickVideoList();
            return TeaModel.build(map, self);
        }

        public VideoPreviewPlayMetaQuickVideoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public VideoPreviewPlayMetaQuickVideoList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
