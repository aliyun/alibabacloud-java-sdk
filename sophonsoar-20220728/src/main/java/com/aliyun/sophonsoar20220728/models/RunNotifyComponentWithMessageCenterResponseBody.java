// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RunNotifyComponentWithMessageCenterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public String data;

    @NameInMap("Page")
    public RunNotifyComponentWithMessageCenterResponseBodyPage page;

    /**
     * <strong>example:</strong>
     * <p>E7698CFB-4E1C-5840-8EC9-691B86729E94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunNotifyComponentWithMessageCenterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunNotifyComponentWithMessageCenterResponseBody self = new RunNotifyComponentWithMessageCenterResponseBody();
        return TeaModel.build(map, self);
    }

    public RunNotifyComponentWithMessageCenterResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RunNotifyComponentWithMessageCenterResponseBody setPage(RunNotifyComponentWithMessageCenterResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public RunNotifyComponentWithMessageCenterResponseBodyPage getPage() {
        return this.page;
    }

    public RunNotifyComponentWithMessageCenterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunNotifyComponentWithMessageCenterResponseBodyPage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static RunNotifyComponentWithMessageCenterResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            RunNotifyComponentWithMessageCenterResponseBodyPage self = new RunNotifyComponentWithMessageCenterResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public RunNotifyComponentWithMessageCenterResponseBodyPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public RunNotifyComponentWithMessageCenterResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public RunNotifyComponentWithMessageCenterResponseBodyPage setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
