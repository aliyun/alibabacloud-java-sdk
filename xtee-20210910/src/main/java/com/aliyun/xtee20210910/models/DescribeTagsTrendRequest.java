// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTagsTrendRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("beginTime")
    public Long beginTime;

    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("eventCodes")
    public String eventCodes;

    @NameInMap("regId")
    public String regId;

    @NameInMap("result")
    public String result;

    public static DescribeTagsTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsTrendRequest self = new DescribeTagsTrendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTagsTrendRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeTagsTrendRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public DescribeTagsTrendRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeTagsTrendRequest setEventCodes(String eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public String getEventCodes() {
        return this.eventCodes;
    }

    public DescribeTagsTrendRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeTagsTrendRequest setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
