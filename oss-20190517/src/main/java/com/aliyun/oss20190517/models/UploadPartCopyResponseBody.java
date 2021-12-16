// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class UploadPartCopyResponseBody extends TeaModel {
    @NameInMap("ETag")
    public String ETag;

    @NameInMap("LastModified")
    public String lastModified;

    public static UploadPartCopyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadPartCopyResponseBody self = new UploadPartCopyResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadPartCopyResponseBody setETag(String ETag) {
        this.ETag = ETag;
        return this;
    }
    public String getETag() {
        return this.ETag;
    }

    public UploadPartCopyResponseBody setLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public String getLastModified() {
        return this.lastModified;
    }

}
