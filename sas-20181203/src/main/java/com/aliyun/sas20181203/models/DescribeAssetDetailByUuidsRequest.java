// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetDetailByUuidsRequest extends TeaModel {
    @NameInMap("Uuids")
    public String uuids;

    public static DescribeAssetDetailByUuidsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetDetailByUuidsRequest self = new DescribeAssetDetailByUuidsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAssetDetailByUuidsRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
