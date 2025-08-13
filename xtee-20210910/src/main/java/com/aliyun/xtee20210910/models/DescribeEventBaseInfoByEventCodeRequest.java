// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventBaseInfoByEventCodeRequest extends TeaModel {
    /**
     * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Creation type</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("createType")
    public String createType;

    /**
     * <p>Event code</p>
     * 
     * <strong>example:</strong>
     * <p>de_arcehq4370</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DescribeEventBaseInfoByEventCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventBaseInfoByEventCodeRequest self = new DescribeEventBaseInfoByEventCodeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventBaseInfoByEventCodeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeEventBaseInfoByEventCodeRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public DescribeEventBaseInfoByEventCodeRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public DescribeEventBaseInfoByEventCodeRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
