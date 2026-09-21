// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeReportExportRequest extends TeaModel {
    /**
     * <p>The ID of the export task. Obtain this ID by following these steps:</p>
     * <ol>
     * <li>Call <a href="~~DescribeCustomizeReportList~~">DescribeCustomizeReportList</a> to obtain the ReportId.</li>
     * <li>Pass the ReportId to <a href="~~ExportCustomizeReport~~">ExportCustomizeReport</a> to obtain the ExportId from the response.</li>
     * <li>Pass the ExportId to this operation to query the export status.</li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ExportId")
    public Long exportId;

    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The Alibaba Cloud account ID of the member accounts in the resource folder.</p>
     * <blockquote>
     * <p>Invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    public static DescribeReportExportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReportExportRequest self = new DescribeReportExportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeReportExportRequest setExportId(Long exportId) {
        this.exportId = exportId;
        return this;
    }
    public Long getExportId() {
        return this.exportId;
    }

    public DescribeReportExportRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeReportExportRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

}
