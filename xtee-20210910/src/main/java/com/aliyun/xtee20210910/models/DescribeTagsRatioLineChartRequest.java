// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTagsRatioLineChartRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("beginTime")
    public Long beginTime;

    @NameInMap("byPassEventCodes")
    public String byPassEventCodes;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("mainEventCodes")
    public String mainEventCodes;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("regId")
    public String regId;

    @NameInMap("shuntEventCodes")
    public String shuntEventCodes;

    public static DescribeTagsRatioLineChartRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsRatioLineChartRequest self = new DescribeTagsRatioLineChartRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTagsRatioLineChartRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeTagsRatioLineChartRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public DescribeTagsRatioLineChartRequest setByPassEventCodes(String byPassEventCodes) {
        this.byPassEventCodes = byPassEventCodes;
        return this;
    }
    public String getByPassEventCodes() {
        return this.byPassEventCodes;
    }

    public DescribeTagsRatioLineChartRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeTagsRatioLineChartRequest setMainEventCodes(String mainEventCodes) {
        this.mainEventCodes = mainEventCodes;
        return this;
    }
    public String getMainEventCodes() {
        return this.mainEventCodes;
    }

    public DescribeTagsRatioLineChartRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeTagsRatioLineChartRequest setShuntEventCodes(String shuntEventCodes) {
        this.shuntEventCodes = shuntEventCodes;
        return this;
    }
    public String getShuntEventCodes() {
        return this.shuntEventCodes;
    }

}
