// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVSwitchAttributesRequest extends TeaModel {
    @NameInMap("VSwitchId")
    @Validation(required = true)
    public String vSwitchId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    public static DescribeVSwitchAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchAttributesRequest self = new DescribeVSwitchAttributesRequest();
        return TeaModel.build(map, self);
    }

}
