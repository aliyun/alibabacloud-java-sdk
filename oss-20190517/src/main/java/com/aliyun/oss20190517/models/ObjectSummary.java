// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ObjectSummary extends TeaModel {
    @NameInMap("ETag")
    public String ETag;

    @NameInMap("Key")
    public String key;

    @NameInMap("LastModified")
    public String lastModified;

    @NameInMap("Owner")
    public Owner owner;

    @NameInMap("ResoreInfo")
    public String resoreInfo;

    @NameInMap("Size")
    public Long size;

    @NameInMap("StorageClass")
    public String storageClass;

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

    public ObjectSummary setResoreInfo(String resoreInfo) {
        this.resoreInfo = resoreInfo;
        return this;
    }
    public String getResoreInfo() {
        return this.resoreInfo;
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
