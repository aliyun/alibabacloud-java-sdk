// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class GetTraceAnalysisRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Api")
    public String api;

    @NameInMap("Query")
    public String query;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    public static GetTraceAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTraceAnalysisRequest self = new GetTraceAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public GetTraceAnalysisRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTraceAnalysisRequest setApi(String api) {
        this.api = api;
        return this;
    }
    public String getApi() {
        return this.api;
    }

    public GetTraceAnalysisRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetTraceAnalysisRequest setProxyUserId(String proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public String getProxyUserId() {
        return this.proxyUserId;
    }

}
