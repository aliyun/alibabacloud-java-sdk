// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeScoreSectionRatioLineChartRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("beginTime")
    public String beginTime;

    @NameInMap("byPassEventCodes")
    public String byPassEventCodes;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("mainEventCodes")
    public String mainEventCodes;

    @NameInMap("regId")
    public String regId;

    @NameInMap("shuntEventCodes")
    public String shuntEventCodes;

    public static DescribeScoreSectionRatioLineChartRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScoreSectionRatioLineChartRequest self = new DescribeScoreSectionRatioLineChartRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScoreSectionRatioLineChartRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeScoreSectionRatioLineChartRequest setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public DescribeScoreSectionRatioLineChartRequest setByPassEventCodes(String byPassEventCodes) {
        this.byPassEventCodes = byPassEventCodes;
        return this;
    }
    public String getByPassEventCodes() {
        return this.byPassEventCodes;
    }

    public DescribeScoreSectionRatioLineChartRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeScoreSectionRatioLineChartRequest setMainEventCodes(String mainEventCodes) {
        this.mainEventCodes = mainEventCodes;
        return this;
    }
    public String getMainEventCodes() {
        return this.mainEventCodes;
    }

    public DescribeScoreSectionRatioLineChartRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeScoreSectionRatioLineChartRequest setShuntEventCodes(String shuntEventCodes) {
        this.shuntEventCodes = shuntEventCodes;
        return this;
    }
    public String getShuntEventCodes() {
        return this.shuntEventCodes;
    }

}
