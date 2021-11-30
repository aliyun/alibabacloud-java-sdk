// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ObjectVersion extends TeaModel {
    // The entity tag
    @NameInMap("ETag")
    public String ETag;

    // Indicates whether the version is the current version
    @NameInMap("IsLatest")
    public Boolean isLatest;

    // The name of the object
    @NameInMap("Key")
    public String key;

    // The last modified time of the object
    @NameInMap("LastModified")
    public String lastModified;

    // The information about the bucket owner
    @NameInMap("Owner")
    public Owner owner;

    // The size of the returned object
    @NameInMap("Size")
    public Long size;

    @NameInMap("StorageClass")
    public String storageClass;

    // The version ID of the object
    @NameInMap("VersionId")
    public String versionId;

    public static ObjectVersion build(java.util.Map<String, ?> map) throws Exception {
        ObjectVersion self = new ObjectVersion();
        return TeaModel.build(map, self);
    }

    public ObjectVersion setETag(String ETag) {
        this.ETag = ETag;
        return this;
    }
    public String getETag() {
        return this.ETag;
    }

    public ObjectVersion setIsLatest(Boolean isLatest) {
        this.isLatest = isLatest;
        return this;
    }
    public Boolean getIsLatest() {
        return this.isLatest;
    }

    public ObjectVersion setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ObjectVersion setLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public String getLastModified() {
        return this.lastModified;
    }

    public ObjectVersion setOwner(Owner owner) {
        this.owner = owner;
        return this;
    }
    public Owner getOwner() {
        return this.owner;
    }

    public ObjectVersion setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ObjectVersion setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

    public ObjectVersion setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
