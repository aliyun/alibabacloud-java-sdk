// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomBlockRecordsResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public DescribeCustomBlockRecordsResponseBodyPageInfo pageInfo;

    @NameInMap("RecordList")
    public java.util.List<DescribeCustomBlockRecordsResponseBodyRecordList> recordList;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
        @NameInMap("Target")
        public String target;

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
        @NameInMap("BlockExpireDate")
        public Long blockExpireDate;

        @NameInMap("BlockIp")
        public String blockIp;

        @NameInMap("Bound")
        public String bound;

        @NameInMap("EnableCount")
        public Integer enableCount;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ServerCount")
        public Integer serverCount;

        @NameInMap("Source")
        public String source;

        @NameInMap("Status")
        public Integer status;

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
