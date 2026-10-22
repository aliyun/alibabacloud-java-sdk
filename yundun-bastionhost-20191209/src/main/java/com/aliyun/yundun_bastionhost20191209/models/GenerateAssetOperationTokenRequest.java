// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GenerateAssetOperationTokenRequest extends TeaModel {
    /**
     * <p>The ID of the asset account for which you want to apply for an O&amp;M token.</p>
     * <blockquote>
     * <p>You must specify at least one of AssetAccountId and AssetAccountName. If both are specified, AssetAccountId takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AssetAccountId")
    public String assetAccountId;

    /**
     * <p>The name of the host account. If the account is a custom account, specify the actual account name.</p>
     * <blockquote>
     * <p>If both AssetAccountId and AssetAccountName are specified, AssetAccountId takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("AssetAccountName")
    public String assetAccountName;

    /**
     * <p>The Base64-encoded password. This parameter is required when you apply for an O&amp;M token for a custom account.</p>
     * 
     * <strong>example:</strong>
     * <p>dGVzdHBhc3N3b3Jk</p>
     */
    @NameInMap("AssetAccountPassword")
    public String assetAccountPassword;

    /**
     * <p>The name of the protocol. Valid values:</p>
     * <ul>
     * <li><strong>SSH</strong></li>
     * <li><strong>RDP</strong></li>
     * <li><strong>Oracle</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * <li><strong>MySQL</strong></li>
     * <li><strong>SQLServer</strong></li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when you apply for an O&amp;M token for a custom account.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SSH</p>
     */
    @NameInMap("AssetAccountProtocolName")
    public String assetAccountProtocolName;

    /**
     * <p>The ID of the asset for which you want to apply for an O&amp;M token.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("AssetId")
    public String assetId;

    /**
     * <p>The Asset Type for which you want to apply for a token. Valid values:</p>
     * <ul>
     * <li><strong>Host</strong>: host</li>
     * <li><strong>Database</strong>: database</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Host</p>
     */
    @NameInMap("AssetType")
    public String assetType;

    /**
     * <p>The name of the database. This parameter is required when OperationMode is set to Sso, AssetAccountProtocolName is set to PostgreSQL or Oracle, and the account is a custom account.</p>
     * <blockquote>
     * <p>This parameter is supported only in Bastionhost V3.2.44 and later.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>orcl</p>
     */
    @NameInMap("DatabaseSchema")
    public String databaseSchema;

    /**
     * <p>The instance ID of the Bastionhost instance for which you want to apply for an O&amp;M token.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain the value of this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The logon attribute. This parameter is required when OperationMode is set to Sso and the account is a custom Oracle account. Valid values:</p>
     * <ul>
     * <li><strong>SERVICENAME</strong></li>
     * <li><strong>SID</strong><blockquote>
     * <p>This parameter is supported only in Bastionhost V3.2.44 and later.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SID</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("LoginAttribute")
    public String loginAttribute;

    /**
     * <p>The O&amp;M logon method. Valid values:</p>
     * <ul>
     * <li><strong>WebToken</strong>: obtain an O&amp;M token</li>
     * <li><strong>Sso</strong>: log on by using a local client<blockquote>
     * <p>This parameter is supported only in Bastionhost V3.2.44 and later. If this parameter is left empty, the default value WebToken is used.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Sso</p>
     */
    @NameInMap("OperationMode")
    public String operationMode;

    /**
     * <p>The logon note. This parameter is required when the administrator enables the logon note feature in the control policy.</p>
     * 
     * <strong>example:</strong>
     * <p>comment</p>
     */
    @NameInMap("OperationNote")
    public String operationNote;

    /**
     * <p>The region ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the local client to be opened for O&amp;M operations on Linux assets. This parameter is required when OperationMode is set to Sso and the asset protocol is SSH. Valid values:</p>
     * <ul>
     * <li><strong>ssh</strong>: open an SSH client to perform O&amp;M operations with SSH permissions</li>
     * <li><strong>sftp</strong>: open an SFTP client to perform O&amp;M operations with SFTP permissions<blockquote>
     * <p>This parameter is supported only in Bastionhost V3.2.44 and later.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ssh</p>
     */
    @NameInMap("SsoClient")
    public String ssoClient;

    public static GenerateAssetOperationTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAssetOperationTokenRequest self = new GenerateAssetOperationTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAssetOperationTokenRequest setAssetAccountId(String assetAccountId) {
        this.assetAccountId = assetAccountId;
        return this;
    }
    public String getAssetAccountId() {
        return this.assetAccountId;
    }

    public GenerateAssetOperationTokenRequest setAssetAccountName(String assetAccountName) {
        this.assetAccountName = assetAccountName;
        return this;
    }
    public String getAssetAccountName() {
        return this.assetAccountName;
    }

    public GenerateAssetOperationTokenRequest setAssetAccountPassword(String assetAccountPassword) {
        this.assetAccountPassword = assetAccountPassword;
        return this;
    }
    public String getAssetAccountPassword() {
        return this.assetAccountPassword;
    }

    public GenerateAssetOperationTokenRequest setAssetAccountProtocolName(String assetAccountProtocolName) {
        this.assetAccountProtocolName = assetAccountProtocolName;
        return this;
    }
    public String getAssetAccountProtocolName() {
        return this.assetAccountProtocolName;
    }

    public GenerateAssetOperationTokenRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public GenerateAssetOperationTokenRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public GenerateAssetOperationTokenRequest setDatabaseSchema(String databaseSchema) {
        this.databaseSchema = databaseSchema;
        return this;
    }
    public String getDatabaseSchema() {
        return this.databaseSchema;
    }

    public GenerateAssetOperationTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GenerateAssetOperationTokenRequest setLoginAttribute(String loginAttribute) {
        this.loginAttribute = loginAttribute;
        return this;
    }
    public String getLoginAttribute() {
        return this.loginAttribute;
    }

    public GenerateAssetOperationTokenRequest setOperationMode(String operationMode) {
        this.operationMode = operationMode;
        return this;
    }
    public String getOperationMode() {
        return this.operationMode;
    }

    public GenerateAssetOperationTokenRequest setOperationNote(String operationNote) {
        this.operationNote = operationNote;
        return this;
    }
    public String getOperationNote() {
        return this.operationNote;
    }

    public GenerateAssetOperationTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GenerateAssetOperationTokenRequest setSsoClient(String ssoClient) {
        this.ssoClient = ssoClient;
        return this;
    }
    public String getSsoClient() {
        return this.ssoClient;
    }

}
