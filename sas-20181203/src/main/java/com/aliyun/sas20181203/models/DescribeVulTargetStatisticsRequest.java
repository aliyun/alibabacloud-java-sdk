// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulTargetStatisticsRequest extends TeaModel {
    /**
     * <p>The type of the vulnerability. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: Linux software vulnerability</li>
     * <li><strong>sys</strong>: Windows system vulnerability</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability</li>
     * <li><strong>emg</strong>: urgent vulnerability</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cve</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeVulTargetStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulTargetStatisticsRequest self = new DescribeVulTargetStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVulTargetStatisticsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
