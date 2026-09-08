// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class DeleteDataMaskingRuleRequest extends TeaModel {
    @NameInMap("EngineType")
    public String engineType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductId")
    public Long productId;

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
        @NameInMap("Columns")
        public String columns;

        @NameInMap("DbName")
        public String dbName;

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
