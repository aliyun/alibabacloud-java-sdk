// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogsV2Headers extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The compression method.</p>
     */
    @NameInMap("Accept-Encoding")
    public String acceptEncoding;

    public static GetLogsV2Headers build(java.util.Map<String, ?> map) throws Exception {
        GetLogsV2Headers self = new GetLogsV2Headers();
        return TeaModel.build(map, self);
    }

    public GetLogsV2Headers setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetLogsV2Headers setAcceptEncoding(String acceptEncoding) {
        this.acceptEncoding = acceptEncoding;
        return this;
    }
    public String getAcceptEncoding() {
        return this.acceptEncoding;
    }

}
