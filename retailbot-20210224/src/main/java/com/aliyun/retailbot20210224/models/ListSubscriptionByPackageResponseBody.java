// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListSubscriptionByPackageResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("PageData")
    public ListSubscriptionByPackageResponseBodyPageData pageData;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSubscriptionByPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionByPackageResponseBody self = new ListSubscriptionByPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionByPackageResponseBody setPageData(ListSubscriptionByPackageResponseBodyPageData pageData) {
        this.pageData = pageData;
        return this;
    }
    public ListSubscriptionByPackageResponseBodyPageData getPageData() {
        return this.pageData;
    }

    public ListSubscriptionByPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSubscriptionByPackageResponseBodyPageDataData extends TeaModel {
        @NameInMap("RobotCode")
        public String robotCode;

        @NameInMap("PackageCode")
        public String packageCode;

        @NameInMap("PackageVersion")
        public String packageVersion;

        public static ListSubscriptionByPackageResponseBodyPageDataData build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionByPackageResponseBodyPageDataData self = new ListSubscriptionByPackageResponseBodyPageDataData();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionByPackageResponseBodyPageDataData setRobotCode(String robotCode) {
            this.robotCode = robotCode;
            return this;
        }
        public String getRobotCode() {
            return this.robotCode;
        }

        public ListSubscriptionByPackageResponseBodyPageDataData setPackageCode(String packageCode) {
            this.packageCode = packageCode;
            return this;
        }
        public String getPackageCode() {
            return this.packageCode;
        }

        public ListSubscriptionByPackageResponseBodyPageDataData setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

    }

    public static class ListSubscriptionByPackageResponseBodyPageData extends TeaModel {
        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("Data")
        public java.util.List<ListSubscriptionByPackageResponseBodyPageDataData> data;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSubscriptionByPackageResponseBodyPageData build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionByPackageResponseBodyPageData self = new ListSubscriptionByPackageResponseBodyPageData();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionByPackageResponseBodyPageData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListSubscriptionByPackageResponseBodyPageData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListSubscriptionByPackageResponseBodyPageData setData(java.util.List<ListSubscriptionByPackageResponseBodyPageDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListSubscriptionByPackageResponseBodyPageDataData> getData() {
            return this.data;
        }

        public ListSubscriptionByPackageResponseBodyPageData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
