// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventDetailRequest extends TeaModel {
    /**
     * <p>The data source of the exception. Set the value to sas.</p>
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
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <br>
     * <p>>  You can call the [DescribeMonitorAccounts](~~DescribeMonitorAccounts~~) operation to query the ID.</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The ID of the exception.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SuspiciousEventId")
    public Integer suspiciousEventId;

    public static DescribeSuspEventDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventDetailRequest self = new DescribeSuspEventDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventDetailRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeSuspEventDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSuspEventDetailRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeSuspEventDetailRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeSuspEventDetailRequest setSuspiciousEventId(Integer suspiciousEventId) {
        this.suspiciousEventId = suspiciousEventId;
        return this;
    }
    public Integer getSuspiciousEventId() {
        return this.suspiciousEventId;
    }

}
