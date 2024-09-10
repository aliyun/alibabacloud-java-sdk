// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonTargetResultListRequest extends TeaModel {
    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>113.57.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the configuration item. Valid values:</p>
     * <ul>
     * <li><strong>webshell_timescan</strong>: webshell detection and removal</li>
     * <li><strong>aliscriptengine</strong>: in-depth detection engine</li>
     * <li><strong>alidetect</strong>: installation scope of local file detection</li>
     * <li><strong>alidetect-scan-enable</strong>: detection scope of local file detection</li>
     * </ul>
     * <blockquote>
     * <p> You can call the <a href="~~ListClientUserDefineRules~~">ListClientUserDefineRules</a> and <a href="~~ListSystemClientRules~~">ListSystemClientRules</a> operations to obtain more types of custom and system configuration items.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>webshell_timescan</p>
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
