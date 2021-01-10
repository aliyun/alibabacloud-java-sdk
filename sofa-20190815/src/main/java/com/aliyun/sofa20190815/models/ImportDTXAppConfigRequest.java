// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportDTXAppConfigRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Context")
    public String context;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Type")
    public String type;

    public static ImportDTXAppConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDTXAppConfigRequest self = new ImportDTXAppConfigRequest();
        return TeaModel.build(map, self);
    }

    public ImportDTXAppConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ImportDTXAppConfigRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public ImportDTXAppConfigRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ImportDTXAppConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ImportDTXAppConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
