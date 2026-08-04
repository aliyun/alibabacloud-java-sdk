// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarFsQuotaListRequest extends TeaModel {
    /**
     * <p>The instance ID of the PolarDB instance on which the application depends.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 30, 50, and 100.</p>
     * <p>Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The PolarFs instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-2ze0i74ka607*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    /**
     * <p>The query mode. Valid values:</p>
     * <ul>
     * <li><strong>quotaPolicy</strong>: quota rule</li>
     * <li><strong>quota</strong>: quota</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>quotaPolicy</p>
     */
    @NameInMap("QuotaMode")
    public String quotaMode;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribePolarFsQuotaListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarFsQuotaListRequest self = new DescribePolarFsQuotaListRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolarFsQuotaListRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribePolarFsQuotaListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePolarFsQuotaListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePolarFsQuotaListRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public DescribePolarFsQuotaListRequest setQuotaMode(String quotaMode) {
        this.quotaMode = quotaMode;
        return this;
    }
    public String getQuotaMode() {
        return this.quotaMode;
    }

    public DescribePolarFsQuotaListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
