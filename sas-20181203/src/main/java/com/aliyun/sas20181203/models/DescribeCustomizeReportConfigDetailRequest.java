// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomizeReportConfigDetailRequest extends TeaModel {
    /**
     * <p>The language type. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The report ID.\
     * The ReportId returned by calling the <a href="https://help.aliyun.com/document_detail/271655.html">DescribeCustomizeReportList</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>619031</p>
     */
    @NameInMap("ReportId")
    public Long reportId;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>202.104.XXX.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeCustomizeReportConfigDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizeReportConfigDetailRequest self = new DescribeCustomizeReportConfigDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizeReportConfigDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCustomizeReportConfigDetailRequest setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

    public DescribeCustomizeReportConfigDetailRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
