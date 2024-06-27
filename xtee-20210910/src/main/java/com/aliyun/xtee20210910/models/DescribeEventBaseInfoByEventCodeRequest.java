// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventBaseInfoByEventCodeRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("createType")
    public String createType;

    @NameInMap("eventCode")
    public String eventCode;

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
