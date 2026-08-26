// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AddPolarOSSAuthorizedAccountRequest extends TeaModel {
    /**
     * <p>The list of authorized accounts to add, separated by commas. You can pass in UIDs and RAM role ARNs in mixed parameter notation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890,acs:ram::123456:role/myrole</p>
     */
    @NameInMap("AuthorizedUserIds")
    public String authorizedUserIds;

    /**
     * <p>The ID of the PolarDB cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-xxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The cold storage instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-xxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("PfsInstanceId")
    public String pfsInstanceId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AddPolarOSSAuthorizedAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPolarOSSAuthorizedAccountRequest self = new AddPolarOSSAuthorizedAccountRequest();
        return TeaModel.build(map, self);
    }

    public AddPolarOSSAuthorizedAccountRequest setAuthorizedUserIds(String authorizedUserIds) {
        this.authorizedUserIds = authorizedUserIds;
        return this;
    }
    public String getAuthorizedUserIds() {
        return this.authorizedUserIds;
    }

    public AddPolarOSSAuthorizedAccountRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public AddPolarOSSAuthorizedAccountRequest setPfsInstanceId(String pfsInstanceId) {
        this.pfsInstanceId = pfsInstanceId;
        return this;
    }
    public String getPfsInstanceId() {
        return this.pfsInstanceId;
    }

    public AddPolarOSSAuthorizedAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
