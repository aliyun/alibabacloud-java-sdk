// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeNoticeConfigRequest extends TeaModel {
    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeNoticeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNoticeConfigRequest self = new DescribeNoticeConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNoticeConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
