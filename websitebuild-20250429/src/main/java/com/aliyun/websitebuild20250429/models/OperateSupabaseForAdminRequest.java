// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class OperateSupabaseForAdminRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250801154628000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>select * from profiles</p>
     */
    @NameInMap("ExecuteSql")
    public String executeSql;

    /**
     * <strong>example:</strong>
     * <p>vul_fix</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("OrderByClause")
    public String orderByClause;

    /**
     * <strong>example:</strong>
     * <p>CreationTime</p>
     */
    @NameInMap("OrderColumn")
    public String orderColumn;

    /**
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>default.ai_advertising_material_rec_train_v1103</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("WhereClause")
    public String whereClause;

    public static OperateSupabaseForAdminRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateSupabaseForAdminRequest self = new OperateSupabaseForAdminRequest();
        return TeaModel.build(map, self);
    }

    public OperateSupabaseForAdminRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public OperateSupabaseForAdminRequest setExecuteSql(String executeSql) {
        this.executeSql = executeSql;
        return this;
    }
    public String getExecuteSql() {
        return this.executeSql;
    }

    public OperateSupabaseForAdminRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public OperateSupabaseForAdminRequest setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
        return this;
    }
    public String getOrderByClause() {
        return this.orderByClause;
    }

    public OperateSupabaseForAdminRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public OperateSupabaseForAdminRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public OperateSupabaseForAdminRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public OperateSupabaseForAdminRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public OperateSupabaseForAdminRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public OperateSupabaseForAdminRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public OperateSupabaseForAdminRequest setWhereClause(String whereClause) {
        this.whereClause = whereClause;
        return this;
    }
    public String getWhereClause() {
        return this.whereClause;
    }

}
