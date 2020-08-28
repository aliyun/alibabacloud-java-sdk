// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteBgpNetworkRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DstCidrBlock")
    @Validation(required = true)
    public String dstCidrBlock;

    @NameInMap("RouterId")
    @Validation(required = true)
    public String routerId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DeleteBgpNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBgpNetworkRequest self = new DeleteBgpNetworkRequest();
        return TeaModel.build(map, self);
    }

}
