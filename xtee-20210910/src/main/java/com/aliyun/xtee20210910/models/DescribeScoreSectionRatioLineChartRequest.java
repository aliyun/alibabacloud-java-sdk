// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeScoreSectionRatioLineChartRequest extends TeaModel {
    /**
     * <p>Sets the language type for request and response messages, with a default value of <strong>zh</strong>. Values: </p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Start time, accurate to milliseconds (ms).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1751249559000</p>
     */
    @NameInMap("beginTime")
    public String beginTime;

    /**
     * <p>Bypass event code</p>
     * 
     * <strong>example:</strong>
     * <p>de_amnhke2482</p>
     */
    @NameInMap("byPassEventCodes")
    public String byPassEventCodes;

    /**
     * <p>End time, accurate to milliseconds (ms).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1748491200000</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>Main event code</p>
     * 
     * <strong>example:</strong>
     * <p>de_avcqzc3714</p>
     */
    @NameInMap("mainEventCodes")
    public String mainEventCodes;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Shunt event code</p>
     * 
     * <strong>example:</strong>
     * <p>de_amnhke2488</p>
     */
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
