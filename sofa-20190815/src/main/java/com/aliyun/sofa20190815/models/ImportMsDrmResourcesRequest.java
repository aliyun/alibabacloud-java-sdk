// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportMsDrmResourcesRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UploadType")
    public String uploadType;

    public static ImportMsDrmResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportMsDrmResourcesRequest self = new ImportMsDrmResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ImportMsDrmResourcesRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ImportMsDrmResourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ImportMsDrmResourcesRequest setUploadType(String uploadType) {
        this.uploadType = uploadType;
        return this;
    }
    public String getUploadType() {
        return this.uploadType;
    }

}
