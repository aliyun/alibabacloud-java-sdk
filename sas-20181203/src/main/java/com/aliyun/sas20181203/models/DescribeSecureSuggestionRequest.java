// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecureSuggestionRequest extends TeaModel {
    /**
     * <p>Choose to query the new or old version of the security score rules. When the value is <strong>home_security_score</strong>, it queries the new version of the security score rules; otherwise, it defaults to querying the old version of the security score rules.</p>
     * 
     * <strong>example:</strong>
     * <p>home_security_score</p>
     */
    @NameInMap("CalType")
    public String calType;

    /**
     * <p>The language type for request and response messages, default is <strong>zh</strong>. Values:</p>
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
     * <p>Resource directory member account ID (Alibaba Cloud account).</p>
     * <blockquote>
     * <p>You can obtain this parameter by calling the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> API.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1232428423234****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>Source of the security score. If left empty, it defaults to Cloud Security Center. Enumerated values:</p>
     * <ul>
     * <li><p>0: Cloud Security Center.</p>
     * </li>
     * <li><p>1: Yaochi Console.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Source")
    public Integer source;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeSecureSuggestionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecureSuggestionRequest self = new DescribeSecureSuggestionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecureSuggestionRequest setCalType(String calType) {
        this.calType = calType;
        return this;
    }
    public String getCalType() {
        return this.calType;
    }

    public DescribeSecureSuggestionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSecureSuggestionRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeSecureSuggestionRequest setSource(Integer source) {
        this.source = source;
        return this;
    }
    public Integer getSource() {
        return this.source;
    }

    public DescribeSecureSuggestionRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
