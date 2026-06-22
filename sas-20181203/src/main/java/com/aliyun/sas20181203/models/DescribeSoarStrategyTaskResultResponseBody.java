// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSoarStrategyTaskResultResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeSoarStrategyTaskResultResponseBodyPageInfo pageInfo;

    /**
     * <p>The execution records.</p>
     */
    @NameInMap("Records")
    public java.util.List<String> records;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1683940A-E4AE-4473-8C40-F4075434****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSoarStrategyTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarStrategyTaskResultResponseBody self = new DescribeSoarStrategyTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSoarStrategyTaskResultResponseBody setPageInfo(DescribeSoarStrategyTaskResultResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeSoarStrategyTaskResultResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeSoarStrategyTaskResultResponseBody setRecords(java.util.List<String> records) {
        this.records = records;
        return this;
    }
    public java.util.List<String> getRecords() {
        return this.records;
    }

    public DescribeSoarStrategyTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSoarStrategyTaskResultResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The page number of the current page for a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The maximum number of entries per page for a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeSoarStrategyTaskResultResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSoarStrategyTaskResultResponseBodyPageInfo self = new DescribeSoarStrategyTaskResultResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSoarStrategyTaskResultResponseBodyPageInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeSoarStrategyTaskResultResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeSoarStrategyTaskResultResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
