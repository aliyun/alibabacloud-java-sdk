// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetPreSignedUrlForPutObjectHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a9c3a20210af000</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static GetPreSignedUrlForPutObjectHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetPreSignedUrlForPutObjectHeaders self = new GetPreSignedUrlForPutObjectHeaders();
        return TeaModel.build(map, self);
    }

    public GetPreSignedUrlForPutObjectHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetPreSignedUrlForPutObjectHeaders setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
