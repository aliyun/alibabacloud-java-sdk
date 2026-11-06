// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyPolarFsInstanceDescriptionRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query all clusters in the specified region, including cluster IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The description of the PolarFS instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pcs-****************</p>
     */
    @NameInMap("PolarFsInstanceDescription")
    public String polarFsInstanceDescription;

    /**
     * <p>The PolarFS instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pcs-****************</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query all available regions for the current account, including region IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyPolarFsInstanceDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolarFsInstanceDescriptionRequest self = new ModifyPolarFsInstanceDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPolarFsInstanceDescriptionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyPolarFsInstanceDescriptionRequest setPolarFsInstanceDescription(String polarFsInstanceDescription) {
        this.polarFsInstanceDescription = polarFsInstanceDescription;
        return this;
    }
    public String getPolarFsInstanceDescription() {
        return this.polarFsInstanceDescription;
    }

    public ModifyPolarFsInstanceDescriptionRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public ModifyPolarFsInstanceDescriptionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
