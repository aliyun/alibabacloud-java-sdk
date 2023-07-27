// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class MetaQueryFile extends TeaModel {
    @NameInMap("ETag")
    public String ETag;

    @NameInMap("FileModifiedTime")
    public String fileModifiedTime;

    @NameInMap("Filename")
    public String filename;

    @NameInMap("OSSCRC64")
    public String OSSCRC64;

    @NameInMap("OSSObjectType")
    public String OSSObjectType;

    @NameInMap("OSSStorageClass")
    public String OSSStorageClass;

    @NameInMap("OSSTagging")
    public OSSTagging OSSTagging;

    @NameInMap("OSSTaggingCount")
    public Long OSSTaggingCount;

    @NameInMap("OSSUserMeta")
    public OSSUserMeta OSSUserMeta;

    @NameInMap("ObjectACL")
    public String objectACL;

    @NameInMap("ServerSideEncryption")
    public String serverSideEncryption;

    @NameInMap("ServerSideEncryptionCustomerAlgorithm")
    public String serverSideEncryptionCustomerAlgorithm;

    @NameInMap("Size")
    public Long size;

    public static MetaQueryFile build(java.util.Map<String, ?> map) throws Exception {
        MetaQueryFile self = new MetaQueryFile();
        return TeaModel.build(map, self);
    }

    public MetaQueryFile setETag(String ETag) {
        this.ETag = ETag;
        return this;
    }
    public String getETag() {
        return this.ETag;
    }

    public MetaQueryFile setFileModifiedTime(String fileModifiedTime) {
        this.fileModifiedTime = fileModifiedTime;
        return this;
    }
    public String getFileModifiedTime() {
        return this.fileModifiedTime;
    }

    public MetaQueryFile setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public MetaQueryFile setOSSCRC64(String OSSCRC64) {
        this.OSSCRC64 = OSSCRC64;
        return this;
    }
    public String getOSSCRC64() {
        return this.OSSCRC64;
    }

    public MetaQueryFile setOSSObjectType(String OSSObjectType) {
        this.OSSObjectType = OSSObjectType;
        return this;
    }
    public String getOSSObjectType() {
        return this.OSSObjectType;
    }

    public MetaQueryFile setOSSStorageClass(String OSSStorageClass) {
        this.OSSStorageClass = OSSStorageClass;
        return this;
    }
    public String getOSSStorageClass() {
        return this.OSSStorageClass;
    }

    public MetaQueryFile setOSSTagging(OSSTagging OSSTagging) {
        this.OSSTagging = OSSTagging;
        return this;
    }
    public OSSTagging getOSSTagging() {
        return this.OSSTagging;
    }

    public MetaQueryFile setOSSTaggingCount(Long OSSTaggingCount) {
        this.OSSTaggingCount = OSSTaggingCount;
        return this;
    }
    public Long getOSSTaggingCount() {
        return this.OSSTaggingCount;
    }

    public MetaQueryFile setOSSUserMeta(OSSUserMeta OSSUserMeta) {
        this.OSSUserMeta = OSSUserMeta;
        return this;
    }
    public OSSUserMeta getOSSUserMeta() {
        return this.OSSUserMeta;
    }

    public MetaQueryFile setObjectACL(String objectACL) {
        this.objectACL = objectACL;
        return this;
    }
    public String getObjectACL() {
        return this.objectACL;
    }

    public MetaQueryFile setServerSideEncryption(String serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption;
        return this;
    }
    public String getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    public MetaQueryFile setServerSideEncryptionCustomerAlgorithm(String serverSideEncryptionCustomerAlgorithm) {
        this.serverSideEncryptionCustomerAlgorithm = serverSideEncryptionCustomerAlgorithm;
        return this;
    }
    public String getServerSideEncryptionCustomerAlgorithm() {
        return this.serverSideEncryptionCustomerAlgorithm;
    }

    public MetaQueryFile setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public static class OSSTagging extends TeaModel {
        @NameInMap("Tagging")
        public java.util.List<MetaQueryTagging> tagging;

        public static OSSTagging build(java.util.Map<String, ?> map) throws Exception {
            OSSTagging self = new OSSTagging();
            return TeaModel.build(map, self);
        }

        public OSSTagging setTagging(java.util.List<MetaQueryTagging> tagging) {
            this.tagging = tagging;
            return this;
        }
        public java.util.List<MetaQueryTagging> getTagging() {
            return this.tagging;
        }

    }

    public static class OSSUserMeta extends TeaModel {
        @NameInMap("UserMeta")
        public java.util.List<MetaQueryUserMeta> userMeta;

        public static OSSUserMeta build(java.util.Map<String, ?> map) throws Exception {
            OSSUserMeta self = new OSSUserMeta();
            return TeaModel.build(map, self);
        }

        public OSSUserMeta setUserMeta(java.util.List<MetaQueryUserMeta> userMeta) {
            this.userMeta = userMeta;
            return this;
        }
        public java.util.List<MetaQueryUserMeta> getUserMeta() {
            return this.userMeta;
        }

    }

}
