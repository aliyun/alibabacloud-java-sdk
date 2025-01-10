// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateStoryRequest extends TeaModel {
    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("cover")
    public UpdateStoryRequestCover cover;

    @NameInMap("custom_labels")
    @Deprecated
    public java.util.Map<String, String> customLabels;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9132e0d8-fe92-4e56-86c3-f5f112308003</p>
     */
    @NameInMap("story_id")
    public String storyId;

    /**
     * <strong>example:</strong>
     * <p>name1</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
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

    @Deprecated
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
        /**
         * <strong>example:</strong>
         * <p>63e5e4340f76cb3ead5f40f68163f0f967c1a7bf</p>
         */
        @NameInMap("file_id")
        public String fileId;

        /**
         * <strong>example:</strong>
         * <p>642a88dd06e49d9c0a14411ebae606f70edd9a59</p>
         */
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
