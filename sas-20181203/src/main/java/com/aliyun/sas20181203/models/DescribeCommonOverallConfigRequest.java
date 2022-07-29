// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonOverallConfigRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Type")
    public String type;

    public static DescribeCommonOverallConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonOverallConfigRequest self = new DescribeCommonOverallConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCommonOverallConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeCommonOverallConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
