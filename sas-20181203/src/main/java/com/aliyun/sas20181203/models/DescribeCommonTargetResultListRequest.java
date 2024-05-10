// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonTargetResultListRequest extends TeaModel {
    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the configuration item. Valid values:</p>
     * <br>
     * <p>*   **webshell_timescan**: webshell detection and removal</p>
     * <p>*   **aliscriptengine**: in-depth detection engine</p>
     * <p>*   **alidetect**: installation scope of local file detection</p>
     * <p>*   **alidetect-scan-enable**: detection scope of local file detection</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
