// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class FilePutUserTagsRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The file ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The tags to be added to the file. You cannot leave this parameter empty. You can specify up to 1,000 tags. You cannot specify tags that have the same name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("user_tags")
    public java.util.List<FilePutUserTagsRequestUserTags> userTags;

    public static FilePutUserTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        FilePutUserTagsRequest self = new FilePutUserTagsRequest();
        return TeaModel.build(map, self);
    }

    public FilePutUserTagsRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public FilePutUserTagsRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public FilePutUserTagsRequest setUserTags(java.util.List<FilePutUserTagsRequestUserTags> userTags) {
        this.userTags = userTags;
        return this;
    }
    public java.util.List<FilePutUserTagsRequestUserTags> getUserTags() {
        return this.userTags;
    }

    public static class FilePutUserTagsRequestUserTags extends TeaModel {
        /**
         * <p>The name of the tag. The tag name cannot be empty and cannot contain number signs (#).</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The value of the tag. The tag value cannot contain number signs (#).</p>
         */
        @NameInMap("value")
        public String value;

        public static FilePutUserTagsRequestUserTags build(java.util.Map<String, ?> map) throws Exception {
            FilePutUserTagsRequestUserTags self = new FilePutUserTagsRequestUserTags();
            return TeaModel.build(map, self);
        }

        public FilePutUserTagsRequestUserTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public FilePutUserTagsRequestUserTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
