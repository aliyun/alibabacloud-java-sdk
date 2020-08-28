// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteDhcpOptionsSetRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DhcpOptionsSetId")
    @Validation(required = true)
    public String dhcpOptionsSetId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    public static DeleteDhcpOptionsSetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDhcpOptionsSetRequest self = new DeleteDhcpOptionsSetRequest();
        return TeaModel.build(map, self);
    }

}
