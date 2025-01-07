// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryAssetDetailByUUIDRequest extends TeaModel {
    /**
     * <p>A key-value pair that consists of the user ID and the asset list.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;AliUid&quot;: &quot;176618589410****&quot;,
     *       &quot;UuidList&quot;: [
     *             &quot;429fe207-3014-40c6-972b-cdff1d7a****&quot;,
     *             &quot;429fe207-3014-40c6-972b-cdff1d7b****&quot;,
     *             &quot;429fe207-3014-40c6-972b-cdff1d7c****&quot;
     *       ]
     * }</p>
     */
    @NameInMap("Requests")
    public String requests;

    public static QueryAssetDetailByUUIDRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAssetDetailByUUIDRequest self = new QueryAssetDetailByUUIDRequest();
        return TeaModel.build(map, self);
    }

    public QueryAssetDetailByUUIDRequest setRequests(String requests) {
        this.requests = requests;
        return this;
    }
    public String getRequests() {
        return this.requests;
    }

}
