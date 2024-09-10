// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportRecordRequest extends TeaModel {
    /**
     * <p>The type of the file to export. Valid values:</p>
     * <ul>
     * <li><strong>virusScanExport</strong>: The details of the virus scan tasks are exported. This parameter is available and required when ExportType is set to virusScanExport.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>virusScanExport</p>
     */
    @NameInMap("ExportFileType")
    public String exportFileType;

    /**
     * <p>The type of the check result list that you want to export. Valid values:</p>
     * <ul>
     * <li><strong>assetInstance</strong>: the list of servers displayed on the Host page</li>
     * <li><strong>user</strong>: the list of fingerprints for accounts</li>
     * <li><strong>port</strong>: the list of fingerprints for ports</li>
     * <li><strong>process</strong>: the list of fingerprints for processes</li>
     * <li><strong>sca</strong>: the list of fingerprints for middleware assets</li>
     * <li><strong>database</strong>: the list of fingerprints for databases</li>
     * <li><strong>web</strong>: the list of fingerprints for web services</li>
     * <li><strong>software</strong>: the list of fingerprints for software assets</li>
     * <li><strong>cron</strong>: the list of fingerprints for scheduled tasks</li>
     * <li><strong>autorun</strong>: the list of fingerprints for startup items</li>
     * <li><strong>lkm</strong>: the list of fingerprints for kernel modules</li>
     * <li><strong>webserver</strong>: the list of fingerprints for websites</li>
     * <li><strong>virusScanExport</strong>: the details of the virus scan tasks</li>
     * <li><strong>imageVulExport</strong>: the list of image system vulnerabilities</li>
     * <li><strong>imageBaseLineExport</strong>: the list of check results for image baselines</li>
     * <li><strong>imageAffectedMaliciousExport</strong>: the list of check results for malicious image samples</li>
     * <li><strong>baselineCspm</strong>: the list of check results for configuration assessment</li>
     * <li><strong>attack</strong>: the list of alert events for attack analysis</li>
     * <li><strong>accessKey</strong>: the list of alerts that are generated for AccessKey pair leaks</li>
     * <li><strong>exportObjectScanEvents</strong>: the list of alerts generated for malicious files</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>database</p>
     */
    @NameInMap("ExportType")
    public String exportType;

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
     * <p>The conditions that are used to filter check results.</p>
     * <blockquote>
     * <p>This operation is a common export operation for multiple features of Security Center. The available configuration fields of this parameter vary based on the features. We recommend that you do not specify this parameter when you call the operation. You can export an information list without specifying this parameter, and then filter data in the exported Excel file.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;extend&quot;:&quot;1&quot;,&quot;currentPage&quot;:1,&quot;pageSize&quot;:10}</p>
     */
    @NameInMap("Params")
    public String params;

    public static ExportRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportRecordRequest self = new ExportRecordRequest();
        return TeaModel.build(map, self);
    }

    public ExportRecordRequest setExportFileType(String exportFileType) {
        this.exportFileType = exportFileType;
        return this;
    }
    public String getExportFileType() {
        return this.exportFileType;
    }

    public ExportRecordRequest setExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }
    public String getExportType() {
        return this.exportType;
    }

    public ExportRecordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ExportRecordRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
