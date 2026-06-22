// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeScreenScoreThreadRequest extends TeaModel {
    /**
     * <p>The end time as a timestamp. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1668064495000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The source of the security score. If left empty, the default value is Security Center. Valid values:</p>
     * <p>0: Security Center.</p>
     * <p>1: Alibaba Cloud ApsaraDB console.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Source")
    public Integer source;

    /**
     * <p>The start time as a timestamp. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1651290987000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeScreenScoreThreadRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenScoreThreadRequest self = new DescribeScreenScoreThreadRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScreenScoreThreadRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeScreenScoreThreadRequest setSource(Integer source) {
        this.source = source;
        return this;
    }
    public Integer getSource() {
        return this.source;
    }

    public DescribeScreenScoreThreadRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
