// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetDataTrendRequest extends TeaModel {
    /**
     * <p>The type of the security data that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>HC_NEW</strong>: the number of new baseline risks.</li>
     * <li><strong>HC_OPERATE</strong>: the number of handled baseline risks.</li>
     * <li><strong>VUL_NEW</strong>: the number of new vulnerabilities.</li>
     * <li><strong>VUL_OPERATE</strong>: the number of handled vulnerabilities.</li>
     * <li><strong>SUSP_NEW</strong>: the number of new alerts.</li>
     * <li><strong>SUSP_OPERATE</strong>: the number of handled alerts.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HC_NEW,HC_OPERATE</p>
     */
    @NameInMap("BizTypes")
    public String bizTypes;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1721923200000</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <p>The interval of the data that you want to query. Unit: milliseconds.</p>
     * <blockquote>
     * <p> The minimum value is 1000.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86400000</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1687334501000</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    public static GetDataTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataTrendRequest self = new GetDataTrendRequest();
        return TeaModel.build(map, self);
    }

    public GetDataTrendRequest setBizTypes(String bizTypes) {
        this.bizTypes = bizTypes;
        return this;
    }
    public String getBizTypes() {
        return this.bizTypes;
    }

    public GetDataTrendRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public GetDataTrendRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public GetDataTrendRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

}
