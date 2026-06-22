// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUserSettingRequest extends TeaModel {
    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>112.94.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeUserSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserSettingRequest self = new DescribeUserSettingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserSettingRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
