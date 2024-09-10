// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyContainerScanConfigRequest extends TeaModel {
    /**
     * <p>The name of the container application.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;logtail-ds\&quot;,\&quot;alicloud-monitor-controller\&quot;,\&quot;storage-snapshot-manager\&quot;]</p>
     */
    @NameInMap("AppNames")
    public String appNames;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cfb7a55a81f7246b5ac18845ea79a****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
