// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class CompleteMultipartUploadHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x-oss-complete-all")
    public String xOssCompleteAll;

    @NameInMap("x-oss-forbid-overwrite")
    public String xOssForbidOverwrite;

    public static CompleteMultipartUploadHeaders build(java.util.Map<String, ?> map) throws Exception {
        CompleteMultipartUploadHeaders self = new CompleteMultipartUploadHeaders();
        return TeaModel.build(map, self);
    }

    public CompleteMultipartUploadHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CompleteMultipartUploadHeaders setXOssCompleteAll(String xOssCompleteAll) {
        this.xOssCompleteAll = xOssCompleteAll;
        return this;
    }
    public String getXOssCompleteAll() {
        return this.xOssCompleteAll;
    }

    public CompleteMultipartUploadHeaders setXOssForbidOverwrite(String xOssForbidOverwrite) {
        this.xOssForbidOverwrite = xOssForbidOverwrite;
        return this;
    }
    public String getXOssForbidOverwrite() {
        return this.xOssForbidOverwrite;
    }

}
