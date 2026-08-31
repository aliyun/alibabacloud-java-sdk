// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetMaterializedViewHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The content type of the response. Simple Log Service supports application/json and application/x-protobuf response types.</p>
     * 
     * <strong>example:</strong>
     * <p>application/json</p>
     */
    @NameInMap("Content-Type")
    public String contentType;

    public static GetMaterializedViewHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetMaterializedViewHeaders self = new GetMaterializedViewHeaders();
        return TeaModel.build(map, self);
    }

    public GetMaterializedViewHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetMaterializedViewHeaders setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

}
