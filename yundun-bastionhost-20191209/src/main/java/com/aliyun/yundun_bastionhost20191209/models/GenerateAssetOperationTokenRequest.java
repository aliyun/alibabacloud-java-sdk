// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GenerateAssetOperationTokenRequest extends TeaModel {
    /**
     * <p>The ID of the asset account.</p>
     * <blockquote>
     * <p>You must specify at least one of <code>AssetAccountId</code> and <code>AssetAccountName</code>. If you specify both parameters, <code>AssetAccountId</code> is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AssetAccountId")
    public String assetAccountId;

    /**
     * <p>The name of the asset account. If this parameter specifies a custom account, you must enter the actual account name.</p>
     * <blockquote>
     * <p>If you specify both <code>AssetAccountId</code> and <code>AssetAccountName</code>, <code>AssetAccountId</code> is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("AssetAccountName")
    public String assetAccountName;

    /**
     * <p>The password that is encoded in Base64. This parameter is required if you want to generate an O\&amp;M token for a custom account.</p>
     * 
     * <strong>example:</strong>
     * <p>dGVzdHBhc3N3b3Jk</p>
     */
    @NameInMap("AssetAccountPassword")
    public String assetAccountPassword;

    /**
     * <p>The protocol that is used to connect to the asset. Valid values:</p>
     * <ul>
     * <li><p><strong>SSH</strong></p>
     * </li>
     * <li><p><strong>RDP</strong></p>
     * </li>
     * <li><p><strong>Oracle</strong></p>
     * </li>
     * <li><p><strong>PostgreSQL</strong></p>
     * </li>
     * <li><p><strong>MySQL</strong></p>
     * </li>
     * <li><p><strong>SQLServer</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required if you want to generate an O\&amp;M token for a custom account.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SSH</p>
     */
    @NameInMap("AssetAccountProtocolName")
    public String assetAccountProtocolName;

    /**
     * <p>The ID of the asset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("AssetId")
    public String assetId;

    /**
     * <p>The type of the asset for which you want to generate an O\&amp;M token. Valid values:</p>
     * <ul>
     * <li><p><strong>Host</strong></p>
     * </li>
     * <li><p><strong>Database</strong></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Host</p>
     */
    @NameInMap("AssetType")
    public String assetType;

    /**
     * <p>The name of the database. This parameter is required for a custom account if you set OperationMode to Sso and AssetAccountProtocolName to PostgreSQL or Oracle.</p>
     * <blockquote>
     * <p>This parameter is supported only by bastion hosts of V3.2.44 or later.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>orcl</p>
     */
    @NameInMap("DatabaseSchema")
    public String databaseSchema;

    /**
     * <p>The ID of the bastion host instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The logon attribute. This parameter is required if you set OperationMode to Sso and use a custom Oracle account. Valid values:</p>
     * <ul>
     * <li><p><strong>SERVICENAME</strong></p>
     * </li>
     * <li><p><strong>SID</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only by bastion hosts of V3.2.44 or later.</p>
     * </blockquote>
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
     * <p>The O\&amp;M mode. Valid values:</p>
     * <ul>
     * <li><p><strong>WebToken</strong>: generates an O\&amp;M token.</p>
     * </li>
     * <li><p><strong>Sso</strong>: logs on to the client.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only by bastion hosts of V3.2.44 or later. If you do not specify this parameter, WebToken is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Sso</p>
     */
    @NameInMap("OperationMode")
    public String operationMode;

    /**
     * <p>The remarks for the logon. This parameter is required if your administrator enables logon remarks in the control policy.</p>
     * 
     * <strong>example:</strong>
     * <p>comment</p>
     */
    @NameInMap("OperationNote")
    public String operationNote;

    /**
     * <p>The region ID of the bastion host instance.</p>
     * <blockquote>
     * <p>For more information about region IDs, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the client that you want to use for O\&amp;M on a Linux asset. This parameter is required if you set OperationMode to Sso and the asset protocol to SSH. Valid values:</p>
     * <ul>
     * <li><p><strong>ssh</strong>: opens a client that supports the SSH protocol to perform O\&amp;M with SSH permissions.</p>
     * </li>
     * <li><p><strong>sftp</strong>: opens a client that supports the SFTP protocol to perform O\&amp;M with SFTP permissions.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only by bastion hosts of V3.2.44 or later.</p>
     * </blockquote>
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
