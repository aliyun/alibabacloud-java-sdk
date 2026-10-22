// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryMaterialFileListRequest extends TeaModel {
    /**
     * <p>The business ID of the application instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The directory ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>68157a0a-769a-4364-bbdc-a0e2cf3d5ad</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The maximum file size.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("MaxFileSize")
    public Long maxFileSize;

    /**
     * <p>The maximum number of entries to return for a single request.</p>
     * <p>Valid values: 10 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The minimum file size.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MinFileSize")
    public Long minFileSize;

    /**
     * <p>The website name.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The token that is used to start the next query. If no next query is available, this parameter is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>0l45bkwM022Dt+rOvPi/oQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort field.</p>
     * 
     * <strong>example:</strong>
     * <p>gmtCreated</p>
     */
    @NameInMap("OrderColumn")
    public String orderColumn;

    /**
     * <p>The sort order. Valid values: ASC and DESC.</p>
     * 
     * <strong>example:</strong>
     * <p>BUY</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of statuses.</p>
     */
    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    /**
     * <p>The list of file extensions.</p>
     */
    @NameInMap("SuffixList")
    public java.util.List<String> suffixList;

    /**
     * <p>The list of file types.</p>
     */
    @NameInMap("TypeList")
    public java.util.List<String> typeList;

    public static QueryMaterialFileListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMaterialFileListRequest self = new QueryMaterialFileListRequest();
        return TeaModel.build(map, self);
    }

    public QueryMaterialFileListRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryMaterialFileListRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public QueryMaterialFileListRequest setMaxFileSize(Long maxFileSize) {
        this.maxFileSize = maxFileSize;
        return this;
    }
    public Long getMaxFileSize() {
        return this.maxFileSize;
    }

    public QueryMaterialFileListRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryMaterialFileListRequest setMinFileSize(Long minFileSize) {
        this.minFileSize = minFileSize;
        return this;
    }
    public Long getMinFileSize() {
        return this.minFileSize;
    }

    public QueryMaterialFileListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryMaterialFileListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryMaterialFileListRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public QueryMaterialFileListRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public QueryMaterialFileListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryMaterialFileListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMaterialFileListRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public QueryMaterialFileListRequest setSuffixList(java.util.List<String> suffixList) {
        this.suffixList = suffixList;
        return this;
    }
    public java.util.List<String> getSuffixList() {
        return this.suffixList;
    }

    public QueryMaterialFileListRequest setTypeList(java.util.List<String> typeList) {
        this.typeList = typeList;
        return this;
    }
    public java.util.List<String> getTypeList() {
        return this.typeList;
    }

}
