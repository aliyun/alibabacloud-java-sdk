// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyInstancesSSLRequest extends TeaModel {
    /**
     * <p>The certificate type. Currently, only <strong>custom</strong> is supported, which indicates a custom certificate.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>SSLEnabled</strong> is set to <strong>1</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("CAType")
    public String CAType;

    /**
     * <p>The list of instance IDs of AI applications. A maximum of 10 instance IDs are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *     &quot;ra-supabase-xxx&quot;,
     *     &quot;ra-supabase-xxx&quot;
     *   ]</p>
     */
    @NameInMap("InstanceNames")
    public java.util.List<String> instanceNames;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to enable or disable SSL. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Enable.</li>
     * <li><strong>0</strong>: Disable.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SSLEnabled")
    public Integer SSLEnabled;

    /**
     * <p>The custom certificate content.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>CAType</strong> is set to <strong>custom</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----MIID*****QqEP-----END CERTIFICATE-----</p>
     */
    @NameInMap("ServerCert")
    public String serverCert;

    /**
     * <p>The private key of the certificate.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>CAType</strong> is set to <strong>custom</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN PRIVATE KEY-----MIIE****ihfg==-----END PRIVATE KEY-----</p>
     */
    @NameInMap("ServerKey")
    public String serverKey;

    public static ModifyInstancesSSLRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstancesSSLRequest self = new ModifyInstancesSSLRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstancesSSLRequest setCAType(String CAType) {
        this.CAType = CAType;
        return this;
    }
    public String getCAType() {
        return this.CAType;
    }

    public ModifyInstancesSSLRequest setInstanceNames(java.util.List<String> instanceNames) {
        this.instanceNames = instanceNames;
        return this;
    }
    public java.util.List<String> getInstanceNames() {
        return this.instanceNames;
    }

    public ModifyInstancesSSLRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstancesSSLRequest setSSLEnabled(Integer SSLEnabled) {
        this.SSLEnabled = SSLEnabled;
        return this;
    }
    public Integer getSSLEnabled() {
        return this.SSLEnabled;
    }

    public ModifyInstancesSSLRequest setServerCert(String serverCert) {
        this.serverCert = serverCert;
        return this;
    }
    public String getServerCert() {
        return this.serverCert;
    }

    public ModifyInstancesSSLRequest setServerKey(String serverKey) {
        this.serverKey = serverKey;
        return this;
    }
    public String getServerKey() {
        return this.serverKey;
    }

}
