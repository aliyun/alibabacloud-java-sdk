// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileDetectUploadUrlRequest extends TeaModel {
    @NameInMap("HashKeyContextList")
    public java.util.List<CreateFileDetectUploadUrlRequestHashKeyContextList> hashKeyContextList;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("HashKeyList")
    public java.util.List<String> hashKeyList;

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
        @NameInMap("FileSize")
        public Integer fileSize;

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
