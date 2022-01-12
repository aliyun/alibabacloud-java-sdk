// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeCacheAnalysisReportResponseBody extends TeaModel {
    @NameInMap("BigKeys")
    public java.util.List<java.util.Map<String, ?>> bigKeys;

    @NameInMap("HotKeys")
    public java.util.List<java.util.Map<String, ?>> hotKeys;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeCacheAnalysisReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCacheAnalysisReportResponseBody self = new DescribeCacheAnalysisReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCacheAnalysisReportResponseBody setBigKeys(java.util.List<java.util.Map<String, ?>> bigKeys) {
        this.bigKeys = bigKeys;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getBigKeys() {
        return this.bigKeys;
    }

    public DescribeCacheAnalysisReportResponseBody setHotKeys(java.util.List<java.util.Map<String, ?>> hotKeys) {
        this.hotKeys = hotKeys;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getHotKeys() {
        return this.hotKeys;
    }

    public DescribeCacheAnalysisReportResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCacheAnalysisReportResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeCacheAnalysisReportResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCacheAnalysisReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCacheAnalysisReportResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

}
