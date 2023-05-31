// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulTargetStatisticsRequest extends TeaModel {
    /**
     * <p>The type of the vulnerability. Valid values:</p>
     * <br>
     * <p>*   **cve**: Linux software vulnerability</p>
     * <p>*   **sys**: Windows system vulnerability</p>
     * <p>*   **cms**: Web-CMS vulnerability</p>
     * <p>*   **emg**: urgent vulnerability</p>
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
