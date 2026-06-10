// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryMaterialFileSummaryInfoShrinkRequest extends TeaModel {
    /**
     * <p>Business instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250801152639000005</p>
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
     * <p>File name</p>
     * 
     * <strong>example:</strong>
     * <p>文件名</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Sorting field</p>
     * 
     * <strong>example:</strong>
     * <p>CreationTime</p>
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
     * <p>Page number. Default is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>Page size. Default is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>File status</p>
     */
    @NameInMap("StatusList")
    public String statusListShrink;

    /**
     * <p>File type</p>
     */
    @NameInMap("TypeList")
    public String typeListShrink;

    public static QueryMaterialFileSummaryInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMaterialFileSummaryInfoShrinkRequest self = new QueryMaterialFileSummaryInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryMaterialFileSummaryInfoShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryMaterialFileSummaryInfoShrinkRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public QueryMaterialFileSummaryInfoShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryMaterialFileSummaryInfoShrinkRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public QueryMaterialFileSummaryInfoShrinkRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public QueryMaterialFileSummaryInfoShrinkRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryMaterialFileSummaryInfoShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMaterialFileSummaryInfoShrinkRequest setStatusListShrink(String statusListShrink) {
        this.statusListShrink = statusListShrink;
        return this;
    }
    public String getStatusListShrink() {
        return this.statusListShrink;
    }

    public QueryMaterialFileSummaryInfoShrinkRequest setTypeListShrink(String typeListShrink) {
        this.typeListShrink = typeListShrink;
        return this;
    }
    public String getTypeListShrink() {
        return this.typeListShrink;
    }

}
