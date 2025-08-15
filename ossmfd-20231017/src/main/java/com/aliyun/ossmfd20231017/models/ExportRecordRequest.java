// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossmfd20231017.models;

import com.aliyun.tea.*;

public class ExportRecordRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exportObjectScanEvents</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>{&quot;currentPage&quot;:1,&quot;pageSize&quot;:10}</p>
     */
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
