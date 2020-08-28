// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesByPerformanceRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("proxyId")
    public String proxyId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("SortMethod")
    public String sortMethod;

    @NameInMap("SortKey")
    public String sortKey;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("Tag")
    @Validation(required = true)
    public java.util.List<DescribeDBInstancesByPerformanceRequestTag> tag;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDBInstancesByPerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesByPerformanceRequest self = new DescribeDBInstancesByPerformanceRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBInstancesByPerformanceRequestTag extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static DescribeDBInstancesByPerformanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesByPerformanceRequestTag self = new DescribeDBInstancesByPerformanceRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
