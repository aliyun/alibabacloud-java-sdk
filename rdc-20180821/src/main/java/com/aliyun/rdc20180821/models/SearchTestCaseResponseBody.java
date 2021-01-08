// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class SearchTestCaseResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SearchTestCaseResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static SearchTestCaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTestCaseResponseBody self = new SearchTestCaseResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTestCaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchTestCaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchTestCaseResponseBody setData(SearchTestCaseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchTestCaseResponseBodyData getData() {
        return this.data;
    }

    public SearchTestCaseResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SearchTestCaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchTestCaseResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public String pageNum;

        @NameInMap("Cases")
        public String cases;

        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("PageTotal")
        public String pageTotal;

        @NameInMap("TotalCount")
        public String totalCount;

        public static SearchTestCaseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchTestCaseResponseBodyData self = new SearchTestCaseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchTestCaseResponseBodyData setPageNum(String pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public String getPageNum() {
            return this.pageNum;
        }

        public SearchTestCaseResponseBodyData setCases(String cases) {
            this.cases = cases;
            return this;
        }
        public String getCases() {
            return this.cases;
        }

        public SearchTestCaseResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public SearchTestCaseResponseBodyData setPageTotal(String pageTotal) {
            this.pageTotal = pageTotal;
            return this;
        }
        public String getPageTotal() {
            return this.pageTotal;
        }

        public SearchTestCaseResponseBodyData setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
