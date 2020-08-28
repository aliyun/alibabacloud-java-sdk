// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClustersWithBackupsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DBClusterIds")
    public String DBClusterIds;

    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    @NameInMap("DBType")
    public String DBType;

    @NameInMap("IsDeleted")
    public Integer isDeleted;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("DBVersion")
    public String DBVersion;

    public static DescribeDBClustersWithBackupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClustersWithBackupsRequest self = new DescribeDBClustersWithBackupsRequest();
        return TeaModel.build(map, self);
    }

}
