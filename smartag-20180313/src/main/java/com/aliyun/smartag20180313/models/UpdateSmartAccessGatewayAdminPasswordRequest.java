// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayAdminPasswordRequest extends TeaModel {
    /**
     * <p>Specifies whether to query only the SAG instances that belong to another Alibaba Cloud account. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default)</li>
     * <li><strong>true</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CrossAccount")
    public Boolean crossAccount;

    /**
     * <p>The new password used to log on to the SAG device.</p>
     * <p>The password must be 8 to 30 characters in length and can contain letters, digits, and underscores (_).</p>
     * <blockquote>
     * <p>In the example, asterisks (\<em>) are used to conceal the real password. This does not mean that the password supports asterisks (\</em>). The actual format requirement prevails.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The region ID of the SAG instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the SAG instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>147304382796****</p>
     */
    @NameInMap("ResourceUid")
    public String resourceUid;

    /**
     * <p>The ID of the Smart Access Gateway (SAG) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-sv487b7lno6go5****</p>
     */
    @NameInMap("SagInsId")
    public String sagInsId;

    /**
     * <p>The serial number of the SAG device.</p>
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
