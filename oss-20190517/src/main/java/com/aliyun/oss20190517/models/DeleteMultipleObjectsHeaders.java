// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class DeleteMultipleObjectsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("content-md5")
    public String contentMd5;

    public static DeleteMultipleObjectsHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultipleObjectsHeaders self = new DeleteMultipleObjectsHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteMultipleObjectsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteMultipleObjectsHeaders setContentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
        return this;
    }
    public String getContentMd5() {
        return this.contentMd5;
    }

}
