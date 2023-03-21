// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockFileTypeSummaryResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<DescribeWebLockFileTypeSummaryResponseBodyList> list;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeWebLockFileTypeSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockFileTypeSummaryResponseBody self = new DescribeWebLockFileTypeSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockFileTypeSummaryResponseBody setList(java.util.List<DescribeWebLockFileTypeSummaryResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeWebLockFileTypeSummaryResponseBodyList> getList() {
        return this.list;
    }

    public DescribeWebLockFileTypeSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebLockFileTypeSummaryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeWebLockFileTypeSummaryResponseBodyList extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Type")
        public String type;

        public static DescribeWebLockFileTypeSummaryResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebLockFileTypeSummaryResponseBodyList self = new DescribeWebLockFileTypeSummaryResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeWebLockFileTypeSummaryResponseBodyList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeWebLockFileTypeSummaryResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
