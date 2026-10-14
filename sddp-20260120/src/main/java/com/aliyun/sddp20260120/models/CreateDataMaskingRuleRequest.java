// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class CreateDataMaskingRuleRequest extends TeaModel {
    /**
     * <p>The name of the column encryption algorithm. The availability of AES_128_GCM, AES_256_GCM, and SM4_128_GCM depends on the instance. Select an available algorithm from <a href="https://help.aliyun.com/document_detail/2859327.html">ListDataMaskingEncryptionAlgorithms</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>AES_256_GCM</p>
     */
    @NameInMap("EncAlgorithm")
    public String encAlgorithm;

    /**
     * <p>The KMS key ID. You can obtain this value from Items[].KeyId in the response of <a href="https://help.aliyun.com/document_detail/2859328.html">ListKmsKeys</a>. Specify this parameter when you use a KMS key. Do not specify this parameter for local key scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-12345678****</p>
     */
    @NameInMap("EncryptionKeyId")
    public String encryptionKeyId;

    /**
     * <p>The key mode. Valid values:</p>
     * <ul>
     * <li>client_key: local key.</li>
     * <li>kms_key: KMS key. If you set this parameter to kms_key, you must specify EncryptionKeyId.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>client_key</p>
     */
    @NameInMap("EncryptionKeyMode")
    public String encryptionKeyMode;

    /**
     * <p>The database engine type. This value must match the EngineType of the target instance, such as MySQL or PostgreSQL.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The expiration time of the plaintext access permissions. This value is a UNIX timestamp in milliseconds since 1970-01-01 00:00:00 UTC. Specify this parameter only when ExpireTimeOperation is set to SET. The value must be later than the current time and no greater than 2145953410000. The server stores the value with second-level precision. Do not specify this parameter when ExpireTimeOperation is set to PRESERVE or CLEAR.</p>
     * 
     * <strong>example:</strong>
     * <p>2145953410000</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>The handling method for the permission expiration time. Valid values:</p>
     * <ul>
     * <li>PRESERVE: Retains the original expiration time.</li>
     * <li>CLEAR: Clears the expiration time.</li>
     * <li>SET: Sets the expiration time to the value specified by ExpireTime.</li>
     * </ul>
     * <p>Default value: PRESERVE. Only fullAccess supports expiration time settings.</p>
     * 
     * <strong>example:</strong>
     * <p>PRESERVE</p>
     */
    @NameInMap("ExpireTimeOperation")
    public String expireTimeOperation;

    /**
     * <p>The database instance identity. You can obtain this value from Items[].InstanceId in the response of <a href="https://help.aliyun.com/document_detail/2859326.html">ListDataMaskingInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1abcdefgh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the response description. Valid values:</p>
     * <ul>
     * <li>zh: Chinese.</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The cloud product code. Column encryption supports RDS, POLARDB, and PolarDBX2. If you specify both ProductCode and ProductId, the values must correspond to each other.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The cloud product type ID. Valid values:</p>
     * <ul>
     * <li>5: RDS.</li>
     * <li>8: POLARDB.</li>
     * <li>27: PolarDBX2.</li>
     * </ul>
     * <p>If you specify both ProductId and ProductCode, the values must correspond to each other.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The ID of the associated risk handling record. You do not need to specify this parameter for standard column encryption creation.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("RiskHandleId")
    public Long riskHandleId;

    /**
     * <p>The list of column encryption targets grouped by database and table.</p>
     */
    @NameInMap("SubRuleList")
    public java.util.List<CreateDataMaskingRuleRequestSubRuleList> subRuleList;

    /**
     * <p>The list of database accounts to be granted fullAccess plaintext access permissions. The accounts must belong to the target instance.</p>
     */
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
         * <p>The database account ID. You can obtain this value from Items[].Id in the response of <a href="https://help.aliyun.com/document_detail/2859330.html">ListDataAssetAccounts</a>. Pass this value as a string.</p>
         * 
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
