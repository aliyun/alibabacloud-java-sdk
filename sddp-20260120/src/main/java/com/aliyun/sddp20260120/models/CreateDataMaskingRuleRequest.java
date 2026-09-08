// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class CreateDataMaskingRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AES_256_GCM</p>
     */
    @NameInMap("EncAlgorithm")
    public String encAlgorithm;

    /**
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-12345678****</p>
     */
    @NameInMap("EncryptionKeyId")
    public String encryptionKeyId;

    /**
     * <strong>example:</strong>
     * <p>client_key</p>
     */
    @NameInMap("EncryptionKeyMode")
    public String encryptionKeyMode;

    /**
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <strong>example:</strong>
     * <p>2145953410000</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <strong>example:</strong>
     * <p>PRESERVE</p>
     */
    @NameInMap("ExpireTimeOperation")
    public String expireTimeOperation;

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
     * <p>1001</p>
     */
    @NameInMap("RiskHandleId")
    public Long riskHandleId;

    @NameInMap("SubRuleList")
    public java.util.List<CreateDataMaskingRuleRequestSubRuleList> subRuleList;

    @NameInMap("UserList")
    public java.util.List<CreateDataMaskingRuleRequestUserList> userList;

    public static CreateDataMaskingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataMaskingRuleRequest self = new CreateDataMaskingRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataMaskingRuleRequest setEncAlgorithm(String encAlgorithm) {
        this.encAlgorithm = encAlgorithm;
        return this;
    }
    public String getEncAlgorithm() {
        return this.encAlgorithm;
    }

    public CreateDataMaskingRuleRequest setEncryptionKeyId(String encryptionKeyId) {
        this.encryptionKeyId = encryptionKeyId;
        return this;
    }
    public String getEncryptionKeyId() {
        return this.encryptionKeyId;
    }

    public CreateDataMaskingRuleRequest setEncryptionKeyMode(String encryptionKeyMode) {
        this.encryptionKeyMode = encryptionKeyMode;
        return this;
    }
    public String getEncryptionKeyMode() {
        return this.encryptionKeyMode;
    }

    public CreateDataMaskingRuleRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public CreateDataMaskingRuleRequest setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public CreateDataMaskingRuleRequest setExpireTimeOperation(String expireTimeOperation) {
        this.expireTimeOperation = expireTimeOperation;
        return this;
    }
    public String getExpireTimeOperation() {
        return this.expireTimeOperation;
    }

    public CreateDataMaskingRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDataMaskingRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateDataMaskingRuleRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateDataMaskingRuleRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public CreateDataMaskingRuleRequest setRiskHandleId(Long riskHandleId) {
        this.riskHandleId = riskHandleId;
        return this;
    }
    public Long getRiskHandleId() {
        return this.riskHandleId;
    }

    public CreateDataMaskingRuleRequest setSubRuleList(java.util.List<CreateDataMaskingRuleRequestSubRuleList> subRuleList) {
        this.subRuleList = subRuleList;
        return this;
    }
    public java.util.List<CreateDataMaskingRuleRequestSubRuleList> getSubRuleList() {
        return this.subRuleList;
    }

    public CreateDataMaskingRuleRequest setUserList(java.util.List<CreateDataMaskingRuleRequestUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<CreateDataMaskingRuleRequestUserList> getUserList() {
        return this.userList;
    }

    public static class CreateDataMaskingRuleRequestSubRuleList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>phone,email</p>
         */
        @NameInMap("Columns")
        public String columns;

        /**
         * <strong>example:</strong>
         * <p>business_db</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static CreateDataMaskingRuleRequestSubRuleList build(java.util.Map<String, ?> map) throws Exception {
            CreateDataMaskingRuleRequestSubRuleList self = new CreateDataMaskingRuleRequestSubRuleList();
            return TeaModel.build(map, self);
        }

        public CreateDataMaskingRuleRequestSubRuleList setColumns(String columns) {
            this.columns = columns;
            return this;
        }
        public String getColumns() {
            return this.columns;
        }

        public CreateDataMaskingRuleRequestSubRuleList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public CreateDataMaskingRuleRequestSubRuleList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class CreateDataMaskingRuleRequestUserList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        public static CreateDataMaskingRuleRequestUserList build(java.util.Map<String, ?> map) throws Exception {
            CreateDataMaskingRuleRequestUserList self = new CreateDataMaskingRuleRequestUserList();
            return TeaModel.build(map, self);
        }

        public CreateDataMaskingRuleRequestUserList setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
