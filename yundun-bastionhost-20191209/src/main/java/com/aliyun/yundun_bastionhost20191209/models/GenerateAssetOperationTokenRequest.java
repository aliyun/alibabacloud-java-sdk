// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GenerateAssetOperationTokenRequest extends TeaModel {
    /**
     * <p>The ID of the account whose assets the O\&amp;M token takes effect.</p>
     * <blockquote>
     * <p> You must specify at least one of the following parameters: AssetAccountId and AssetAccountName. If you specify both parameters, AssetAccountId takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AssetAccountId")
    public String assetAccountId;

    /**
     * <p>The name of the host account. If you use a custom account, enter a real account name.</p>
     * <blockquote>
     * <p> When both AssetAccountId and AssetAccountName are specified, AssetAccountId takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("AssetAccountName")
    public String assetAccountName;

    /**
     * <p>The Base64-encoded password. This parameter is required if you want to apply for an O\&amp;M token for a custom account.</p>
     * 
     * <strong>example:</strong>
     * <p>dGVzdHBhc3N3b3Jk</p>
     */
    @NameInMap("AssetAccountPassword")
    public String assetAccountPassword;

    /**
     * <p>The name of the protocol. Valid values:</p>
     * <ul>
     * <li>SSH</li>
     * <li>RDP</li>
     * <li>Oracle</li>
     * <li>PostgreSQL</li>
     * <li>MySQL</li>
     * <li>SQLServer</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SSH</p>
     */
    @NameInMap("AssetAccountProtocolName")
    public String assetAccountProtocolName;

    /**
     * <p>The ID of the asset for which you want to apply for an O\&amp;M token.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("AssetId")
    public String assetId;

    /**
     * <p>The type of the asset for which you want to apply for an O\&amp;M token. Valid values:</p>
     * <ul>
     * <li><strong>Host</strong></li>
     * <li><strong>Database</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Host</p>
     */
    @NameInMap("AssetType")
    public String assetType;

    @NameInMap("DatabaseSchema")
    public String databaseSchema;

    /**
     * <p>The ID of the bastion host for which you want to apply an O\&amp;M token.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LoginAttribute")
    public String loginAttribute;

    @NameInMap("OperationMode")
    public String operationMode;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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
