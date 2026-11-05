// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileDetectUploadUrlRequest extends TeaModel {
    /**
     * <p>The file identifier. Only MD5 is supported. You can specify up to 100 elements in the list.</p>
     * <blockquote>
     * <p><strong>HashKeyList</strong> and <strong>HashKeyContextList</strong> cannot be empty at the same time.</p>
     * </blockquote>
     */
    @NameInMap("HashKeyContextList")
    public java.util.List<CreateFileDetectUploadUrlRequestHashKeyContextList> hashKeyContextList;

    /**
     * <p>The unique identifier of the file. You can specify up to 100 elements in the list.</p>
     * <blockquote>
     * <p><strong>HashKeyList</strong> and <strong>HashKeyContextList</strong> cannot be empty at the same time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CreateFileDetectUploadUrl</p>
     */
    @NameInMap("HashKeyList")
    public java.util.List<String> hashKeyList;

    /**
     * <p>The file type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Uncertain file type.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static CreateFileDetectUploadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileDetectUploadUrlRequest self = new CreateFileDetectUploadUrlRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileDetectUploadUrlRequest setHashKeyContextList(java.util.List<CreateFileDetectUploadUrlRequestHashKeyContextList> hashKeyContextList) {
        this.hashKeyContextList = hashKeyContextList;
        return this;
    }
    public java.util.List<CreateFileDetectUploadUrlRequestHashKeyContextList> getHashKeyContextList() {
        return this.hashKeyContextList;
    }

    public CreateFileDetectUploadUrlRequest setHashKeyList(java.util.List<String> hashKeyList) {
        this.hashKeyList = hashKeyList;
        return this;
    }
    public java.util.List<String> getHashKeyList() {
        return this.hashKeyList;
    }

    public CreateFileDetectUploadUrlRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public static class CreateFileDetectUploadUrlRequestHashKeyContextList extends TeaModel {
        /**
         * <p>The file size. If the file size exceeds the limit, the upload parameters are not returned. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2698557</p>
         */
        @NameInMap("FileSize")
        public Integer fileSize;

        /**
         * <p>The file hash value.</p>
         * 
         * <strong>example:</strong>
         * <p>30319dd5cee8f894766e479cac170da0</p>
         */
        @NameInMap("HashKey")
        public String hashKey;

        public static CreateFileDetectUploadUrlRequestHashKeyContextList build(java.util.Map<String, ?> map) throws Exception {
            CreateFileDetectUploadUrlRequestHashKeyContextList self = new CreateFileDetectUploadUrlRequestHashKeyContextList();
            return TeaModel.build(map, self);
        }

        public CreateFileDetectUploadUrlRequestHashKeyContextList setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Integer getFileSize() {
            return this.fileSize;
        }

        public CreateFileDetectUploadUrlRequestHashKeyContextList setHashKey(String hashKey) {
            this.hashKey = hashKey;
            return this;
        }
        public String getHashKey() {
            return this.hashKey;
        }

    }

}
