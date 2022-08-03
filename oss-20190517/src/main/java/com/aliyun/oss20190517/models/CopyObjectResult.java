// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class CopyObjectResult extends TeaModel {
    @NameInMap("ETag")
    public String ETag;

    @NameInMap("LastModified")
    public String lastModified;

    public static CopyObjectResult build(java.util.Map<String, ?> map) throws Exception {
        CopyObjectResult self = new CopyObjectResult();
        return TeaModel.build(map, self);
    }

    public CopyObjectResult setETag(String ETag) {
        this.ETag = ETag;
        return this;
    }
    public String getETag() {
        return this.ETag;
    }

    public CopyObjectResult setLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public String getLastModified() {
        return this.lastModified;
    }

}
