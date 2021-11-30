// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class CopyPartResult extends TeaModel {
    // A short description of ETag
    @NameInMap("ETag")
    public String ETag;

    // A short description of LastModified
    @NameInMap("LastModified")
    public String lastModified;

    public static CopyPartResult build(java.util.Map<String, ?> map) throws Exception {
        CopyPartResult self = new CopyPartResult();
        return TeaModel.build(map, self);
    }

    public CopyPartResult setETag(String ETag) {
        this.ETag = ETag;
        return this;
    }
    public String getETag() {
        return this.ETag;
    }

    public CopyPartResult setLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public String getLastModified() {
        return this.lastModified;
    }

}
