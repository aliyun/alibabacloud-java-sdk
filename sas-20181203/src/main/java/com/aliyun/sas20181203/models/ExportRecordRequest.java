// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportRecordRequest extends TeaModel {
    /**
     * <p>The type of file to export. Valid values:</p>
     * <ul>
     * <li><strong>virusScanExport</strong>: Exports details of a virus scan task. This parameter is required when ExportType is set to virusScanExport.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>virusScanExport</p>
     */
    @NameInMap("ExportFileType")
    public String exportFileType;

    /**
     * <p>The type of records to export. Valid values:</p>
     * <ul>
     * <li><p><strong>assetInstance</strong>: The list of servers in Asset Center</p>
     * </li>
     * <li><p><strong>user</strong>: The list of account asset fingerprints</p>
     * </li>
     * <li><p><strong>port</strong>: The list of port asset fingerprints</p>
     * </li>
     * <li><p><strong>process</strong>: The list of process asset fingerprints</p>
     * </li>
     * <li><p><strong>sca</strong>: The list of middleware asset fingerprints</p>
     * </li>
     * <li><p><strong>database</strong>: The list of database asset fingerprints</p>
     * </li>
     * <li><p><strong>web</strong>: The list of web service asset fingerprints</p>
     * </li>
     * <li><p><strong>software</strong>: The list of software asset fingerprints</p>
     * </li>
     * <li><p><strong>cron</strong>: The list of scheduled task (cron) asset fingerprints</p>
     * </li>
     * <li><p><strong>autorun</strong>: The list of startup item asset fingerprints</p>
     * </li>
     * <li><p><strong>lkm</strong>: The list of kernel module asset fingerprints</p>
     * </li>
     * <li><p><strong>webserver</strong>: The list of website asset fingerprints</p>
     * </li>
     * <li><p><strong>virusScanExport</strong>: The list of virus scan task details</p>
     * </li>
     * <li><p><strong>imageVulExport</strong>: The list of system vulnerabilities in images</p>
     * </li>
     * <li><p>imageVulExport: The list of system vulnerabilities in images</p>
     * </li>
     * <li><p><strong>imageBaseLineExport</strong>: The list of image baseline check results</p>
     * </li>
     * <li><p><strong>imageAffectedMaliciousExport</strong>: The list of malicious sample check results for images</p>
     * </li>
     * <li><p><strong>baselineCspm</strong>: The list of cloud platform configuration check results</p>
     * </li>
     * <li><p><strong>attack</strong>: The list of attack analysis alerts</p>
     * </li>
     * <li><p><strong>accessKey</strong>: The list of AK leakage detection alerts</p>
     * </li>
     * <li><p><strong>exportObjectScanEvents</strong>: The list of malicious file detection alerts</p>
     * </li>
     * <li><p><strong>domainDetail</strong>: Website assets</p>
     * </li>
     * <li><p><strong>assetsPropertyScaProcessDetail</strong>: RASP-protected processes</p>
     * </li>
     * <li><p><strong>exportHcWarning</strong>: The list of system baseline risks</p>
     * </li>
     * <li><p><strong>raspAttackAlert</strong>: The list of RASP attack alerts</p>
     * </li>
     * <li><p><strong>raspApplicationConfiguration</strong>: The list of RASP application configurations</p>
     * </li>
     * <li><p><strong>raspWeaknessDetection</strong>: The list of RASP weakness detection results</p>
     * </li>
     * <li><p><strong>raspInMemoryWebshellDetection</strong>: The list of RASP alerts for in-memory webshell detection</p>
     * </li>
     * <li><p><strong>raspInMemoryWebshellInsertion</strong>: The list of RASP alerts for in-memory webshell insertion</p>
     * </li>
     * <li><p><strong>listAgentExport</strong>: The list of agents</p>
     * </li>
     * <li><p><strong>listSkillExport</strong>: The list of skills</p>
     * </li>
     * <li><p><strong>listModelExport</strong>: The list of models</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>database</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    /**
     * <p>The language of the content in the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The filter conditions for the exported content.</p>
     * <blockquote>
     * <p>This is a general-purpose operation for exporting various detection lists from Cloud Security Center. As parameter configurations vary by feature, we recommend that you omit this parameter to export the complete list. You can then filter the data in the exported Excel file.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;extend&quot;:&quot;1&quot;,&quot;currentPage&quot;:1,&quot;pageSize&quot;:10}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The ID of the management account for a member in Resource Directory.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
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
