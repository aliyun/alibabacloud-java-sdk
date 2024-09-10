// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDefaultKeyInfoRequest extends TeaModel {
    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>58.246.73.***</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeDefaultKeyInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefaultKeyInfoRequest self = new DescribeDefaultKeyInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDefaultKeyInfoRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
