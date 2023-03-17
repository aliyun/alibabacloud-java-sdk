// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeCacheAnalysisReportResponseBody extends TeaModel {
    /**
     * <p>Details about the large keys.</p>
     */
    @NameInMap("BigKeys")
    public java.util.List<java.util.Map<String, ?>> bigKeys;

    /**
     * <p>Details about the hotkeys.</p>
     * <br>
     * <p>>  This parameter is not returned because ApsaraDB for Redis does not support hotkey analysis for the moment.</p>
     */
    @NameInMap("HotKeys")
    public java.util.List<java.util.Map<String, ?>> hotKeys;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on the current page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The maximum number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
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
