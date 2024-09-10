// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetsScaProcessNumRequest extends TeaModel {
    /**
     * <p>The UUIDs of the servers.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static DescribeAssetsScaProcessNumRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetsScaProcessNumRequest self = new DescribeAssetsScaProcessNumRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAssetsScaProcessNumRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
