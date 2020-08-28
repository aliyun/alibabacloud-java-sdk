// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
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

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("EngineVersion")
    @Validation(required = true)
    public String engineVersion;

    @NameInMap("DBInstanceClass")
    @Validation(required = true)
    public String DBInstanceClass;

    @NameInMap("DBInstanceStorage")
    @Validation(required = true)
    public Integer DBInstanceStorage;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("UsedTime")
    public Integer usedTime;

    @NameInMap("TimeType")
    public String timeType;

    @NameInMap("Quantity")
    @Validation(required = true)
    public Integer quantity;

    @NameInMap("InstanceUsedType")
    public Integer instanceUsedType;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static DescribePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceRequest self = new DescribePriceRequest();
        return TeaModel.build(map, self);
    }

}
