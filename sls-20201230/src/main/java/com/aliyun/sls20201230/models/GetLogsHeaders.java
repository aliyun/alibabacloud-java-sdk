// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <strong>example:</strong>
     * <p>lz4</p>
     */
    @NameInMap("Accept-Encoding")
    public String acceptEncoding;

    public static GetLogsHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetLogsHeaders self = new GetLogsHeaders();
        return TeaModel.build(map, self);
    }

    public GetLogsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetLogsHeaders setAcceptEncoding(String acceptEncoding) {
        this.acceptEncoding = acceptEncoding;
        return this;
    }
    public String getAcceptEncoding() {
        return this.acceptEncoding;
    }

}
