// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RunNotifyComponentWithEmailResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("Page")
    public RunNotifyComponentWithEmailResponseBodyPage page;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D4CC979E-3D5B-5A6A-BC87-C93C9E861C7B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunNotifyComponentWithEmailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunNotifyComponentWithEmailResponseBody self = new RunNotifyComponentWithEmailResponseBody();
        return TeaModel.build(map, self);
    }

    public RunNotifyComponentWithEmailResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RunNotifyComponentWithEmailResponseBody setPage(RunNotifyComponentWithEmailResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public RunNotifyComponentWithEmailResponseBodyPage getPage() {
        return this.page;
    }

    public RunNotifyComponentWithEmailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunNotifyComponentWithEmailResponseBodyPage extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static RunNotifyComponentWithEmailResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            RunNotifyComponentWithEmailResponseBodyPage self = new RunNotifyComponentWithEmailResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public RunNotifyComponentWithEmailResponseBodyPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public RunNotifyComponentWithEmailResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public RunNotifyComponentWithEmailResponseBodyPage setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
