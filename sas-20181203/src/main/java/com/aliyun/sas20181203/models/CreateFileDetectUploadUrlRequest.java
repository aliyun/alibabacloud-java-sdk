// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileDetectUploadUrlRequest extends TeaModel {
    /**
     * <p>The hash values of files.</p>
     * <blockquote>
     * <p>You must specify at least one of the <strong>HashKeyList</strong> and <strong>HashKeyContextList</strong> parameters.</p>
     * </blockquote>
     */
    @NameInMap("HashKeyContextList")
    public java.util.List<CreateFileDetectUploadUrlRequestHashKeyContextList> hashKeyContextList;

    /**
     * <p>The identifiers of files. Only MD5 hash values are supported.</p>
     * <blockquote>
     * <p>You must specify at least one of the <strong>HashKeyList</strong> and <strong>HashKeyContextList</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CreateFileDetectUploadUrl</p>
     */
    @NameInMap("HashKeyList")
    public java.util.List<String> hashKeyList;

    /**
     * <p>The type of the file. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: unknown file</li>
     * <li><strong>1</strong>: binary file</li>
     * <li><strong>2</strong>: webshell file</li>
     * <li><strong>4</strong>: script file</li>
     * </ul>
     * <blockquote>
     * <p>If you do not know the type of the file, set this parameter to <strong>0</strong>.</p>
     * </blockquote>
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
         * <p>The size of the file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2698557</p>
         */
        @NameInMap("FileSize")
        public Integer fileSize;

        /**
         * <p>The hash value of the file.</p>
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
