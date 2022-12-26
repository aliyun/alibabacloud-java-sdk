// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyCountRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("UuidList")
    public String uuidList;

    public static DescribePropertyCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyCountRequest self = new DescribePropertyCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertyCountRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribePropertyCountRequest setUuidList(String uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public String getUuidList() {
        return this.uuidList;
    }

}
