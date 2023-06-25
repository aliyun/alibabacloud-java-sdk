// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AddStoryFilesRequest extends TeaModel {
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("files")
    public java.util.List<AddStoryFilesRequestFiles> files;

    @NameInMap("story_id")
    public String storyId;

    public static AddStoryFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddStoryFilesRequest self = new AddStoryFilesRequest();
        return TeaModel.build(map, self);
    }

    public AddStoryFilesRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public AddStoryFilesRequest setFiles(java.util.List<AddStoryFilesRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<AddStoryFilesRequestFiles> getFiles() {
        return this.files;
    }

    public AddStoryFilesRequest setStoryId(String storyId) {
        this.storyId = storyId;
        return this;
    }
    public String getStoryId() {
        return this.storyId;
    }

    public static class AddStoryFilesRequestFiles extends TeaModel {
        @NameInMap("file_id")
        public String fileId;

        @NameInMap("revision_id")
        public String revisionId;

        public static AddStoryFilesRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            AddStoryFilesRequestFiles self = new AddStoryFilesRequestFiles();
            return TeaModel.build(map, self);
        }

        public AddStoryFilesRequestFiles setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public AddStoryFilesRequestFiles setRevisionId(String revisionId) {
            this.revisionId = revisionId;
            return this;
        }
        public String getRevisionId() {
            return this.revisionId;
        }

    }

}
