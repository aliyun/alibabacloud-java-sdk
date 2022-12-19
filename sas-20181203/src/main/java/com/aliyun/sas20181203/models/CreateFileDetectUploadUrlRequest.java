// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileDetectUploadUrlRequest extends TeaModel {
    // The hash values of files.
    // 
    // >  You must specify at least one of the **HashKeyList** and **HashKeyContextList** parameters.
    @NameInMap("HashKeyContextList")
    public java.util.List<CreateFileDetectUploadUrlRequestHashKeyContextList> hashKeyContextList;

    // The identifier of the file. Only MD5 hash values are supported.
    // 
    // >  You must specify at least one of the **HashKeyList** and **HashKeyContextList** parameters.
    @NameInMap("HashKeyList")
    public java.util.List<String> hashKeyList;

    // The type of the file. Valid values:
    // 
    // *   **0**: unknown files
    // *   **1**: binary files
    // *   **2**: webshell files
    // *   **4**: script files
    // 
    // >  If you do not know the type of the file, set this parameter to **0**.
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
        // The size of the file. Unit: bytes.
        @NameInMap("FileSize")
        public Integer fileSize;

        // The hash value of the file.
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
