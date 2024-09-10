// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomizedDictUploadInfoRequest extends TeaModel {
    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>106.11.43.***</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeCustomizedDictUploadInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizedDictUploadInfoRequest self = new DescribeCustomizedDictUploadInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizedDictUploadInfoRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
