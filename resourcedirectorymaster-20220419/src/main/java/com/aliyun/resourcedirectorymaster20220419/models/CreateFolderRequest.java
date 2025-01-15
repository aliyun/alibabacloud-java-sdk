// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class CreateFolderRequest extends TeaModel {
    /**
     * <p>The name of the folder.</p>
     * <p>The name must be 1 to 24 characters in length and can contain letters, digits, underscores (_), periods (.),and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rdFolder</p>
     */
    @NameInMap("FolderName")
    public String folderName;

    /**
     * <p>The ID of the parent folder.</p>
     * 
     * <strong>example:</strong>
     * <p>r-b1****</p>
     */
    @NameInMap("ParentFolderId")
    public String parentFolderId;

    /**
     * <p>The tag to add to the folder.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateFolderRequestTag> tag;

    public static CreateFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFolderRequest self = new CreateFolderRequest();
        return TeaModel.build(map, self);
    }

    public CreateFolderRequest setFolderName(String folderName) {
        this.folderName = folderName;
        return this;
    }
    public String getFolderName() {
        return this.folderName;
    }

    public CreateFolderRequest setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    public CreateFolderRequest setTag(java.util.List<CreateFolderRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateFolderRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateFolderRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateFolderRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateFolderRequestTag self = new CreateFolderRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateFolderRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateFolderRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
