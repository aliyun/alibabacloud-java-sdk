// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeAppInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the RDS for PostgreSQL instance with which the RDS Supabase instances are associated. If you specify this parameter, the RDS Supabase instances associated with the specified RDS for PostgreSQL instance are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>supabase</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-2ze49qv594vi****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The number of records per page. Valid values: <strong>1 to 50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The application type. Only <strong>supabase</strong> is supported. For more information, see <a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The operation that you want to perform. Set the value to <strong>DescribeAppInstances</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAppInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppInstancesRequest self = new DescribeAppInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppInstancesRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public DescribeAppInstancesRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeAppInstancesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAppInstancesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAppInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
