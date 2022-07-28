// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListSubscriptionByPackageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageData")
    public ListSubscriptionByPackageResponseBodyPageData pageData;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListSubscriptionByPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionByPackageResponseBody self = new ListSubscriptionByPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionByPackageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSubscriptionByPackageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public ListSubscriptionByPackageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSubscriptionByPackageResponseBodyPageDataData extends TeaModel {
        @NameInMap("PackageCode")
        public String packageCode;

        @NameInMap("PackageVersion")
        public String packageVersion;

        @NameInMap("RobotCode")
        public String robotCode;

        public static ListSubscriptionByPackageResponseBodyPageDataData build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionByPackageResponseBodyPageDataData self = new ListSubscriptionByPackageResponseBodyPageDataData();
            return TeaModel.build(map, self);
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

        public ListSubscriptionByPackageResponseBodyPageDataData setRobotCode(String robotCode) {
            this.robotCode = robotCode;
            return this;
        }
        public String getRobotCode() {
            return this.robotCode;
        }

    }

    public static class ListSubscriptionByPackageResponseBodyPageData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListSubscriptionByPackageResponseBodyPageDataData> data;

        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSubscriptionByPackageResponseBodyPageData build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionByPackageResponseBodyPageData self = new ListSubscriptionByPackageResponseBodyPageData();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionByPackageResponseBodyPageData setData(java.util.List<ListSubscriptionByPackageResponseBodyPageDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListSubscriptionByPackageResponseBodyPageDataData> getData() {
            return this.data;
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

        public ListSubscriptionByPackageResponseBodyPageData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
