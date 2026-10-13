// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchStoriesRequest extends TeaModel {
    /**
     * <p>The parameters for processing the thumbnail of the cover image.</p>
     * 
     * <strong>example:</strong>
     * <p>image/resize,m_fill,h_128,w_128,limit_0/format,jpg</p>
     */
    @NameInMap("cover_image_thumbnail_process")
    @Deprecated
    public String coverImageThumbnailProcess;

    /**
     * <p>The parameters for processing the thumbnail of the cover video.</p>
     * 
     * <strong>example:</strong>
     * <p>video/snapshot,t_1000,f_jpg,w_0,h_0,m_fast,ar_auto</p>
     */
    @NameInMap("cover_video_thumbnail_process")
    @Deprecated
    public String coverVideoThumbnailProcess;

    /**
     * <p>The time range when the story was created.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("create_time_range")
    public SearchStoriesRequestCreateTimeRange createTimeRange;

    /**
     * <p>Custom labels. You can query multiple fields separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>key1=value1,key2!=value2</p>
     */
    @NameInMap("custom_labels")
    @Deprecated
    public String customLabels;

    /**
     * <p>The drive ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The list of face groups. This parameter is used to query people stories.</p>
     */
    @NameInMap("face_group_ids")
    public java.util.List<String> faceGroupIds;

    /**
     * <p>The maximum number of resources to return. Valid values: 1 to 100. Default value: 100. The number of returned resources can be less than the specified number, but cannot be greater than the specified number.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("limit")
    public Long limit;

    /**
     * <p>The pagination marker. If this parameter is empty, the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDODBhNDQ2Nzhl***</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("order")
    public String order;

    /**
     * <p>The sort field.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("sort")
    public String sort;

    /**
     * <p>The time range of the end time of the photos or videos in a story.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("story_end_time_range")
    public SearchStoriesRequestStoryEndTimeRange storyEndTimeRange;

    /**
     * <p>The story ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9132e0d8-fe92-4e56-86c3-f5f112308003</p>
     */
    @NameInMap("story_id")
    public String storyId;

    /**
     * <p>The name of the story. The name can be up to 1,024 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Food</p>
     */
    @NameInMap("story_name")
    public String storyName;

    /**
     * <p>The time range of the start time of the photos or videos in a story.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("story_start_time_range")
    public SearchStoriesRequestStoryStartTimeRange storyStartTimeRange;

    /**
     * <p>The type of the story. You can specify this parameter when you create a story.</p>
     * 
     * <strong>example:</strong>
     * <p>PeopleMemory</p>
     */
    @NameInMap("story_type")
    public String storyType;

    /**
     * <p>The validity period of the thumbnail URL. Unit: seconds. Valid values: 10 to 86400.</p>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("url_expire_sec")
    @Deprecated
    public Long urlExpireSec;

    /**
     * <p>Specifies whether to return empty stories. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("with_empty_stories")
    public Boolean withEmptyStories;

    public static SearchStoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchStoriesRequest self = new SearchStoriesRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public SearchStoriesRequest setCoverImageThumbnailProcess(String coverImageThumbnailProcess) {
        this.coverImageThumbnailProcess = coverImageThumbnailProcess;
        return this;
    }
    public String getCoverImageThumbnailProcess() {
        return this.coverImageThumbnailProcess;
    }

    @Deprecated
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

    @Deprecated
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

    @Deprecated
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
        /**
         * <p>The end time in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-31T00:00:00+08:00</p>
         */
        @NameInMap("end")
        public String end;

        /**
         * <p>The start time in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-12-31T00:00:00+08:00</p>
         */
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
        /**
         * <p>The end time in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-31T00:00:00+08:00</p>
         */
        @NameInMap("end")
        public String end;

        /**
         * <p>The start time in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-12-31T00:00:00+08:00</p>
         */
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
        /**
         * <p>The end time in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-31T00:00:00+08:00</p>
         */
        @NameInMap("end")
        public String end;

        /**
         * <p>The start time in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-12-31T00:00:00+08:00</p>
         */
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
