// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListMultiAccountDeliveryChannelsRequest extends TeaModel {
    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * <p>If the number of returned entries exceeds the <code>MaxResults</code> value, the entries are truncated and this token is returned. To fetch the remaining entries, pass this token in the subsequent request.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAARfZmVDe9NvRXloR5+8CK9nNJufMdRA7W1miLC1P****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListMultiAccountDeliveryChannelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMultiAccountDeliveryChannelsRequest self = new ListMultiAccountDeliveryChannelsRequest();
        return TeaModel.build(map, self);
    }

    public ListMultiAccountDeliveryChannelsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMultiAccountDeliveryChannelsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
