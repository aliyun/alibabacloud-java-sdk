// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeReusableSlbRequest extends TeaModel {
    /**
     * <p>The ID of the cluster on the data plane. If you specify this parameter, you cannot specify ServiceMeshId. This parameter and ServiceMeshId cannot be left empty at the same time.</p>
     * 
     * <strong>example:</strong>
     * <p>ca2cfe41fefeb489d9b9dba18a7c5****</p>
     */
    @NameInMap("K8sClusterId")
    public String k8sClusterId;

    /**
     * <p>Load balancer type, value:</p>
     * <ul>
     * <li><p><code>clb</code>: Classic Load Balancer</p>
     * </li>
     * <li><p><code>nlb</code>: Network Load Balancer</p>
     * </li>
     * </ul>
     * <p>default is <code>clb</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>clb</p>
     */
    @NameInMap("LbType")
    public String lbType;

    /**
     * <p>The network type of the SLB instance. Valid values:</p>
     * <ul>
     * <li><code>intranet</code></li>
     * <li><code>internet</code></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>internet</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The ID of the Service Mesh (ASM) instance. If you specify this parameter, you cannot specify K8sClusterId. This parameter and K8sClusterId cannot be left empty at the same time.</p>
     * 
     * <strong>example:</strong>
     * <p>cb8963379255149cb98c8686f274x****</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeReusableSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReusableSlbRequest self = new DescribeReusableSlbRequest();
        return TeaModel.build(map, self);
    }

    public DescribeReusableSlbRequest setK8sClusterId(String k8sClusterId) {
        this.k8sClusterId = k8sClusterId;
        return this;
    }
    public String getK8sClusterId() {
        return this.k8sClusterId;
    }

    public DescribeReusableSlbRequest setLbType(String lbType) {
        this.lbType = lbType;
        return this;
    }
    public String getLbType() {
        return this.lbType;
    }

    public DescribeReusableSlbRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeReusableSlbRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
