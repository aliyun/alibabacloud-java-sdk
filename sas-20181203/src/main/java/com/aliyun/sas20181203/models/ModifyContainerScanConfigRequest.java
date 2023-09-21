// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyContainerScanConfigRequest extends TeaModel {
    @NameInMap("AppNames")
    public String appNames;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Lang")
    public String lang;

    public static ModifyContainerScanConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyContainerScanConfigRequest self = new ModifyContainerScanConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyContainerScanConfigRequest setAppNames(String appNames) {
        this.appNames = appNames;
        return this;
    }
    public String getAppNames() {
        return this.appNames;
    }

    public ModifyContainerScanConfigRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyContainerScanConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
