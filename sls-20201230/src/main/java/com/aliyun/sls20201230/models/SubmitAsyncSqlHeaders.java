// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class SubmitAsyncSqlHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <strong>example:</strong>
     * <p>application/x-protobuf</p>
     */
    @NameInMap("Accept")
    public String accept;

    /**
     * <strong>example:</strong>
     * <p>lz4</p>
     */
    @NameInMap("Accept-Encoding")
    public String acceptEncoding;

    public static SubmitAsyncSqlHeaders build(java.util.Map<String, ?> map) throws Exception {
        SubmitAsyncSqlHeaders self = new SubmitAsyncSqlHeaders();
        return TeaModel.build(map, self);
    }

    public SubmitAsyncSqlHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SubmitAsyncSqlHeaders setAccept(String accept) {
        this.accept = accept;
        return this;
    }
    public String getAccept() {
        return this.accept;
    }

    public SubmitAsyncSqlHeaders setAcceptEncoding(String acceptEncoding) {
        this.acceptEncoding = acceptEncoding;
        return this;
    }
    public String getAcceptEncoding() {
        return this.acceptEncoding;
    }

}
