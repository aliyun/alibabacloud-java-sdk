// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class Story extends TeaModel {
    @NameInMap("cover_file_id")
    public String coverFileId;

    @NameInMap("cover_file_thumbnail_url")
    public String coverFileThumbnailUrl;

    @NameInMap("created_at")
    public String createdAt;

    @NameInMap("custom_labels")
    public java.util.Map<String, ?> customLabels;

    @NameInMap("face_group_ids")
    public java.util.List<String> faceGroupIds;

    @NameInMap("story_end_time")
    public String storyEndTime;

    @NameInMap("story_file_list")
    public java.util.List<File> storyFileList;

    @NameInMap("story_id")
    public String storyId;

    @NameInMap("story_name")
    public String storyName;

    @NameInMap("story_start_time")
    public String storyStartTime;

    @NameInMap("story_sub_type")
    public String storySubType;

    @NameInMap("story_type")
    public String storyType;

    @NameInMap("updated_at")
    public String updatedAt;

    public static Story build(java.util.Map<String, ?> map) throws Exception {
        Story self = new Story();
        return TeaModel.build(map, self);
    }

    public Story setCoverFileId(String coverFileId) {
        this.coverFileId = coverFileId;
        return this;
    }
    public String getCoverFileId() {
        return this.coverFileId;
    }

    public Story setCoverFileThumbnailUrl(String coverFileThumbnailUrl) {
        this.coverFileThumbnailUrl = coverFileThumbnailUrl;
        return this;
    }
    public String getCoverFileThumbnailUrl() {
        return this.coverFileThumbnailUrl;
    }

    public Story setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public Story setCustomLabels(java.util.Map<String, ?> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
    }

    public Story setFaceGroupIds(java.util.List<String> faceGroupIds) {
        this.faceGroupIds = faceGroupIds;
        return this;
    }
    public java.util.List<String> getFaceGroupIds() {
        return this.faceGroupIds;
    }

    public Story setStoryEndTime(String storyEndTime) {
        this.storyEndTime = storyEndTime;
        return this;
    }
    public String getStoryEndTime() {
        return this.storyEndTime;
    }

    public Story setStoryFileList(java.util.List<File> storyFileList) {
        this.storyFileList = storyFileList;
        return this;
    }
    public java.util.List<File> getStoryFileList() {
        return this.storyFileList;
    }

    public Story setStoryId(String storyId) {
        this.storyId = storyId;
        return this;
    }
    public String getStoryId() {
        return this.storyId;
    }

    public Story setStoryName(String storyName) {
        this.storyName = storyName;
        return this;
    }
    public String getStoryName() {
        return this.storyName;
    }

    public Story setStoryStartTime(String storyStartTime) {
        this.storyStartTime = storyStartTime;
        return this;
    }
    public String getStoryStartTime() {
        return this.storyStartTime;
    }

    public Story setStorySubType(String storySubType) {
        this.storySubType = storySubType;
        return this;
    }
    public String getStorySubType() {
        return this.storySubType;
    }

    public Story setStoryType(String storyType) {
        this.storyType = storyType;
        return this;
    }
    public String getStoryType() {
        return this.storyType;
    }

    public Story setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
