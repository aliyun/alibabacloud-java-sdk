// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomBlockRecordsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeCustomBlockRecordsResponseBodyPageInfo pageInfo;

    /**
     * <p>An array that consists of the defense rules.</p>
     */
    @NameInMap("RecordList")
    public java.util.List<DescribeCustomBlockRecordsResponseBodyRecordList> recordList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCustomBlockRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomBlockRecordsResponseBody self = new DescribeCustomBlockRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomBlockRecordsResponseBody setPageInfo(DescribeCustomBlockRecordsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeCustomBlockRecordsResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeCustomBlockRecordsResponseBody setRecordList(java.util.List<DescribeCustomBlockRecordsResponseBodyRecordList> recordList) {
        this.recordList = recordList;
        return this;
    }
    public java.util.List<DescribeCustomBlockRecordsResponseBodyRecordList> getRecordList() {
        return this.recordList;
    }

    public DescribeCustomBlockRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCustomBlockRecordsResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeCustomBlockRecordsResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomBlockRecordsResponseBodyPageInfo self = new DescribeCustomBlockRecordsResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCustomBlockRecordsResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeCustomBlockRecordsResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeCustomBlockRecordsResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeCustomBlockRecordsResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeCustomBlockRecordsResponseBodyRecordListTargetList extends TeaModel {
        /**
         * <p>The ID of the destination asset.</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The type of the query. Valid values:</p>
         * <br>
         * <p>*   Set the value to **uuid**.</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static DescribeCustomBlockRecordsResponseBodyRecordListTargetList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomBlockRecordsResponseBodyRecordListTargetList self = new DescribeCustomBlockRecordsResponseBodyRecordListTargetList();
            return TeaModel.build(map, self);
        }

        public DescribeCustomBlockRecordsResponseBodyRecordListTargetList setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeCustomBlockRecordsResponseBodyRecordListTargetList setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class DescribeCustomBlockRecordsResponseBodyRecordList extends TeaModel {
        /**
         * <p>The timestamp generated when the block action on the IP address becomes invalid.</p>
         */
        @NameInMap("BlockExpireDate")
        public Long blockExpireDate;

        /**
         * <p>The blocked IP address.</p>
         */
        @NameInMap("BlockIp")
        public String blockIp;

        /**
         * <p>The direction of the traffic that is sent by the blocked IP address. Valid values:</p>
         * <br>
         * <p>*   **in**</p>
         * <p>*   **out**</p>
         */
        @NameInMap("Bound")
        public String bound;

        /**
         * <p>The number of servers for which the defense rule is enabled.</p>
         */
        @NameInMap("EnableCount")
        public Integer enableCount;

        /**
         * <p>The record ID.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The total number of servers on which the IP address is blocked.</p>
         */
        @NameInMap("ServerCount")
        public Integer serverCount;

        /**
         * <p>The source of the defense rule.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The status of the defense rule against brute-force attacks. Valid values:</p>
         * <br>
         * <p>*   **0**: invalid.</p>
         * <p>*   **1**: enabled.</p>
         * <p>*   **2**: failed.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The servers for which the defense rule is enabled.</p>
         */
        @NameInMap("TargetList")
        public java.util.List<DescribeCustomBlockRecordsResponseBodyRecordListTargetList> targetList;

        public static DescribeCustomBlockRecordsResponseBodyRecordList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomBlockRecordsResponseBodyRecordList self = new DescribeCustomBlockRecordsResponseBodyRecordList();
            return TeaModel.build(map, self);
        }

        public DescribeCustomBlockRecordsResponseBodyRecordList setBlockExpireDate(Long blockExpireDate) {
            this.blockExpireDate = blockExpireDate;
            return this;
        }
        public Long getBlockExpireDate() {
            return this.blockExpireDate;
        }

        public DescribeCustomBlockRecordsResponseBodyRecordList setBlockIp(String blockIp) {
            this.blockIp = blockIp;
            return this;
        }
        public String getBlockIp() {
            return this.blockIp;
        }

        public DescribeCustomBlockRecordsResponseBodyRecordList setBound(String bound) {
            this.bound = bound;
            return this;
        }
        public String getBound() {
            return this.bound;
        }

        public DescribeCustomBlockRecordsResponseBodyRecordList setEnableCount(Integer enableCount) {
            this.enableCount = enableCount;
            return this;
        }
        public Integer getEnableCount() {
            return this.enableCount;
        }

        public DescribeCustomBlockRecordsResponseBodyRecordList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeCustomBlockRecordsResponseBodyRecordList setServerCount(Integer serverCount) {
            this.serverCount = serverCount;
            return this;
        }
        public Integer getServerCount() {
            return this.serverCount;
        }

        public DescribeCustomBlockRecordsResponseBodyRecordList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeCustomBlockRecordsResponseBodyRecordList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCustomBlockRecordsResponseBodyRecordList setTargetList(java.util.List<DescribeCustomBlockRecordsResponseBodyRecordListTargetList> targetList) {
            this.targetList = targetList;
            return this;
        }
        public java.util.List<DescribeCustomBlockRecordsResponseBodyRecordListTargetList> getTargetList() {
            return this.targetList;
        }

    }

}
