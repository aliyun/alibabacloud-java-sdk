// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarFsQuotaRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>/data</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-2ze0i74ka607*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    /**
     * <strong>example:</strong>
     * <p>quotaPolicy</p>
     */
    @NameInMap("QuotaType")
    public String quotaType;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribePolarFsQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarFsQuotaRequest self = new DescribePolarFsQuotaRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolarFsQuotaRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribePolarFsQuotaRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DescribePolarFsQuotaRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public DescribePolarFsQuotaRequest setQuotaType(String quotaType) {
        this.quotaType = quotaType;
        return this;
    }
    public String getQuotaType() {
        return this.quotaType;
    }

    public DescribePolarFsQuotaRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
