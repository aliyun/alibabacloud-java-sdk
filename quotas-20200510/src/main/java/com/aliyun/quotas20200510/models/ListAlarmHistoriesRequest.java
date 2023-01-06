// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListAlarmHistoriesRequest extends TeaModel {
    // The end of the time range to query.
    @NameInMap("EndTime")
    public Long endTime;

    // The keyword that is used to execute the query.
    @NameInMap("Keyword")
    public String keyword;

    // The maximum number of records to be returned for the query.
    // 
    // Valid values: 1 to 200. Default value: 30.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that is used to mark the location where the query is started. An empty value indicates that the query is executed from the start.
    @NameInMap("NextToken")
    public String nextToken;

    // The abbreviation of the cloud service name.
    // 
    // >  For more information about the Alibaba Cloud services that support Quota Center, see [Alibaba Cloud services that support Quota Center](~~182368~~).
    @NameInMap("ProductCode")
    public String productCode;

    // The start of the time range to query.
    @NameInMap("StartTime")
    public Long startTime;

    public static ListAlarmHistoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmHistoriesRequest self = new ListAlarmHistoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListAlarmHistoriesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListAlarmHistoriesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListAlarmHistoriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAlarmHistoriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAlarmHistoriesRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListAlarmHistoriesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
