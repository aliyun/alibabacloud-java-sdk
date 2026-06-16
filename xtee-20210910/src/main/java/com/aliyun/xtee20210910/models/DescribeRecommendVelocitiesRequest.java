// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRecommendVelocitiesRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The metric code.</p>
     * 
     * <strong>example:</strong>
     * <p>coupon_abuse_detection</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>The metric type.</p>
     * 
     * <strong>example:</strong>
     * <p>recommend_velocity</p>
     */
    @NameInMap("type")
    public String type;

    public static DescribeRecommendVelocitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendVelocitiesRequest self = new DescribeRecommendVelocitiesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendVelocitiesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRecommendVelocitiesRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRecommendVelocitiesRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeRecommendVelocitiesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
