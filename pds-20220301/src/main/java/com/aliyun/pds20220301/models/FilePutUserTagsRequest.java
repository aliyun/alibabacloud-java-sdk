// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class FilePutUserTagsRequest extends TeaModel {
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
     * <p>The file ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9520943DC264</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The array of tags to add. The array must contain 1 to 1,000 tags and must not contain duplicate tag keys.</p>
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
         * <p>The tag key. Must not be empty or contain the # character.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tag</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value. Must not contain the # character.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
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
