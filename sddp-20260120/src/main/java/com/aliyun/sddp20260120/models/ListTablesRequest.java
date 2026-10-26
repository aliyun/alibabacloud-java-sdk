// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListTablesRequest extends TeaModel {
    /**
     * <p>The page number of the current page. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The instance identity of the cloud database instance. Set the value to the InstanceId value in the instance list.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1abcdefgh****</p>
     */
    @NameInMap("DataAssetSourceId")
    public String dataAssetSourceId;

    /**
     * <p>The name of the database. Set the value to the DbName value returned by the ListDataSources operation.</p>
     * 
     * <strong>example:</strong>
     * <p>business_db</p>
     */
    @NameInMap("DataSourceName")
    public String dataSourceName;

    /**
     * <p>The language of the response. Valid values: zh: Chinese. en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The start position of the cursor-based pagination. Use the NextMarker value returned in the previous request for subsequent requests. Keep the value consistent with the original filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Marker")
    public Long marker;

    /**
     * <p>The name filter.</p>
     * 
     * <strong>example:</strong>
     * <p>customer</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries to return on each page. Keep other filter conditions consistent when you query the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The code of the cloud service. Column encryption supports ApsaraDB RDS, PolarDB, and PolarDB-X 2.0. If you specify this parameter and ProductId at the same time, the values must match.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the cloud service type. Valid values: 5: ApsaraDB RDS. 8: PolarDB. 27: PolarDB-X 2.0. If you specify this parameter and ProductCode at the same time, the values must match.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The ID of the sensitivity level. You can obtain the ID from the response of the ListRiskLevels operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskLevelId")
    public Long riskLevelId;

    /**
     * <p>The ID of the detection rule or model. Set the value to the ID of the corresponding detection rule in the target template.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The ID of the data classification template. You can obtain the ID from the Items[].Id parameter in the response of the ListTemplates operation. The value must be consistent with the selected sensitivity level and detection model.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static ListTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTablesRequest self = new ListTablesRequest();
        return TeaModel.build(map, self);
    }

    public ListTablesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListTablesRequest setDataAssetSourceId(String dataAssetSourceId) {
        this.dataAssetSourceId = dataAssetSourceId;
        return this;
    }
    public String getDataAssetSourceId() {
        return this.dataAssetSourceId;
    }

    public ListTablesRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public ListTablesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListTablesRequest setMarker(Long marker) {
        this.marker = marker;
        return this;
    }
    public Long getMarker() {
        return this.marker;
    }

    public ListTablesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListTablesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTablesRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListTablesRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public ListTablesRequest setRiskLevelId(Long riskLevelId) {
        this.riskLevelId = riskLevelId;
        return this;
    }
    public Long getRiskLevelId() {
        return this.riskLevelId;
    }

    public ListTablesRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ListTablesRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
