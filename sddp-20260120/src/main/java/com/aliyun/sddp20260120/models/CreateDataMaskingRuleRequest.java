// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class CreateDataMaskingRuleRequest extends TeaModel {
    /**
     * <p>The name of the column encryption algorithm. The availability of AES_128_GCM, AES_256_GCM, and SM4_128_GCM depends on the instance. Select an available algorithm from ListDataMaskingEncryptionAlgorithms.</p>
     * 
     * <strong>example:</strong>
     * <p>AES_256_GCM</p>
     */
    @NameInMap("EncAlgorithm")
    public String encAlgorithm;

    /**
     * <p>The KMS key identifier. You can obtain it from Items[].KeyId in the response of ListKmsKeys. Provide this parameter when you use a KMS key. Do not pass this parameter in local key scenarios.</p>
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
     * <li>kms_key: KMS key.
     * If you use kms_key, you must specify EncryptionKeyId.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>client_key</p>
     */
    @NameInMap("EncryptionKeyMode")
    public String encryptionKeyMode;

    /**
     * <p>The database engine type. The value must be consistent with the EngineType of the target instance, such as MySQL or PostgreSQL.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The expiration time of the plaintext access permissions. The value is a UNIX timestamp in milliseconds since 00:00:00 UTC on January 1, 1970. Specify this parameter only when ExpireTimeOperation is set to SET. The value must be later than the current time and no greater than 2145953410000. The server saves the value with second precision. Do not pass this parameter when ExpireTimeOperation is set to PRESERVE or CLEAR.</p>
     * 
     * <strong>example:</strong>
     * <p>2145953410000</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>The processing method for the permission expiration time. Valid values:</p>
     * <ul>
     * <li>PRESERVE: retains the original expiration time.</li>
     * <li>CLEAR: clears the expiration time.</li>
     * <li>SET: sets ExpireTime.
     * Default value: PRESERVE. Only fullAccess supports setting a validity period.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRESERVE</p>
     */
    @NameInMap("ExpireTimeOperation")
    public String expireTimeOperation;

    /**
     * <p>The database instance identity. You can obtain it from Items[].InstanceId in the response of ListDataMaskingInstances.</p>
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
     * <p>The cloud service code. Column encryption supports RDS, POLARDB, and PolarDBX2. If you pass ProductId at the same time, the two values must match.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The cloud service type identifier. Valid values:</p>
     * <ul>
     * <li>5: RDS.</li>
     * <li>8: POLARDB.</li>
     * <li>27: PolarDBX2.
     * If you specify this parameter together with ProductCode, the values must match.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The identifier of the associated risk handling record. You do not need to specify this parameter in the standard column encryption creation process.</p>
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
     * <p>The list of database accounts to which the fullAccess plaintext access permissions are granted. The accounts must belong to the target instance.</p>
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
         * <p>The name of the database account. Obtain the value from Items[].AccountName in the target instance record returned by ListDataAssetAccounts and pass it as a string as is. Do not pass Items[].Id. When you create a rule, the account belongs to the instance specified by the top-level InstanceId.</p>
         * 
         * <strong>example:</strong>
         * <p>app_reader</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The authentication database for MongoDB accounts. This parameter is required when you select a MongoDB account. You do not need to pass this parameter for other services.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("AuthDb")
        public String authDb;

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

        public CreateDataMaskingRuleRequestUserList setAuthDb(String authDb) {
            this.authDb = authDb;
            return this;
        }
        public String getAuthDb() {
            return this.authDb;
        }

    }

}
