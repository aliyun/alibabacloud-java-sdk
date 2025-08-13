// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeCustVariableConfigListRequest extends TeaModel {
    /**
     * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values: </p>
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
     * <p>Configuration type</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TIME_TYPE</p>
     */
    @NameInMap("bizType")
    public String bizType;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Time type</p>
     * 
     * <strong>example:</strong>
     * <p>CURRENT</p>
     */
    @NameInMap("timeType")
    public String timeType;

    public static DescribeCustVariableConfigListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustVariableConfigListRequest self = new DescribeCustVariableConfigListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustVariableConfigListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCustVariableConfigListRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeCustVariableConfigListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeCustVariableConfigListRequest setTimeType(String timeType) {
        this.timeType = timeType;
        return this;
    }
    public String getTimeType() {
        return this.timeType;
    }

}
