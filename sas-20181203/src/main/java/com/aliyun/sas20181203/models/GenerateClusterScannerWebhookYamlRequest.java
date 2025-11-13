// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GenerateClusterScannerWebhookYamlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c3aaf6c8085f84791882eef200cd2****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
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
