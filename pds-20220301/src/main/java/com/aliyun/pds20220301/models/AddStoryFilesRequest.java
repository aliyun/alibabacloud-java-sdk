// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AddStoryFilesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("files")
    public java.util.List<AddStoryFilesRequestFiles> files;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9132e0d8-fe92-4e56-86c3-f5f112308003</p>
     */
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
        /**
         * <p>This parameter is required.</p>
         * 
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
