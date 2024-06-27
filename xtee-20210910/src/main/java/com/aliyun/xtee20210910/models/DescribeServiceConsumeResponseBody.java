// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeServiceConsumeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("consumeRecords")
    public java.util.List<DescribeServiceConsumeResponseBodyConsumeRecords> consumeRecords;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("totalItem")
    public Integer totalItem;

    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeServiceConsumeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceConsumeResponseBody self = new DescribeServiceConsumeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceConsumeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceConsumeResponseBody setConsumeRecords(java.util.List<DescribeServiceConsumeResponseBodyConsumeRecords> consumeRecords) {
        this.consumeRecords = consumeRecords;
        return this;
    }
    public java.util.List<DescribeServiceConsumeResponseBodyConsumeRecords> getConsumeRecords() {
        return this.consumeRecords;
    }

    public DescribeServiceConsumeResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeServiceConsumeResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeServiceConsumeResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeServiceConsumeResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeServiceConsumeResponseBodyConsumeRecordsRecords extends TeaModel {
        @NameInMap("count")
        public Integer count;

        @NameInMap("serviceCode")
        public String serviceCode;

        public static DescribeServiceConsumeResponseBodyConsumeRecordsRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceConsumeResponseBodyConsumeRecordsRecords self = new DescribeServiceConsumeResponseBodyConsumeRecordsRecords();
            return TeaModel.build(map, self);
        }

        public DescribeServiceConsumeResponseBodyConsumeRecordsRecords setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeServiceConsumeResponseBodyConsumeRecordsRecords setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

    }

    public static class DescribeServiceConsumeResponseBodyConsumeRecords extends TeaModel {
        @NameInMap("date")
        public String date;

        @NameInMap("records")
        public java.util.List<DescribeServiceConsumeResponseBodyConsumeRecordsRecords> records;

        public static DescribeServiceConsumeResponseBodyConsumeRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceConsumeResponseBodyConsumeRecords self = new DescribeServiceConsumeResponseBodyConsumeRecords();
            return TeaModel.build(map, self);
        }

        public DescribeServiceConsumeResponseBodyConsumeRecords setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeServiceConsumeResponseBodyConsumeRecords setRecords(java.util.List<DescribeServiceConsumeResponseBodyConsumeRecordsRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<DescribeServiceConsumeResponseBodyConsumeRecordsRecords> getRecords() {
            return this.records;
        }

    }

}
