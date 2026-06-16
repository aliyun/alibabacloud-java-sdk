// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventDetailByRequestIdRequest extends TeaModel {
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
     * <p>The event code.</p>
     * 
     * <strong>example:</strong>
     * <p>de_azywkh7523</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>The event execution time.</p>
     * 
     * <strong>example:</strong>
     * <p>1752571330000</p>
     */
    @NameInMap("eventTime")
    public Long eventTime;

    /**
     * <p>The region code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>The request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BD6B08EC-1B44-5378-8838-C76A36415C55</p>
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
