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
     * <p>The type of detection result list to be exported. Values:</p>
     * <ul>
     * <li><strong>assetInstance</strong>: List of servers in the asset center </li>
     * <li><strong>user</strong>: List of asset fingerprints for accounts </li>
     * <li><strong>port</strong>: List of asset fingerprints for ports </li>
     * <li><strong>process</strong>: List of asset fingerprints for processes </li>
     * <li><strong>sca</strong>: List of asset fingerprints for middleware </li>
     * <li><strong>database</strong>: List of asset fingerprints for databases </li>
     * <li><strong>web</strong>: List of asset fingerprints for web services </li>
     * <li><strong>software</strong>: List of asset fingerprints for software </li>
     * <li><strong>cron</strong>: List of asset fingerprints for scheduled tasks </li>
     * <li><strong>autorun</strong>: List of asset fingerprints for startup items </li>
     * <li><strong>lkm</strong>: List of asset fingerprints for kernel modules </li>
     * <li><strong>webserver</strong>: List of asset fingerprints for web sites </li>
     * <li><strong>virusScanExport</strong>: List of details for virus scan tasks </li>
     * <li><strong>imageVulExport</strong>: List of system vulnerabilities in images </li>
     * <li><strong>imageBaseLineExport</strong>: List of baseline check results in images </li>
     * <li><strong>imageAffectedMaliciousExport</strong>: List of malicious sample check results in images </li>
     * <li><strong>baselineCspm</strong>: List of detection results for cloud platform configuration checks </li>
     * <li><strong>attack</strong>: List of alert events for attack analysis </li>
     * <li><strong>accessKey</strong>: List of alert events for AK leak detection </li>
     * <li><strong>exportObjectScanEvents</strong>: List of alert events for malicious file detection </li>
     * <li><strong>domainDetail</strong>: Website assets </li>
     * <li><strong>assetsPropertyScaProcessDetail</strong>: RASP protection process for application protection </li>
     * <li><strong>exportHcWarning</strong>: List of system baseline risks </li>
     * <li><strong>raspAttackAlert</strong>: List of attack alerts for Application Protection</li>
     * <li><strong>raspApplicationConfiguration</strong>: List of application configurations for Application Protection</li>
     * <li><strong>raspWeaknessDetection</strong>: List of weakness detections for Application Protection</li>
     * <li><strong>raspInMemoryWebshellDetection</strong>: List of in-memory webshell detection alerts for Application Protection</li>
     * <li><strong>raspInMemoryWebshellInsertion</strong>: List of in-memory webshell insertion alerts for Application Protection</li>
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

    /**
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1232428423234****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

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

    public ExportRecordRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

}
