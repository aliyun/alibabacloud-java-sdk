// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportTSJobsRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("ImportType")
    public String importType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ZoneMode")
    public String zoneMode;

    public static ImportTSJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportTSJobsRequest self = new ImportTSJobsRequest();
        return TeaModel.build(map, self);
    }

    public ImportTSJobsRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ImportTSJobsRequest setImportType(String importType) {
        this.importType = importType;
        return this;
    }
    public String getImportType() {
        return this.importType;
    }

    public ImportTSJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ImportTSJobsRequest setZoneMode(String zoneMode) {
        this.zoneMode = zoneMode;
        return this;
    }
    public String getZoneMode() {
        return this.zoneMode;
    }

}
