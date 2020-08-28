// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteExpressCloudConnectionRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("EccId")
    @Validation(required = true)
    public String eccId;

    public static DeleteExpressCloudConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpressCloudConnectionRequest self = new DeleteExpressCloudConnectionRequest();
        return TeaModel.build(map, self);
    }

}
