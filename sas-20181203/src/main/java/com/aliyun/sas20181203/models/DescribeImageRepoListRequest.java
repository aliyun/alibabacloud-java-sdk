// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRepoListRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the field that is used for the query. Valid values:</p>
     * <ul>
     * <li><strong>repoName</strong>: the name of the image repository</li>
     * <li><strong>repoNamespace</strong>: the namespace to which the image repository belongs</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only when the <strong>OperateType</strong> parameter is set to <strong>other</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>repoName</p>
     */
    @NameInMap("FieldName")
    public String fieldName;

    /**
     * <p>The value of the field that is used for the query.</p>
     * <blockquote>
     * <p> This parameter takes effect only when the <strong>OperateType</strong> parameter is set to <strong>other</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>zeus</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>The type of the operation. Valid values:</p>
     * <ul>
     * <li><strong>count</strong>: counts statistics</li>
     * <li><strong>other</strong>: others</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>count</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p> We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>script7</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The namespace to which the image repository belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>libssh2</p>
     */
    @NameInMap("RepoNamespace")
    public String repoNamespace;

    /**
     * <p>The condition by which the feature is applied. Valid values:</p>
     * <ul>
     * <li><strong>image_repo</strong>: the ID of the image repository</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>image_repo</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The type of the feature. Valid values:</p>
     * <ul>
     * <li><strong>image_repo</strong>: image repository protection</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>image_repo</p>
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
