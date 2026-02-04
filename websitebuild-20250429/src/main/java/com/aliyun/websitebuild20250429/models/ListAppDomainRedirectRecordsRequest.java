// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppDomainRedirectRecordsRequest extends TeaModel {
    /**
     * <p>Application instance business ID</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The number of results per query.</p>
     * <p>Range: 10~100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Token for the next query. It is empty if there is no next query.</p>
     * 
     * <strong>example:</strong>
     * <p>yPkgBbQln0gmUnIZSGizGw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListAppDomainRedirectRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppDomainRedirectRecordsRequest self = new ListAppDomainRedirectRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppDomainRedirectRecordsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListAppDomainRedirectRecordsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAppDomainRedirectRecordsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
