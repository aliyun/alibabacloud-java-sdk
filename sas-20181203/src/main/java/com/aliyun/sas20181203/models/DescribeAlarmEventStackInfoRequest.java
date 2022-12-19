// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAlarmEventStackInfoRequest extends TeaModel {
    // The name of the event.
    // 
    // >  You can call the [DescribeSuspEvents](~~DescribeSuspEvents~~) operation to query the names of events.
    @NameInMap("EventName")
    public String eventName;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The ID of the alert event.
    @NameInMap("UniqueInfo")
    public String uniqueInfo;

    // The UUID of the server to query.
    // 
    // >  You can call the [DescribeSuspEvents](~~DescribeSuspEvents~~) operation to query the UUIDs of servers.
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeAlarmEventStackInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmEventStackInfoRequest self = new DescribeAlarmEventStackInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmEventStackInfoRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public DescribeAlarmEventStackInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAlarmEventStackInfoRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeAlarmEventStackInfoRequest setUniqueInfo(String uniqueInfo) {
        this.uniqueInfo = uniqueInfo;
        return this;
    }
    public String getUniqueInfo() {
        return this.uniqueInfo;
    }

    public DescribeAlarmEventStackInfoRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
