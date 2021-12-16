// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class AppendObjectHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("Cache-Control")
    public String cacheControl;

    @NameInMap("Content-Disposition")
    public String contentDisposition;

    @NameInMap("Content-Encoding")
    public String contentEncoding;

    @NameInMap("Content-MD5")
    public String contentMD5;

    @NameInMap("Expires")
    public String expires;

    @NameInMap("x-oss-meta-*")
    public java.util.Map<String, String> metaData;

    @NameInMap("x-oss-object-acl")
    public String acl;

    @NameInMap("x-oss-server-side-encryption")
    public String serverSideEncryption;

    @NameInMap("x-oss-storage-class")
    public String storageClass;

    public static AppendObjectHeaders build(java.util.Map<String, ?> map) throws Exception {
        AppendObjectHeaders self = new AppendObjectHeaders();
        return TeaModel.build(map, self);
    }

    public AppendObjectHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AppendObjectHeaders setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }
    public String getCacheControl() {
        return this.cacheControl;
    }

    public AppendObjectHeaders setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    public AppendObjectHeaders setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public AppendObjectHeaders setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }
    public String getContentMD5() {
        return this.contentMD5;
    }

    public AppendObjectHeaders setExpires(String expires) {
        this.expires = expires;
        return this;
    }
    public String getExpires() {
        return this.expires;
    }

    public AppendObjectHeaders setMetaData(java.util.Map<String, String> metaData) {
        this.metaData = metaData;
        return this;
    }
    public java.util.Map<String, String> getMetaData() {
        return this.metaData;
    }

    public AppendObjectHeaders setAcl(String acl) {
        this.acl = acl;
        return this;
    }
    public String getAcl() {
        return this.acl;
    }

    public AppendObjectHeaders setServerSideEncryption(String serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption;
        return this;
    }
    public String getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    public AppendObjectHeaders setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

}
