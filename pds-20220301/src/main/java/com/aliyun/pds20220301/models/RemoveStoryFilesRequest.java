// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class RemoveStoryFilesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("files")
    public java.util.List<RemoveStoryFilesRequestFiles> files;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9132e0d8-fe92-4e56-86c3-f5f112308003</p>
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
