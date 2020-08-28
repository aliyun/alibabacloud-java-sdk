// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRenewalPriceRequest extends TeaModel {
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

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    @NameInMap("UsedTime")
    @Validation(required = true)
    public Integer usedTime;

    @NameInMap("TimeType")
    @Validation(required = true)
    public String timeType;

    @NameInMap("Quantity")
    public Integer quantity;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("BusinessInfo")
    public String businessInfo;

    public static DescribeRenewalPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenewalPriceRequest self = new DescribeRenewalPriceRequest();
        return TeaModel.build(map, self);
    }

}
