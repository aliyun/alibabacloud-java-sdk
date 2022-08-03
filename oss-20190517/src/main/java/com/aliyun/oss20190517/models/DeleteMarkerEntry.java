// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class DeleteMarkerEntry extends TeaModel {
    @NameInMap("IsLatest")
    public Boolean isLatest;

    @NameInMap("Key")
    public String key;

    @NameInMap("LastModified")
    public String lastModified;

    @NameInMap("Owner")
    public Owner owner;

    @NameInMap("VersionId")
    public String versionId;

    public static DeleteMarkerEntry build(java.util.Map<String, ?> map) throws Exception {
        DeleteMarkerEntry self = new DeleteMarkerEntry();
        return TeaModel.build(map, self);
    }

    public DeleteMarkerEntry setIsLatest(Boolean isLatest) {
        this.isLatest = isLatest;
        return this;
    }
    public Boolean getIsLatest() {
        return this.isLatest;
    }

    public DeleteMarkerEntry setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DeleteMarkerEntry setLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public String getLastModified() {
        return this.lastModified;
    }

    public DeleteMarkerEntry setOwner(Owner owner) {
        this.owner = owner;
        return this;
    }
    public Owner getOwner() {
        return this.owner;
    }

    public DeleteMarkerEntry setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
