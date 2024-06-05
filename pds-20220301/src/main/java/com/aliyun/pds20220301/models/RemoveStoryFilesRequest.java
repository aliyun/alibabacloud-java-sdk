// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class RemoveStoryFilesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("files")
    public java.util.List<RemoveStoryFilesRequestFiles> files;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("story_id")
    public String storyId;

    public static RemoveStoryFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveStoryFilesRequest self = new RemoveStoryFilesRequest();
        return TeaModel.build(map, self);
    }

    public RemoveStoryFilesRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public RemoveStoryFilesRequest setFiles(java.util.List<RemoveStoryFilesRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<RemoveStoryFilesRequestFiles> getFiles() {
        return this.files;
    }

    public RemoveStoryFilesRequest setStoryId(String storyId) {
        this.storyId = storyId;
        return this;
    }
    public String getStoryId() {
        return this.storyId;
    }

    public static class RemoveStoryFilesRequestFiles extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("file_id")
        public String fileId;

        @NameInMap("revision_id")
        public String revisionId;

        public static RemoveStoryFilesRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            RemoveStoryFilesRequestFiles self = new RemoveStoryFilesRequestFiles();
            return TeaModel.build(map, self);
        }

        public RemoveStoryFilesRequestFiles setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public RemoveStoryFilesRequestFiles setRevisionId(String revisionId) {
            this.revisionId = revisionId;
            return this;
        }
        public String getRevisionId() {
            return this.revisionId;
        }

    }

}
