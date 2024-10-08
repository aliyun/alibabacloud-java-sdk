// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListMultiAccountTagValuesResponseBody extends TeaModel {
    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJzZWFyY2hBZnRlcnMiOlsiMTAwMTU2Nzk4MTU1OSJd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>36A3D9BE-B607-5993-B546-7E19EF65DC00</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tag values.</p>
     */
    @NameInMap("TagValues")
    public java.util.List<String> tagValues;

    public static ListMultiAccountTagValuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMultiAccountTagValuesResponseBody self = new ListMultiAccountTagValuesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMultiAccountTagValuesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMultiAccountTagValuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMultiAccountTagValuesResponseBody setTagValues(java.util.List<String> tagValues) {
        this.tagValues = tagValues;
        return this;
    }
    public java.util.List<String> getTagValues() {
        return this.tagValues;
    }

}
