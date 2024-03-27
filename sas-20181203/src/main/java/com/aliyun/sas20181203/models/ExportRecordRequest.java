// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportRecordRequest extends TeaModel {
    /**
     * <p>The type of the file to export. Valid values:</p>
     * <br>
     * <p>*   **virusScanExport**: The details of the virus scan tasks are exported. This parameter is available and required when ExportType is set to virusScanExport.</p>
     */
    @NameInMap("ExportFileType")
    public String exportFileType;

    /**
     * <p>The type of the check result list to export. Valid values:</p>
     * <br>
     * <p>*   **assetInstance**: the list of servers displayed on the Host page</p>
     * <p>*   **user**: the list of fingerprints for accounts</p>
     * <p>*   **port**: the list of fingerprints for ports</p>
     * <p>*   **process**: the list of fingerprints for processes</p>
     * <p>*   **sca**: the list of fingerprints for middleware assets</p>
     * <p>*   **database**: the list of fingerprints for databases</p>
     * <p>*   **web**: the list of fingerprints for web services</p>
     * <p>*   **software**: the list of fingerprints for software assets</p>
     * <p>*   **cron**: the list of fingerprints for scheduled tasks</p>
     * <p>*   **autorun**: the list of fingerprints for startup items</p>
     * <p>*   **lkm**: the list of fingerprints for kernel modules</p>
     * <p>*   **webserver**: the list of fingerprints for websites</p>
     * <p>*   **virusScanExport**: the details of the virus scan tasks</p>
     * <p>*   **imageVulExport**: the list of image system vulnerabilities</p>
     * <p>*   **imageBaseLineExport**: the list of check results for image baselines</p>
     * <p>*   **imageAffectedMaliciousExport**: the list of check results for malicious image samples</p>
     * <p>*   **baselineCspm**: the list of check results for configuration assessment</p>
     * <p>*   **attack**: the list of alert events for attack analysis</p>
     * <p>*   **accessKey**: the list of alerts that are generated for AccessKey pair leaks</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The conditions that are used to filter check results.</p>
     * <br>
     * <p>> This operation is a common export operation for multiple features of Security Center. The available configuration fields of this parameter vary based on the features. We recommend that you do not specify this parameter when you call the operation. You can export an information list without specifying this parameter, and then filter data in the exported Excel file.</p>
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
