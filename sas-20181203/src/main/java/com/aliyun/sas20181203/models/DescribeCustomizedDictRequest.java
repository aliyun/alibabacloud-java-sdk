// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomizedDictRequest extends TeaModel {
    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>58.240.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeCustomizedDictRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizedDictRequest self = new DescribeCustomizedDictRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizedDictRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
