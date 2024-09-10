// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeScanTaskStatisticsRequest extends TeaModel {
    /**
     * <p>The severities of the alert events handled by the virus detection task. Separate multiple severities with commas (,). The severities decrease in descending order. Valid values:</p>
     * <ul>
     * <li><strong>serious</strong></li>
     * <li><strong>suspicious</strong></li>
     * <li><strong>remind</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>serious,suspicious,remind</p>
     */
    @NameInMap("Levels")
    public String levels;

    public static DescribeScanTaskStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScanTaskStatisticsRequest self = new DescribeScanTaskStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScanTaskStatisticsRequest setLevels(String levels) {
        this.levels = levels;
        return this;
    }
    public String getLevels() {
        return this.levels;
    }

}
