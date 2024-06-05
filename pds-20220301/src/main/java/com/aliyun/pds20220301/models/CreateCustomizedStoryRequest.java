// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateCustomizedStoryRequest extends TeaModel {
    @NameInMap("custom_labels")
    @Deprecated
    public java.util.Map<String, String> customLabels;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("story_cover")
    public CreateCustomizedStoryRequestStoryCover storyCover;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("story_files")
    public java.util.List<CreateCustomizedStoryRequestStoryFiles> storyFiles;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("story_name")
    public String storyName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("story_sub_type")
    public String storySubType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("story_type")
    public String storyType;

    public static CreateCustomizedStoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomizedStoryRequest self = new CreateCustomizedStoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomizedStoryRequest setCustomLabels(java.util.Map<String, String> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, String> getCustomLabels() {
        return this.customLabels;
    }

    public CreateCustomizedStoryRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public CreateCustomizedStoryRequest setStoryCover(CreateCustomizedStoryRequestStoryCover storyCover) {
        this.storyCover = storyCover;
        return this;
    }
    public CreateCustomizedStoryRequestStoryCover getStoryCover() {
        return this.storyCover;
    }

    public CreateCustomizedStoryRequest setStoryFiles(java.util.List<CreateCustomizedStoryRequestStoryFiles> storyFiles) {
        this.storyFiles = storyFiles;
        return this;
    }
    public java.util.List<CreateCustomizedStoryRequestStoryFiles> getStoryFiles() {
        return this.storyFiles;
    }

    public CreateCustomizedStoryRequest setStoryName(String storyName) {
        this.storyName = storyName;
        return this;
    }
    public String getStoryName() {
        return this.storyName;
    }

    public CreateCustomizedStoryRequest setStorySubType(String storySubType) {
        this.storySubType = storySubType;
        return this;
    }
    public String getStorySubType() {
        return this.storySubType;
    }

    public CreateCustomizedStoryRequest setStoryType(String storyType) {
        this.storyType = storyType;
        return this;
    }
    public String getStoryType() {
        return this.storyType;
    }

    public static class CreateCustomizedStoryRequestStoryCover extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("file_id")
        public String fileId;

        @NameInMap("revision_id")
        public String revisionId;

        public static CreateCustomizedStoryRequestStoryCover build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomizedStoryRequestStoryCover self = new CreateCustomizedStoryRequestStoryCover();
            return TeaModel.build(map, self);
        }

        public CreateCustomizedStoryRequestStoryCover setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public CreateCustomizedStoryRequestStoryCover setRevisionId(String revisionId) {
            this.revisionId = revisionId;
            return this;
        }
        public String getRevisionId() {
            return this.revisionId;
        }

    }

    public static class CreateCustomizedStoryRequestStoryFiles extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("file_id")
        public String fileId;

        @NameInMap("revision_id")
        public String revisionId;

        public static CreateCustomizedStoryRequestStoryFiles build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomizedStoryRequestStoryFiles self = new CreateCustomizedStoryRequestStoryFiles();
            return TeaModel.build(map, self);
        }

        public CreateCustomizedStoryRequestStoryFiles setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public CreateCustomizedStoryRequestStoryFiles setRevisionId(String revisionId) {
            this.revisionId = revisionId;
            return this;
        }
        public String getRevisionId() {
            return this.revisionId;
        }

    }

}
