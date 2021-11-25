// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeDataSourcesRequest extends TeaModel {
    @NameInMap("CorpIdList")
    public String corpIdList;

    @NameInMap("DataSourceCategory")
    public String dataSourceCategory;

    @NameInMap("DataSourceFilter")
    public String dataSourceFilter;

    @NameInMap("DataSourceIdList")
    public String dataSourceIdList;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StreamStatus")
    public String streamStatus;

    public static DescribeDataSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourcesRequest self = new DescribeDataSourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourcesRequest setCorpIdList(String corpIdList) {
        this.corpIdList = corpIdList;
        return this;
    }
    public String getCorpIdList() {
        return this.corpIdList;
    }

    public DescribeDataSourcesRequest setDataSourceCategory(String dataSourceCategory) {
        this.dataSourceCategory = dataSourceCategory;
        return this;
    }
    public String getDataSourceCategory() {
        return this.dataSourceCategory;
    }

    public DescribeDataSourcesRequest setDataSourceFilter(String dataSourceFilter) {
        this.dataSourceFilter = dataSourceFilter;
        return this;
    }
    public String getDataSourceFilter() {
        return this.dataSourceFilter;
    }

    public DescribeDataSourcesRequest setDataSourceIdList(String dataSourceIdList) {
        this.dataSourceIdList = dataSourceIdList;
        return this;
    }
    public String getDataSourceIdList() {
        return this.dataSourceIdList;
    }

    public DescribeDataSourcesRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public DescribeDataSourcesRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeDataSourcesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDataSourcesRequest setStreamStatus(String streamStatus) {
        this.streamStatus = streamStatus;
        return this;
    }
    public String getStreamStatus() {
        return this.streamStatus;
    }

}
