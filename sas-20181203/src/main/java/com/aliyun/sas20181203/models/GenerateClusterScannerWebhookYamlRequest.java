// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GenerateClusterScannerWebhookYamlRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> API to obtain this parameter from the ClusterId field.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c3aaf6c8085f84791882eef200cd2****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Indicates whether the incremental scan switch is enabled. Values:</p>
     * <ul>
     * <li><strong>0</strong>: Not enabled</li>
     * <li><strong>1</strong>: Enabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("WebhookOpen")
    public Integer webhookOpen;

    public static GenerateClusterScannerWebhookYamlRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateClusterScannerWebhookYamlRequest self = new GenerateClusterScannerWebhookYamlRequest();
        return TeaModel.build(map, self);
    }

    public GenerateClusterScannerWebhookYamlRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GenerateClusterScannerWebhookYamlRequest setWebhookOpen(Integer webhookOpen) {
        this.webhookOpen = webhookOpen;
        return this;
    }
    public Integer getWebhookOpen() {
        return this.webhookOpen;
    }

}
