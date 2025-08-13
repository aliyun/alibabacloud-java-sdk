// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeGroupTrendRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values: </p>
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
     * <p>day</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("day")
    public String day;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DescribeGroupTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupTrendRequest self = new DescribeGroupTrendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupTrendRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGroupTrendRequest setDay(String day) {
        this.day = day;
        return this;
    }
    public String getDay() {
        return this.day;
    }

    public DescribeGroupTrendRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
