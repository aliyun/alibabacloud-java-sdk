// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportTSJobsOssRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("ImportType")
    public String importType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ZoneMode")
    public String zoneMode;

    public static ImportTSJobsOssRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportTSJobsOssRequest self = new ImportTSJobsOssRequest();
        return TeaModel.build(map, self);
    }

    public ImportTSJobsOssRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ImportTSJobsOssRequest setImportType(String importType) {
        this.importType = importType;
        return this;
    }
    public String getImportType() {
        return this.importType;
    }

    public ImportTSJobsOssRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ImportTSJobsOssRequest setZoneMode(String zoneMode) {
        this.zoneMode = zoneMode;
        return this;
    }
    public String getZoneMode() {
        return this.zoneMode;
    }

}
