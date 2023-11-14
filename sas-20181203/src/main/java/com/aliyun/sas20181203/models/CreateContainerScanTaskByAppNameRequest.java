// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateContainerScanTaskByAppNameRequest extends TeaModel {
    /**
     * <p>The name of the container application.</p>
     */
    @NameInMap("AppNames")
    public String appNames;

    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The language of the content within the request and response.</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static CreateContainerScanTaskByAppNameRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContainerScanTaskByAppNameRequest self = new CreateContainerScanTaskByAppNameRequest();
        return TeaModel.build(map, self);
    }

    public CreateContainerScanTaskByAppNameRequest setAppNames(String appNames) {
        this.appNames = appNames;
        return this;
    }
    public String getAppNames() {
        return this.appNames;
    }

    public CreateContainerScanTaskByAppNameRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateContainerScanTaskByAppNameRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
