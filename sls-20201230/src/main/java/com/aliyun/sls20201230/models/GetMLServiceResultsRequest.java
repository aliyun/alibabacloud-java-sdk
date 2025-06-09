// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetMLServiceResultsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("allowBuiltin")
    public Boolean allowBuiltin;

    @NameInMap("body")
    public MLServiceAnalysisParam body;

    /**
     * <p>The version of the algorithm. The algorithm varies based on the version.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("version")
    public String version;

    public static GetMLServiceResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMLServiceResultsRequest self = new GetMLServiceResultsRequest();
        return TeaModel.build(map, self);
    }

    public GetMLServiceResultsRequest setAllowBuiltin(Boolean allowBuiltin) {
        this.allowBuiltin = allowBuiltin;
        return this;
    }
    public Boolean getAllowBuiltin() {
        return this.allowBuiltin;
    }

    public GetMLServiceResultsRequest setBody(MLServiceAnalysisParam body) {
        this.body = body;
        return this;
    }
    public MLServiceAnalysisParam getBody() {
        return this.body;
    }

    public GetMLServiceResultsRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
