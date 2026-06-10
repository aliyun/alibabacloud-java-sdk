// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryMaterialFileListShrinkRequest extends TeaModel {
    /**
     * <p>Business ID of the application instance</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Folder ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>68157a0a-769a-4364-bbdc-a0e2cf3d5ad</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>Maximum file size</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("MaxFileSize")
    public Long maxFileSize;

    /**
     * <p>Number of results per query.</p>
     * <p>Valid values: 10 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Minimum file size</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MinFileSize")
    public Long minFileSize;

    /**
     * <p>Website name</p>
     * 
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Token indicating the start of the next query. It is empty when there is no subsequent query.</p>
     * 
     * <strong>example:</strong>
     * <p>0l45bkwM022Dt+rOvPi/oQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Sorting field</p>
     * 
     * <strong>example:</strong>
     * <p>gmtCreated</p>
     */
    @NameInMap("OrderColumn")
    public String orderColumn;

    /**
     * <p>Sorting type: ASC or DESC</p>
     * 
     * <strong>example:</strong>
     * <p>BUY</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>Page number. Default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>Page size. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Status range</p>
     */
    @NameInMap("StatusList")
    public String statusListShrink;

    /**
     * <p>File suffix list</p>
     */
    @NameInMap("SuffixList")
    public String suffixListShrink;

    /**
     * <p>List of file types</p>
     */
    @NameInMap("TypeList")
    public String typeListShrink;

    public static QueryMaterialFileListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMaterialFileListShrinkRequest self = new QueryMaterialFileListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryMaterialFileListShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryMaterialFileListShrinkRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public QueryMaterialFileListShrinkRequest setMaxFileSize(Long maxFileSize) {
        this.maxFileSize = maxFileSize;
        return this;
    }
    public Long getMaxFileSize() {
        return this.maxFileSize;
    }

    public QueryMaterialFileListShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryMaterialFileListShrinkRequest setMinFileSize(Long minFileSize) {
        this.minFileSize = minFileSize;
        return this;
    }
    public Long getMinFileSize() {
        return this.minFileSize;
    }

    public QueryMaterialFileListShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryMaterialFileListShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryMaterialFileListShrinkRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public QueryMaterialFileListShrinkRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public QueryMaterialFileListShrinkRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryMaterialFileListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMaterialFileListShrinkRequest setStatusListShrink(String statusListShrink) {
        this.statusListShrink = statusListShrink;
        return this;
    }
    public String getStatusListShrink() {
        return this.statusListShrink;
    }

    public QueryMaterialFileListShrinkRequest setSuffixListShrink(String suffixListShrink) {
        this.suffixListShrink = suffixListShrink;
        return this;
    }
    public String getSuffixListShrink() {
        return this.suffixListShrink;
    }

    public QueryMaterialFileListShrinkRequest setTypeListShrink(String typeListShrink) {
        this.typeListShrink = typeListShrink;
        return this;
    }
    public String getTypeListShrink() {
        return this.typeListShrink;
    }

}
