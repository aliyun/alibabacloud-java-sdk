// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qktest20210908.models;

import com.aliyun.tea.*;

public class ListTestBooksRequest extends TeaModel {
    // 查询过滤参数，多个过滤参数之间是且的关系。例如:过滤实例名称为i-a123、i-b123，且实例状态为Stopped：&Filter.1.Name=InstanceName&Filter.1.Value.1=i-a123&Filter.1.Value.2=i-b123&Filter.2.Name=Status&Filter.2.Value=Stopped。
    @NameInMap("Filter")
    public String filter;

    // 返回结果的最大个数。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("TestBookIds")
    public java.util.List<String> testBookIds;

    public static ListTestBooksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTestBooksRequest self = new ListTestBooksRequest();
        return TeaModel.build(map, self);
    }

    public ListTestBooksRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListTestBooksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTestBooksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTestBooksRequest setTestBookIds(java.util.List<String> testBookIds) {
        this.testBookIds = testBookIds;
        return this;
    }
    public java.util.List<String> getTestBookIds() {
        return this.testBookIds;
    }

}
