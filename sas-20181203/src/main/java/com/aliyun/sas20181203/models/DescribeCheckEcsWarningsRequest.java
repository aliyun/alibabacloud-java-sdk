// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckEcsWarningsRequest extends TeaModel {
    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.3.4</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeCheckEcsWarningsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckEcsWarningsRequest self = new DescribeCheckEcsWarningsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCheckEcsWarningsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
