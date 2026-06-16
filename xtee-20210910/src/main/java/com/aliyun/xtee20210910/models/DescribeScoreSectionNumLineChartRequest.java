// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeScoreSectionNumLineChartRequest extends TeaModel {
    /**
     * <p>The language type for the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The start timestamp, in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1751249559000</p>
     */
    @NameInMap("beginTime")
    public String beginTime;

    /**
     * <p>The bypass event codes.</p>
     * 
     * <strong>example:</strong>
     * <p>de_amnhke2482</p>
     */
    @NameInMap("byPassEventCodes")
    public String byPassEventCodes;

    /**
     * <p>The end timestamp, in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1751249559000</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The main event codes.</p>
     * 
     * <strong>example:</strong>
     * <p>de_avcqzc3714</p>
     */
    @NameInMap("mainEventCodes")
    public String mainEventCodes;

    /**
     * <p>The region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>The diversion event codes.</p>
     * 
     * <strong>example:</strong>
     * <p>de_amnhke2488</p>
     */
    @NameInMap("shuntEventCodes")
    public String shuntEventCodes;

    public static DescribeScoreSectionNumLineChartRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScoreSectionNumLineChartRequest self = new DescribeScoreSectionNumLineChartRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScoreSectionNumLineChartRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeScoreSectionNumLineChartRequest setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public DescribeScoreSectionNumLineChartRequest setByPassEventCodes(String byPassEventCodes) {
        this.byPassEventCodes = byPassEventCodes;
        return this;
    }
    public String getByPassEventCodes() {
        return this.byPassEventCodes;
    }

    public DescribeScoreSectionNumLineChartRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeScoreSectionNumLineChartRequest setMainEventCodes(String mainEventCodes) {
        this.mainEventCodes = mainEventCodes;
        return this;
    }
    public String getMainEventCodes() {
        return this.mainEventCodes;
    }

    public DescribeScoreSectionNumLineChartRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeScoreSectionNumLineChartRequest setShuntEventCodes(String shuntEventCodes) {
        this.shuntEventCodes = shuntEventCodes;
        return this;
    }
    public String getShuntEventCodes() {
        return this.shuntEventCodes;
    }

}
