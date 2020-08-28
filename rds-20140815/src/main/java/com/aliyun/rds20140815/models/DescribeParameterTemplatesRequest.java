// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeParameterTemplatesRequest extends TeaModel {
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

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("EngineVersion")
    @Validation(required = true)
    public String engineVersion;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("Category")
    public String category;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static DescribeParameterTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterTemplatesRequest self = new DescribeParameterTemplatesRequest();
        return TeaModel.build(map, self);
    }

}
