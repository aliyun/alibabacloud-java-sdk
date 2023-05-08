// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeIpTagsRequest extends TeaModel {
    @NameInMap("Ip")
    public String ip;

    @NameInMap("SecurityEventId")
    public String securityEventId;

    public static DescribeIpTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpTagsRequest self = new DescribeIpTagsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpTagsRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeIpTagsRequest setSecurityEventId(String securityEventId) {
        this.securityEventId = securityEventId;
        return this;
    }
    public String getSecurityEventId() {
        return this.securityEventId;
    }

}
