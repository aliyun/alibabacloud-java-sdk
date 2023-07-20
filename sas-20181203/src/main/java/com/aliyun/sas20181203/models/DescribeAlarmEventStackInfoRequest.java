// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAlarmEventStackInfoRequest extends TeaModel {
    /**
     * <p>The name of the event.</p>
     * <br>
     * <p>>  You can call the [DescribeSuspEvents](~~DescribeSuspEvents~~) operation to query the names of events.</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The ID of the alert event.</p>
     */
    @NameInMap("UniqueInfo")
    public String uniqueInfo;

    /**
     * <p>The UUID of the server to query.</p>
     * <br>
     * <p>>  You can call the [DescribeSuspEvents](~~DescribeSuspEvents~~) operation to query the UUIDs of servers.</p>
     */
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

    public DescribeAlarmEventStackInfoRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
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
