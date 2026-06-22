// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRepoListRequest extends TeaModel {
    /**
     * <p>The page number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The search field. Valid values:</p>
     * <ul>
     * <li><strong>repoName</strong>: image repository name</li>
     * <li><strong>repoNamespace</strong>: image repository namespace</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>OperateType</strong> is set to <strong>other</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>repoName</p>
     */
    @NameInMap("FieldName")
    public String fieldName;

    /**
     * <p>The value of the search field.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>OperateType</strong> is set to <strong>other</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>zeus</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>The operation type. Valid values:</p>
     * <ul>
     * <li><strong>count</strong>: statistics</li>
     * <li><strong>other</strong>: other.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>count</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>The number of entries per page in a paged query. Default value: 20. If you leave this parameter empty, 20 entries are returned per page during paging.</p>
     * <blockquote>
     * <p>Set PageSize to a non-empty value.</p>
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
     * <p>The namespace of the container image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>libssh2</p>
     */
    @NameInMap("RepoNamespace")
    public String repoNamespace;

    /**
     * <p>Specifies whether the item is selected. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: No.</li>
     * <li><strong>1</strong>: Yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Selected")
    public Integer selected;

    /**
     * <p>The dimension of the defense switch configuration. Valid values:</p>
     * <ul>
     * <li><strong>image_repo</strong>: image repository ID.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>image_repo</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The type of the defense switch. Valid values:</p>
     * <ul>
     * <li><strong>image_repo</strong>: image repository defense.</li>
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

    public DescribeImageRepoListRequest setSelected(Integer selected) {
        this.selected = selected;
        return this;
    }
    public Integer getSelected() {
        return this.selected;
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
