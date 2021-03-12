// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListIndustryPackagesRequest extends TeaModel {
    // 操作用户id
    @NameInMap("OperatorId")
    public String operatorId;

    // 操作用户名称
    @NameInMap("OperatorName")
    public String operatorName;

    // 领域
    @NameInMap("Domain")
    public String domain;

    // 每页条数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 当前页
    @NameInMap("NextToken")
    public Integer nextToken;

    public static ListIndustryPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIndustryPackagesRequest self = new ListIndustryPackagesRequest();
        return TeaModel.build(map, self);
    }

    public ListIndustryPackagesRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public ListIndustryPackagesRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public ListIndustryPackagesRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ListIndustryPackagesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIndustryPackagesRequest setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

}
