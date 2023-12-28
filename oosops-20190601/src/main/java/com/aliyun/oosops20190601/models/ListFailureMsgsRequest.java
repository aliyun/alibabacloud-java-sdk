// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListFailureMsgsRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestFingerprint")
    public String requestFingerprint;

    public static ListFailureMsgsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFailureMsgsRequest self = new ListFailureMsgsRequest();
        return TeaModel.build(map, self);
    }

    public ListFailureMsgsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListFailureMsgsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFailureMsgsRequest setRequestFingerprint(String requestFingerprint) {
        this.requestFingerprint = requestFingerprint;
        return this;
    }
    public String getRequestFingerprint() {
        return this.requestFingerprint;
    }

}
