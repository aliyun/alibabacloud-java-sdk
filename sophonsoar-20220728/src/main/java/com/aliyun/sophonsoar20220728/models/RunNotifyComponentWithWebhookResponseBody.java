// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RunNotifyComponentWithWebhookResponseBody extends TeaModel {
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
    public RunNotifyComponentWithWebhookResponseBodyPage page;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E7698CFB-****-5840-8EC9-691B86729E94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunNotifyComponentWithWebhookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunNotifyComponentWithWebhookResponseBody self = new RunNotifyComponentWithWebhookResponseBody();
        return TeaModel.build(map, self);
    }

    public RunNotifyComponentWithWebhookResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RunNotifyComponentWithWebhookResponseBody setPage(RunNotifyComponentWithWebhookResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public RunNotifyComponentWithWebhookResponseBodyPage getPage() {
        return this.page;
    }

    public RunNotifyComponentWithWebhookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunNotifyComponentWithWebhookResponseBodyPage extends TeaModel {
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

        public static RunNotifyComponentWithWebhookResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            RunNotifyComponentWithWebhookResponseBodyPage self = new RunNotifyComponentWithWebhookResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public RunNotifyComponentWithWebhookResponseBodyPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public RunNotifyComponentWithWebhookResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public RunNotifyComponentWithWebhookResponseBodyPage setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
