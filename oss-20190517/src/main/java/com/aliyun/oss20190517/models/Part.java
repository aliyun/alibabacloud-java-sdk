// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class Part extends TeaModel {
    // description
    @NameInMap("ETag")
    public String ETag;

    // description
    @NameInMap("LastModified")
    public String lastModified;

    // description
    @NameInMap("PartNumber")
    public Long partNumber;

    // description
    @NameInMap("Size")
    public Long size;

    public static Part build(java.util.Map<String, ?> map) throws Exception {
        Part self = new Part();
        return TeaModel.build(map, self);
    }

    public Part setETag(String ETag) {
        this.ETag = ETag;
        return this;
    }
    public String getETag() {
        return this.ETag;
    }

    public Part setLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public String getLastModified() {
        return this.lastModified;
    }

    public Part setPartNumber(Long partNumber) {
        this.partNumber = partNumber;
        return this;
    }
    public Long getPartNumber() {
        return this.partNumber;
    }

    public Part setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
