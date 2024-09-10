// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventDetailRequest extends TeaModel {
    /**
     * <p>The data source of the exception. Set the value to sas.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to query the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16670360956*****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>121.33.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The ID of the exception.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>32750999</p>
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
