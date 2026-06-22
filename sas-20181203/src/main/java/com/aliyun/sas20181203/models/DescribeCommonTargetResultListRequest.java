// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonTargetResultListRequest extends TeaModel {
    /**
     * <p>The IP address of the access source to query.</p>
     * 
     * <strong>example:</strong>
     * <p>113.57.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The configuration rule type. Valid values:</p>
     * <ul>
     * <li><strong>webshell_timescan</strong>: web shell scan.</li>
     * <li><strong>aliscriptengine</strong>: deep detection engine.</li>
     * <li><strong>alidetect</strong>: installation scope of the local file detection engine.</li>
     * <li><strong>alidetect-scan-enable</strong>: detection scope of the local file detection engine.</li>
     * </ul>
     * <blockquote>
     * <p>You can call <a href="~~ListClientUserDefineRules~~">ListClientUserDefineRules</a> and <a href="~~ListSystemClientRules~~">ListSystemClientRules</a> to obtain more custom and system-configured rule types.</p>
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
