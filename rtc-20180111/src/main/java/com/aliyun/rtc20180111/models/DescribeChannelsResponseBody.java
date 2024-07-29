// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Records")
    public java.util.List<String> records;

    /**
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CF8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCnt")
    public Integer totalCnt;

    public static DescribeChannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelsResponseBody self = new DescribeChannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChannelsResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeChannelsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeChannelsResponseBody setRecords(java.util.List<String> records) {
        this.records = records;
        return this;
    }
    public java.util.List<String> getRecords() {
        return this.records;
    }

    public DescribeChannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChannelsResponseBody setTotalCnt(Integer totalCnt) {
        this.totalCnt = totalCnt;
        return this;
    }
    public Integer getTotalCnt() {
        return this.totalCnt;
    }

}
