// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryMaterialFileListRequest extends TeaModel {
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
    public java.util.List<String> statusList;

    /**
     * <p>File suffix list</p>
     */
    @NameInMap("SuffixList")
    public java.util.List<String> suffixList;

    /**
     * <p>List of file types</p>
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
