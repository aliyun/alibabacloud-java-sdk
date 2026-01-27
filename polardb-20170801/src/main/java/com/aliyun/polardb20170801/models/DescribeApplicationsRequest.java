// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationIds")
    public String applicationIds;

    @NameInMap("ApplicationTypes")
    public String applicationTypes;

    /**
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationsRequest self = new DescribeApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationsRequest setApplicationIds(String applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public String getApplicationIds() {
        return this.applicationIds;
    }

    public DescribeApplicationsRequest setApplicationTypes(String applicationTypes) {
        this.applicationTypes = applicationTypes;
        return this;
    }
    public String getApplicationTypes() {
        return this.applicationTypes;
    }

    public DescribeApplicationsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeApplicationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApplicationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApplicationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
