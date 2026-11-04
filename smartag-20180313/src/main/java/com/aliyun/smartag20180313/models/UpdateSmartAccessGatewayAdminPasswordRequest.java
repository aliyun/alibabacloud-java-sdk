// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayAdminPasswordRequest extends TeaModel {
    /**
     * <p>Specifies whether to query only Smart Access Gateway instances that belong to other Alibaba Cloud accounts. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): no.</p>
     * </li>
     * <li><p><strong>true</strong>: yes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CrossAccount")
    public Boolean crossAccount;

    /**
     * <p>The new logon password for the Smart Access Gateway device.</p>
     * <p>Password format requirements: The password must be 8 to 30 characters in length and can contain uppercase letters, lowercase letters, digits, and underscores (_).</p>
     * <blockquote>
     * <p>Asterisks (*) are used in the sample value to mask the actual password. This does not mean that asterisks are supported in passwords. Specify the password based on the format requirements.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The ID of the region where the Smart Access Gateway instance resides.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the Smart Access Gateway instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>147304382796****</p>
     */
    @NameInMap("ResourceUid")
    public String resourceUid;

    /**
     * <p>The Smart Access Gateway instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-sv487b7lno6go5****</p>
     */
    @NameInMap("SagInsId")
    public String sagInsId;

    /**
     * <p>The serial number of the Smart Access Gateway device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sagf4ea****</p>
     */
    @NameInMap("SagSn")
    public String sagSn;

    public static UpdateSmartAccessGatewayAdminPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAccessGatewayAdminPasswordRequest self = new UpdateSmartAccessGatewayAdminPasswordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAccessGatewayAdminPasswordRequest setCrossAccount(Boolean crossAccount) {
        this.crossAccount = crossAccount;
        return this;
    }
    public Boolean getCrossAccount() {
        return this.crossAccount;
    }

    public UpdateSmartAccessGatewayAdminPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateSmartAccessGatewayAdminPasswordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSmartAccessGatewayAdminPasswordRequest setResourceUid(String resourceUid) {
        this.resourceUid = resourceUid;
        return this;
    }
    public String getResourceUid() {
        return this.resourceUid;
    }

    public UpdateSmartAccessGatewayAdminPasswordRequest setSagInsId(String sagInsId) {
        this.sagInsId = sagInsId;
        return this;
    }
    public String getSagInsId() {
        return this.sagInsId;
    }

    public UpdateSmartAccessGatewayAdminPasswordRequest setSagSn(String sagSn) {
        this.sagSn = sagSn;
        return this;
    }
    public String getSagSn() {
        return this.sagSn;
    }

}
