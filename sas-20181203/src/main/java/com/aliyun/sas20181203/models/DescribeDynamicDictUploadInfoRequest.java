// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDynamicDictUploadInfoRequest extends TeaModel {
    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>123.103.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeDynamicDictUploadInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDynamicDictUploadInfoRequest self = new DescribeDynamicDictUploadInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDynamicDictUploadInfoRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
