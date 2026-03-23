// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetMLServiceResultsRequest extends TeaModel {
    /**
     * <ul>
     * <li><p>true: The request can use a built-in system service.</p>
     * </li>
     * <li><p>false: The request cannot use a built-in system service.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("allowBuiltin")
    public Boolean allowBuiltin;

    /**
     * <p>The request struct.</p>
     */
    @NameInMap("body")
    public MLServiceAnalysisParam body;

    /**
     * <p>The version number of the algorithm. Different versions correspond to different algorithms.</p>
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
