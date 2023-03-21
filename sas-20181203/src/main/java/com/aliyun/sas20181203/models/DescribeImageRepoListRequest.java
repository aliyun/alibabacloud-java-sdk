// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRepoListRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("FieldName")
    public String fieldName;

    @NameInMap("FieldValue")
    public String fieldValue;

    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RepoName")
    public String repoName;

    @NameInMap("RepoNamespace")
    public String repoNamespace;

    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("Type")
    public String type;

    public static DescribeImageRepoListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageRepoListRequest self = new DescribeImageRepoListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageRepoListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageRepoListRequest setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public DescribeImageRepoListRequest setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }
    public String getFieldValue() {
        return this.fieldValue;
    }

    public DescribeImageRepoListRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public DescribeImageRepoListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageRepoListRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public DescribeImageRepoListRequest setRepoNamespace(String repoNamespace) {
        this.repoNamespace = repoNamespace;
        return this;
    }
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    public DescribeImageRepoListRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public DescribeImageRepoListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
