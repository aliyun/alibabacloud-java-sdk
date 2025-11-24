// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshKubeconfigResponseBody extends TeaModel {
    /**
     * <p>The expiration time of the kubeconfig certificate. The format is: YYYY-MM-DD hh: mm: ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-28 16:00:00</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The content of the kubeconfig file of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>apiVersion: v1 clusters: - cluster:     server: <a href="https://47.110.xx.xx:6443">https://47.110.xx.xx:6443</a>     certificate-authority-data: LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCk1JSURUakNDQWphZ0F3SUJBZ0lVYzBQVy82ejR1aHlxYkRRdnNsV1htSmpJeFdNd0RRWUpLb1pJaHZjTkFRRUwKQlFBd1BqRW5NQThHQTFVRUNoTUlhR0Z1WjNwb2IzVXdGQVlEVlFRS0V3MWhiR2xpWVdKaElHTnNiM1ZrTVJNdwpFUVlEVlFRREV3cHJkV0psY201bGRHVnpNQ0FYRFRJeU1EUXdOekExTVRnd01Gb1lEekl3TlRJd016TXdNRFV4Ck9EQXdXakErTVNjd0R3WURWUVFLRXdob1lXNW5lbWh2ZFRBVUJnTlZCQW9URFdGc2FXSmhZbUVnWTJ4dmRXUXgKRXpBUkJnTlZCQU1UQ210MVltVnlibVYwWlhNd2dnRWlNQTBHQ1NxR1NJYjNEUUVCQVFVQUE0SUJE****</p>
     */
    @NameInMap("Kubeconfig")
    public String kubeconfig;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31d3a0f0-07ed-4f6e-9004-1804498c****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeServiceMeshKubeconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshKubeconfigResponseBody self = new DescribeServiceMeshKubeconfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshKubeconfigResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeServiceMeshKubeconfigResponseBody setKubeconfig(String kubeconfig) {
        this.kubeconfig = kubeconfig;
        return this;
    }
    public String getKubeconfig() {
        return this.kubeconfig;
    }

    public DescribeServiceMeshKubeconfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
