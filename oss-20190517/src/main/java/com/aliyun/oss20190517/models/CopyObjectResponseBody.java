// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class CopyObjectResponseBody extends TeaModel {
    @NameInMap("ETag")
    public String ETag;

    @NameInMap("LastModified")
    public String lastModified;

    public static CopyObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyObjectResponseBody self = new CopyObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyObjectResponseBody setETag(String ETag) {
        this.ETag = ETag;
        return this;
    }
    public String getETag() {
        return this.ETag;
    }

    public CopyObjectResponseBody setLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public String getLastModified() {
        return this.lastModified;
    }

}
