// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTagsRatioLineChartRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
    public Long beginTime;

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
     * <p>1751595912000</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>Main event code</p>
     * 
     * <strong>example:</strong>
     * <p>de_amnhke2482</p>
     */
    @NameInMap("mainEventCodes")
    public String mainEventCodes;

    /**
     * <p>Region code</p>
     * <p>This parameter is required.</p>
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
