// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterScannerYamlResponseBody extends TeaModel {
    /**
     * <p>Base64 encoded CA certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("CaCertBase64")
    public String caCertBase64;

    /**
     * <p>Cluster environment information.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ClusterEnvInfo")
    public String clusterEnvInfo;

    /**
     * <p>The ID of the cluster that you want to scan.</p>
     * 
     * <strong>example:</strong>
     * <p>c7c190a82d9a048be9038d352840f****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-registry.cn-shanghai.cr.aliyuncs.com/default/scanner:v1</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Base64 encoded webhook certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("TlsCertBase64")
    public String tlsCertBase64;

    /**
     * <p>Base64 encoded webhook private key.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("TlsKeyBase64")
    public String tlsKeyBase64;

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

    public static GetClusterScannerYamlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterScannerYamlResponseBody self = new GetClusterScannerYamlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterScannerYamlResponseBody setCaCertBase64(String caCertBase64) {
        this.caCertBase64 = caCertBase64;
        return this;
    }
    public String getCaCertBase64() {
        return this.caCertBase64;
    }

    public GetClusterScannerYamlResponseBody setClusterEnvInfo(String clusterEnvInfo) {
        this.clusterEnvInfo = clusterEnvInfo;
        return this;
    }
    public String getClusterEnvInfo() {
        return this.clusterEnvInfo;
    }

    public GetClusterScannerYamlResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetClusterScannerYamlResponseBody setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public GetClusterScannerYamlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClusterScannerYamlResponseBody setTlsCertBase64(String tlsCertBase64) {
        this.tlsCertBase64 = tlsCertBase64;
        return this;
    }
    public String getTlsCertBase64() {
        return this.tlsCertBase64;
    }

    public GetClusterScannerYamlResponseBody setTlsKeyBase64(String tlsKeyBase64) {
        this.tlsKeyBase64 = tlsKeyBase64;
        return this;
    }
    public String getTlsKeyBase64() {
        return this.tlsKeyBase64;
    }

    public GetClusterScannerYamlResponseBody setWebhookOpen(Integer webhookOpen) {
        this.webhookOpen = webhookOpen;
        return this;
    }
    public Integer getWebhookOpen() {
        return this.webhookOpen;
    }

}
