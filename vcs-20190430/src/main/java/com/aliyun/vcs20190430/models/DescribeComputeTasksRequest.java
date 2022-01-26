// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20190430.models;

import com.aliyun.tea.*;

public class DescribeComputeTasksRequest extends TeaModel {
    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("VcsId")
    public String vcsId;

    public static DescribeComputeTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeComputeTasksRequest self = new DescribeComputeTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeComputeTasksRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeComputeTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeComputeTasksRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeComputeTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeComputeTasksRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public DescribeComputeTasksRequest setVcsId(String vcsId) {
        this.vcsId = vcsId;
        return this;
    }
    public String getVcsId() {
        return this.vcsId;
    }

}
