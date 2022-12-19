// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportRecordRequest extends TeaModel {
    // The type of the check result list to export. Valid values:
    // 
    // *   **assetInstance**: the list of servers displayed on the Host page
    // *   **user**: the list of fingerprints for accounts
    // *   **port**: the list of fingerprints for ports
    // *   **process**: the list of fingerprints for processes
    // *   **sca**: the list of fingerprints for middleware assets
    // *   **database**: the list of fingerprints for databases
    // *   **web**: the list of fingerprints for web services
    // *   **software**: the list of fingerprints for software assets
    // *   **cron**: the list of fingerprints for scheduled tasks
    // *   **autorun**: the list of fingerprints for startup items
    // *   **lkm**: the list of fingerprints for kernel modules
    // *   **webserver**: the list of fingerprints for websites
    // *   **imageVulExport**: the list of image system vulnerabilities
    // *   **imageBaseLineExport**: the list of baseline check results for images
    // *   **imageAffectedMaliciousExport**: the list of check results for malicious image samples
    // *   **baseline**: the list of check results for configuration assessment
    // *   **attack**: the list of alerts for attack analysis
    // *   **accessKey**: the list of alerts that are generated for AccessKey pair leaks
    @NameInMap("ExportType")
    public String exportType;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The conditions that are used to filter check results.
    // 
    // >  This operation is a common export operation for multiple features of Security Center. The available configuration fields of this parameter vary based on the features. We recommend that you do not specify this parameter when you call the operation. You can export an information list without specifying this parameter, and then filter data in the exported Excel file.
    @NameInMap("Params")
    public String params;

    public static ExportRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportRecordRequest self = new ExportRecordRequest();
        return TeaModel.build(map, self);
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
