// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryTaskListRequest extends TeaModel {
    @NameInMap("DigTaskPageQuery")
    public QueryTaskListRequestDigTaskPageQuery digTaskPageQuery;

    @NameInMap("PageData")
    public QueryTaskListRequestPageData pageData;

    public static QueryTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskListRequest self = new QueryTaskListRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskListRequest setDigTaskPageQuery(QueryTaskListRequestDigTaskPageQuery digTaskPageQuery) {
        this.digTaskPageQuery = digTaskPageQuery;
        return this;
    }
    public QueryTaskListRequestDigTaskPageQuery getDigTaskPageQuery() {
        return this.digTaskPageQuery;
    }

    public QueryTaskListRequest setPageData(QueryTaskListRequestPageData pageData) {
        this.pageData = pageData;
        return this;
    }
    public QueryTaskListRequestPageData getPageData() {
        return this.pageData;
    }

    public static class QueryTaskListRequestDigTaskPageQuery extends TeaModel {
        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("RobotCode")
        public String robotCode;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("Type")
        public String type;

        public static QueryTaskListRequestDigTaskPageQuery build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskListRequestDigTaskPageQuery self = new QueryTaskListRequestDigTaskPageQuery();
            return TeaModel.build(map, self);
        }

        public QueryTaskListRequestDigTaskPageQuery setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public QueryTaskListRequestDigTaskPageQuery setRobotCode(String robotCode) {
            this.robotCode = robotCode;
            return this;
        }
        public String getRobotCode() {
            return this.robotCode;
        }

        public QueryTaskListRequestDigTaskPageQuery setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public QueryTaskListRequestDigTaskPageQuery setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryTaskListRequestPageData extends TeaModel {
        // 返回的最大记录数
        @NameInMap("MaxResults")
        public Long maxResults;

        // 下一页的token
        @NameInMap("NextToken")
        public String nextToken;

        public static QueryTaskListRequestPageData build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskListRequestPageData self = new QueryTaskListRequestPageData();
            return TeaModel.build(map, self);
        }

        public QueryTaskListRequestPageData setMaxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Long getMaxResults() {
            return this.maxResults;
        }

        public QueryTaskListRequestPageData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
