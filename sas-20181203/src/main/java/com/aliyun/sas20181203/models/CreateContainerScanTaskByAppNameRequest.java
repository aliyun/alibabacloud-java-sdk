// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateContainerScanTaskByAppNameRequest extends TeaModel {
    /**
     * <p>The name of the container application.</p>
     * 
     * <strong>example:</strong>
     * <p>app-centos-01</p>
     */
    @NameInMap("AppNames")
    public String appNames;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cfb7a55a81f7246b5ac18845ea79a****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The language of the content within the request and response.</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
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
