// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ObjectSummary extends TeaModel {
    // The entity tag is a hash of the object.
    @NameInMap("ETag")
    public String ETag;

    // The name of the object.
    @NameInMap("Key")
    public String key;

    // The last modification time of the object.
    @NameInMap("LastModified")
    public String lastModified;

    @NameInMap("Owner")
    public Owner owner;

    // The size in bytes of the object
    @NameInMap("Size")
    public Long size;

    @NameInMap("StorageClass")
    public String storageClass;

    // The type of the object.
    @NameInMap("Type")
    public String type;

    public static ObjectSummary build(java.util.Map<String, ?> map) throws Exception {
        ObjectSummary self = new ObjectSummary();
        return TeaModel.build(map, self);
    }

    public ObjectSummary setETag(String ETag) {
        this.ETag = ETag;
        return this;
    }
    public String getETag() {
        return this.ETag;
    }

    public ObjectSummary setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ObjectSummary setLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public String getLastModified() {
        return this.lastModified;
    }

    public ObjectSummary setOwner(Owner owner) {
        this.owner = owner;
        return this;
    }
    public Owner getOwner() {
        return this.owner;
    }

    public ObjectSummary setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ObjectSummary setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

    public ObjectSummary setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
