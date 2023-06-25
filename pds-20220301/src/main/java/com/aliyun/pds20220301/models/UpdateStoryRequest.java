// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateStoryRequest extends TeaModel {
    @NameInMap("cover")
    public UpdateStoryRequestCover cover;

    @NameInMap("custom_labels")
    @Deprecated
    public java.util.Map<String, String> customLabels;

    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("story_id")
    public String storyId;

    @NameInMap("story_name")
    public String storyName;

    public static UpdateStoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStoryRequest self = new UpdateStoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStoryRequest setCover(UpdateStoryRequestCover cover) {
        this.cover = cover;
        return this;
    }
    public UpdateStoryRequestCover getCover() {
        return this.cover;
    }

    public UpdateStoryRequest setCustomLabels(java.util.Map<String, String> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, String> getCustomLabels() {
        return this.customLabels;
    }

    public UpdateStoryRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public UpdateStoryRequest setStoryId(String storyId) {
        this.storyId = storyId;
        return this;
    }
    public String getStoryId() {
        return this.storyId;
    }

    public UpdateStoryRequest setStoryName(String storyName) {
        this.storyName = storyName;
        return this;
    }
    public String getStoryName() {
        return this.storyName;
    }

    public static class UpdateStoryRequestCover extends TeaModel {
        @NameInMap("file_id")
        public String fileId;

        @NameInMap("revision_id")
        public String revisionId;

        public static UpdateStoryRequestCover build(java.util.Map<String, ?> map) throws Exception {
            UpdateStoryRequestCover self = new UpdateStoryRequestCover();
            return TeaModel.build(map, self);
        }

        public UpdateStoryRequestCover setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public UpdateStoryRequestCover setRevisionId(String revisionId) {
            this.revisionId = revisionId;
            return this;
        }
        public String getRevisionId() {
            return this.revisionId;
        }

    }

}
