// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20190430.models;

import com.aliyun.tea.*;

public class DescribeProjectsRequest extends TeaModel {
    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VcsId")
    public String vcsId;

    public static DescribeProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectsRequest self = new DescribeProjectsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProjectsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeProjectsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeProjectsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DescribeProjectsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeProjectsRequest setVcsId(String vcsId) {
        this.vcsId = vcsId;
        return this;
    }
    public String getVcsId() {
        return this.vcsId;
    }

}
