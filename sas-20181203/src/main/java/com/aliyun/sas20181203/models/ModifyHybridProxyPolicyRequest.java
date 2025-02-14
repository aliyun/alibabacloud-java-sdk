// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyHybridProxyPolicyRequest extends TeaModel {
    /**
     * <p>The name of the proxy cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sas-proxy</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The policy of the proxy cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *         &quot;policyType&quot;: &quot;limitFrequency&quot;,
     *         &quot;info&quot;:
     *         [
     *             {
     *                 &quot;type&quot;: &quot;file&quot;,
     *                 &quot;config&quot;: &quot;10&quot;
     *             }
     *         ]
     *     },
     *     {
     *         &quot;policyType&quot;: &quot;limitBandWidth&quot;,
     *         &quot;info&quot;:
     *         [
     *             {
     *                 &quot;type&quot;: &quot;net&quot;
     *             },
     *             {
     *                 &quot;type&quot;: &quot;process&quot;
     *             }
     *         ]
     *     }
     * ]</p>
     */
    @NameInMap("PolicyInfo")
    public String policyInfo;

    public static ModifyHybridProxyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridProxyPolicyRequest self = new ModifyHybridProxyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHybridProxyPolicyRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ModifyHybridProxyPolicyRequest setPolicyInfo(String policyInfo) {
        this.policyInfo = policyInfo;
        return this;
    }
    public String getPolicyInfo() {
        return this.policyInfo;
    }

}
