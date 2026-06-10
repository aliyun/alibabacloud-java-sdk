// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListIsvPaymentPluginConfigsRequest extends TeaModel {
    /**
     * <p>Business ID</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250821161210000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Number of results per query.</p>
     * <p>Valid range: 10 to 100. Default Value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Token indicating the start of the next query. It is empty when there is no next query.</p>
     * 
     * <strong>example:</strong>
     * <p>FFh3Xqm+JgZ/U9Jyb7wdVr9LWk80Tghn5UZjbcWEVEderBcbVF+Y6PS0i8PpCL4PQZ3e0C9oEH0Asd4tJEuGtkl2WuKdiWZpEwadNydQdJPFM=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListIsvPaymentPluginConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIsvPaymentPluginConfigsRequest self = new ListIsvPaymentPluginConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListIsvPaymentPluginConfigsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListIsvPaymentPluginConfigsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIsvPaymentPluginConfigsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
