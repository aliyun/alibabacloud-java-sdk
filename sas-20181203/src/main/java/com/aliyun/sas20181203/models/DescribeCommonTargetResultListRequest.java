// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonTargetResultListRequest extends TeaModel {
    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The type of the configuration item. Valid values:
    // 
    // *   **webshell_timescan**: webshell detection and removal
    // *   **aliscriptengine**: in-depth detection engine
    // *   **alidetect**: installation scope of local file detection
    // *   **alidetect-scan-enable**: detection scope of local file detection
    @NameInMap("Type")
    public String type;

    public static DescribeCommonTargetResultListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonTargetResultListRequest self = new DescribeCommonTargetResultListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCommonTargetResultListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeCommonTargetResultListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
