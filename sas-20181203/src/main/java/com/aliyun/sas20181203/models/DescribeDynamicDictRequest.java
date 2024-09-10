// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDynamicDictRequest extends TeaModel {
    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>101.204.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeDynamicDictRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDynamicDictRequest self = new DescribeDynamicDictRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDynamicDictRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
