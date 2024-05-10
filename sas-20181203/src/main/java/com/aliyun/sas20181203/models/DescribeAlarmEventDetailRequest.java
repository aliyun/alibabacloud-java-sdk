// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAlarmEventDetailRequest extends TeaModel {
    /**
     * <p>The unique identifier of the alert event.</p>
     * <br>
     * <p>> To query the details of an alert event, you must provide the unique identifier of the alert event. You can call the [DescribeSuspEvents](~~DescribeSuspEvents~~) operation to obtain the identifier.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AlarmUniqueInfo")
    public String alarmUniqueInfo;

    /**
     * <p>The ID of the request source. Set the value to **sas**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeAlarmEventDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmEventDetailRequest self = new DescribeAlarmEventDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmEventDetailRequest setAlarmUniqueInfo(String alarmUniqueInfo) {
        this.alarmUniqueInfo = alarmUniqueInfo;
        return this;
    }
    public String getAlarmUniqueInfo() {
        return this.alarmUniqueInfo;
    }

    public DescribeAlarmEventDetailRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeAlarmEventDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAlarmEventDetailRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
