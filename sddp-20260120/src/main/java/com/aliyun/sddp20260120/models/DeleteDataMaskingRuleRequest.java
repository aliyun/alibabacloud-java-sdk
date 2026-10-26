// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class DeleteDataMaskingRuleRequest extends TeaModel {
    /**
     * <p>The database engine type. The value must be the same as the EngineType of the target instance, such as MySQL or PostgreSQL.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The database instance identifier. You can obtain this value from the Items[].InstanceId field in the response of the ListDataMaskingInstances operation.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1abcdefgh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the response message. Valid values: zh: Chinese. en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The cloud service code. Column encryption supports RDS, POLARDB, and PolarDBX2. If ProductId is also specified, the two parameters must match.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The cloud service type identifier. Valid values: 5: RDS. 8: POLARDB. 27: PolarDBX2. If this parameter is specified together with ProductCode, the values must match.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The list of column encryption targets grouped by database and table.</p>
     */
    @NameInMap("SubRuleList")
    public java.util.List<DeleteDataMaskingRuleRequestSubRuleList> subRuleList;

    public static DeleteDataMaskingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataMaskingRuleRequest self = new DeleteDataMaskingRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataMaskingRuleRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public DeleteDataMaskingRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDataMaskingRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteDataMaskingRuleRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DeleteDataMaskingRuleRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public DeleteDataMaskingRuleRequest setSubRuleList(java.util.List<DeleteDataMaskingRuleRequestSubRuleList> subRuleList) {
        this.subRuleList = subRuleList;
        return this;
    }
    public java.util.List<DeleteDataMaskingRuleRequestSubRuleList> getSubRuleList() {
        return this.subRuleList;
    }

    public static class DeleteDataMaskingRuleRequestSubRuleList extends TeaModel {
        /**
         * <p>The list of target column names. Separate multiple column names with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>phone,email</p>
         */
        @NameInMap("Columns")
        public String columns;

        /**
         * <p>The name of the target database.</p>
         * 
         * <strong>example:</strong>
         * <p>business_db</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The name of the target table.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static DeleteDataMaskingRuleRequestSubRuleList build(java.util.Map<String, ?> map) throws Exception {
            DeleteDataMaskingRuleRequestSubRuleList self = new DeleteDataMaskingRuleRequestSubRuleList();
            return TeaModel.build(map, self);
        }

        public DeleteDataMaskingRuleRequestSubRuleList setColumns(String columns) {
            this.columns = columns;
            return this;
        }
        public String getColumns() {
            return this.columns;
        }

        public DeleteDataMaskingRuleRequestSubRuleList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DeleteDataMaskingRuleRequestSubRuleList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
