// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchStoriesRequest extends TeaModel {
    @NameInMap("cover_image_thumbnail_process")
    @Deprecated
    public String coverImageThumbnailProcess;

    @NameInMap("cover_video_thumbnail_process")
    @Deprecated
    public String coverVideoThumbnailProcess;

    @NameInMap("create_time_range")
    public SearchStoriesRequestCreateTimeRange createTimeRange;

    @NameInMap("custom_labels")
    @Deprecated
    public String customLabels;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("face_group_ids")
    public java.util.List<String> faceGroupIds;

    @NameInMap("limit")
    public Long limit;

    @NameInMap("marker")
    public String marker;

    @NameInMap("order")
    public String order;

    @NameInMap("sort")
    public String sort;

    @NameInMap("story_end_time_range")
    public SearchStoriesRequestStoryEndTimeRange storyEndTimeRange;

    @NameInMap("story_id")
    public String storyId;

    @NameInMap("story_name")
    public String storyName;

    @NameInMap("story_start_time_range")
    public SearchStoriesRequestStoryStartTimeRange storyStartTimeRange;

    @NameInMap("story_type")
    public String storyType;

    @NameInMap("url_expire_sec")
    @Deprecated
    public Long urlExpireSec;

    @NameInMap("with_empty_stories")
    public Boolean withEmptyStories;

    public static SearchStoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchStoriesRequest self = new SearchStoriesRequest();
        return TeaModel.build(map, self);
    }

    public SearchStoriesRequest setCoverImageThumbnailProcess(String coverImageThumbnailProcess) {
        this.coverImageThumbnailProcess = coverImageThumbnailProcess;
        return this;
    }
    public String getCoverImageThumbnailProcess() {
        return this.coverImageThumbnailProcess;
    }

    public SearchStoriesRequest setCoverVideoThumbnailProcess(String coverVideoThumbnailProcess) {
        this.coverVideoThumbnailProcess = coverVideoThumbnailProcess;
        return this;
    }
    public String getCoverVideoThumbnailProcess() {
        return this.coverVideoThumbnailProcess;
    }

    public SearchStoriesRequest setCreateTimeRange(SearchStoriesRequestCreateTimeRange createTimeRange) {
        this.createTimeRange = createTimeRange;
        return this;
    }
    public SearchStoriesRequestCreateTimeRange getCreateTimeRange() {
        return this.createTimeRange;
    }

    public SearchStoriesRequest setCustomLabels(String customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public String getCustomLabels() {
        return this.customLabels;
    }

    public SearchStoriesRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public SearchStoriesRequest setFaceGroupIds(java.util.List<String> faceGroupIds) {
        this.faceGroupIds = faceGroupIds;
        return this;
    }
    public java.util.List<String> getFaceGroupIds() {
        return this.faceGroupIds;
    }

    public SearchStoriesRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public SearchStoriesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public SearchStoriesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public SearchStoriesRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public SearchStoriesRequest setStoryEndTimeRange(SearchStoriesRequestStoryEndTimeRange storyEndTimeRange) {
        this.storyEndTimeRange = storyEndTimeRange;
        return this;
    }
    public SearchStoriesRequestStoryEndTimeRange getStoryEndTimeRange() {
        return this.storyEndTimeRange;
    }

    public SearchStoriesRequest setStoryId(String storyId) {
        this.storyId = storyId;
        return this;
    }
    public String getStoryId() {
        return this.storyId;
    }

    public SearchStoriesRequest setStoryName(String storyName) {
        this.storyName = storyName;
        return this;
    }
    public String getStoryName() {
        return this.storyName;
    }

    public SearchStoriesRequest setStoryStartTimeRange(SearchStoriesRequestStoryStartTimeRange storyStartTimeRange) {
        this.storyStartTimeRange = storyStartTimeRange;
        return this;
    }
    public SearchStoriesRequestStoryStartTimeRange getStoryStartTimeRange() {
        return this.storyStartTimeRange;
    }

    public SearchStoriesRequest setStoryType(String storyType) {
        this.storyType = storyType;
        return this;
    }
    public String getStoryType() {
        return this.storyType;
    }

    public SearchStoriesRequest setUrlExpireSec(Long urlExpireSec) {
        this.urlExpireSec = urlExpireSec;
        return this;
    }
    public Long getUrlExpireSec() {
        return this.urlExpireSec;
    }

    public SearchStoriesRequest setWithEmptyStories(Boolean withEmptyStories) {
        this.withEmptyStories = withEmptyStories;
        return this;
    }
    public Boolean getWithEmptyStories() {
        return this.withEmptyStories;
    }

    public static class SearchStoriesRequestCreateTimeRange extends TeaModel {
        @NameInMap("end")
        public String end;

        @NameInMap("start")
        public String start;

        public static SearchStoriesRequestCreateTimeRange build(java.util.Map<String, ?> map) throws Exception {
            SearchStoriesRequestCreateTimeRange self = new SearchStoriesRequestCreateTimeRange();
            return TeaModel.build(map, self);
        }

        public SearchStoriesRequestCreateTimeRange setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public SearchStoriesRequestCreateTimeRange setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class SearchStoriesRequestStoryEndTimeRange extends TeaModel {
        @NameInMap("end")
        public String end;

        @NameInMap("start")
        public String start;

        public static SearchStoriesRequestStoryEndTimeRange build(java.util.Map<String, ?> map) throws Exception {
            SearchStoriesRequestStoryEndTimeRange self = new SearchStoriesRequestStoryEndTimeRange();
            return TeaModel.build(map, self);
        }

        public SearchStoriesRequestStoryEndTimeRange setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public SearchStoriesRequestStoryEndTimeRange setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class SearchStoriesRequestStoryStartTimeRange extends TeaModel {
        @NameInMap("end")
        public String end;

        @NameInMap("start")
        public String start;

        public static SearchStoriesRequestStoryStartTimeRange build(java.util.Map<String, ?> map) throws Exception {
            SearchStoriesRequestStoryStartTimeRange self = new SearchStoriesRequestStoryStartTimeRange();
            return TeaModel.build(map, self);
        }

        public SearchStoriesRequestStoryStartTimeRange setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public SearchStoriesRequestStoryStartTimeRange setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

}
