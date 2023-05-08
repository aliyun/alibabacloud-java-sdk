// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRepoListRequest extends TeaModel {
    /**
     * <p>The type of the feature. Valid values:</p>
     * <br>
     * <p>*   **image_repo**: image repository protection</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Indicates whether the feature takes effect on the image repository. Valid values:</p>
     * <br>
     * <p>*   **add**: yes</p>
     * <p>*   **del**: no</p>
     */
    @NameInMap("FieldName")
    public String fieldName;

    /**
     * <p>The namespace to which the image repository belongs.</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>The type of the operation. Valid values:</p>
     * <br>
     * <p>*   **count**: counts statistics</p>
     * <p>*   **other**: others</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of entries returned on the current page.</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The name of the image repository.</p>
     */
    @NameInMap("RepoNamespace")
    public String repoNamespace;

    /**
     * <p>The total number of image repositories.</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The information about the image repository.</p>
     */
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
