// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClustersRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DBClusterIds")
    public String DBClusterIds;

    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    @NameInMap("DBClusterStatus")
    public String DBClusterStatus;

    @NameInMap("DBType")
    public String DBType;

    @NameInMap("Tag")
    public java.util.List<DescribeDBClustersRequestTag> tag;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeDBClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClustersRequest self = new DescribeDBClustersRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBClustersRequestTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeDBClustersRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersRequestTag self = new DescribeDBClustersRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
