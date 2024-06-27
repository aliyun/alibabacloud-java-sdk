// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventDetailByRequestIdRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("eventCode")
    public String eventCode;

    @NameInMap("eventTime")
    public Long eventTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sRequestId")
    public String sRequestId;

    public static DescribeEventDetailByRequestIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventDetailByRequestIdRequest self = new DescribeEventDetailByRequestIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventDetailByRequestIdRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeEventDetailByRequestIdRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public DescribeEventDetailByRequestIdRequest setEventTime(Long eventTime) {
        this.eventTime = eventTime;
        return this;
    }
    public Long getEventTime() {
        return this.eventTime;
    }

    public DescribeEventDetailByRequestIdRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeEventDetailByRequestIdRequest setSRequestId(String sRequestId) {
        this.sRequestId = sRequestId;
        return this;
    }
    public String getSRequestId() {
        return this.sRequestId;
    }

}
