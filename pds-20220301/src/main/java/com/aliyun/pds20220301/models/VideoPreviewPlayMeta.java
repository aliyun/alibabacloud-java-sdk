// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class VideoPreviewPlayMeta extends TeaModel {
    @NameInMap("category")
    public String category;

    @NameInMap("live_transcoding_task_list")
    public java.util.List<VideoPreviewPlayMetaLiveTranscodingTaskList> liveTranscodingTaskList;

    @NameInMap("meta")
    public VideoPreviewPlayMetaMeta meta;

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

    public static class VideoPreviewPlayMetaLiveTranscodingTaskList extends TeaModel {
        @NameInMap("keep_original_resolution")
        public Boolean keepOriginalResolution;

        @NameInMap("status")
        public String status;

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
        @NameInMap("duration")
        public Double duration;

        @NameInMap("height")
        public Long height;

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

}
