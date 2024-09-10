// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeReportRecipientStatusRequest extends TeaModel {
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
     * <p>The email address of the recipient. Separate multiple email addresses with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a>,<a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Recipients")
    public String recipients;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>39.174.xxx.xxx</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeReportRecipientStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReportRecipientStatusRequest self = new DescribeReportRecipientStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeReportRecipientStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeReportRecipientStatusRequest setRecipients(String recipients) {
        this.recipients = recipients;
        return this;
    }
    public String getRecipients() {
        return this.recipients;
    }

    public DescribeReportRecipientStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
