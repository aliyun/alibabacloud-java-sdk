// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListOOSLogsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OOSLogs")
    public String OOSLogs;

    @NameInMap("RequestId")
    public String requestId;

    public static ListOOSLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOOSLogsResponseBody self = new ListOOSLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOOSLogsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOOSLogsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOOSLogsResponseBody setOOSLogs(String OOSLogs) {
        this.OOSLogs = OOSLogs;
        return this;
    }
    public String getOOSLogs() {
        return this.OOSLogs;
    }

    public ListOOSLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
