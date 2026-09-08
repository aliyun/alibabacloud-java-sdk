// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListDataMaskingInstancesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>phone</p>
     */
    @NameInMap("ColumnName")
    public String columnName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>business_db</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <strong>example:</strong>
     * <p>rm-2ze1abcdefgh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>NotEncrypted</p>
     */
    @NameInMap("MaskingStatus")
    public String maskingStatus;

    /**
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("ModelTagId")
    public String modelTagId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductIds")
    public String productIds;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskLevelId")
    public Long riskLevelId;

    /**
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("RiskLevelIds")
    public String riskLevelIds;

    /**
     * <strong>example:</strong>
     * <p>customer</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <strong>example:</strong>
     * <p>1001,1002</p>
     */
    @NameInMap("TemplateRuleIds")
    public String templateRuleIds;

    public static ListDataMaskingInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataMaskingInstancesRequest self = new ListDataMaskingInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListDataMaskingInstancesRequest setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public ListDataMaskingInstancesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDataMaskingInstancesRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ListDataMaskingInstancesRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public ListDataMaskingInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDataMaskingInstancesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListDataMaskingInstancesRequest setMaskingStatus(String maskingStatus) {
        this.maskingStatus = maskingStatus;
        return this;
    }
    public String getMaskingStatus() {
        return this.maskingStatus;
    }

    public ListDataMaskingInstancesRequest setModelTagId(String modelTagId) {
        this.modelTagId = modelTagId;
        return this;
    }
    public String getModelTagId() {
        return this.modelTagId;
    }

    public ListDataMaskingInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataMaskingInstancesRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListDataMaskingInstancesRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public ListDataMaskingInstancesRequest setProductIds(String productIds) {
        this.productIds = productIds;
        return this;
    }
    public String getProductIds() {
        return this.productIds;
    }

    public ListDataMaskingInstancesRequest setRiskLevelId(Long riskLevelId) {
        this.riskLevelId = riskLevelId;
        return this;
    }
    public Long getRiskLevelId() {
        return this.riskLevelId;
    }

    public ListDataMaskingInstancesRequest setRiskLevelIds(String riskLevelIds) {
        this.riskLevelIds = riskLevelIds;
        return this;
    }
    public String getRiskLevelIds() {
        return this.riskLevelIds;
    }

    public ListDataMaskingInstancesRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ListDataMaskingInstancesRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public ListDataMaskingInstancesRequest setTemplateRuleIds(String templateRuleIds) {
        this.templateRuleIds = templateRuleIds;
        return this;
    }
    public String getTemplateRuleIds() {
        return this.templateRuleIds;
    }

}
