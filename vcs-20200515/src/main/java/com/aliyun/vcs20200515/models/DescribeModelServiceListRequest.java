// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeModelServiceListRequest extends TeaModel {
    @NameInMap("AlgorithmCode")
    public String algorithmCode;

    @NameInMap("IncludeDeleted")
    public Boolean includeDeleted;

    @NameInMap("ModelServiceName")
    public String modelServiceName;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeModelServiceListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelServiceListRequest self = new DescribeModelServiceListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeModelServiceListRequest setAlgorithmCode(String algorithmCode) {
        this.algorithmCode = algorithmCode;
        return this;
    }
    public String getAlgorithmCode() {
        return this.algorithmCode;
    }

    public DescribeModelServiceListRequest setIncludeDeleted(Boolean includeDeleted) {
        this.includeDeleted = includeDeleted;
        return this;
    }
    public Boolean getIncludeDeleted() {
        return this.includeDeleted;
    }

    public DescribeModelServiceListRequest setModelServiceName(String modelServiceName) {
        this.modelServiceName = modelServiceName;
        return this;
    }
    public String getModelServiceName() {
        return this.modelServiceName;
    }

    public DescribeModelServiceListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeModelServiceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
