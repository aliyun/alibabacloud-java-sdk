// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyInstanceSSLRequest extends TeaModel {
    /**
     * <p>Enables or disables SSL. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enables SSL.</li>
     * <li><strong>0</strong>: disables SSL.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("CAType")
    public String CAType;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The operation that you want to perform. Set the value to <strong>ModifyInstanceSSL</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the RDS Supabase instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SSLEnabled")
    public Integer SSLEnabled;

    /**
     * <p>The certificate type. Only <strong>custom</strong> is supported.</p>
     * <blockquote>
     * <p> This parameter is required if <strong>SSLEnabled</strong> is set to <strong>1</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----MIID*****QqEP-----END CERTIFICATE-----</p>
     */
    @NameInMap("ServerCert")
    public String serverCert;

    /**
     * <p>The content of the custom certificate.</p>
     * <blockquote>
     * <p> This parameter is required if <strong>CAType</strong> is set to <strong>custom</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN PRIVATE KEY-----MIIE****ihfg==-----END PRIVATE KEY-----</p>
     */
    @NameInMap("ServerKey")
    public String serverKey;

    public static ModifyInstanceSSLRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceSSLRequest self = new ModifyInstanceSSLRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceSSLRequest setCAType(String CAType) {
        this.CAType = CAType;
        return this;
    }
    public String getCAType() {
        return this.CAType;
    }

    public ModifyInstanceSSLRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyInstanceSSLRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceSSLRequest setSSLEnabled(Integer SSLEnabled) {
        this.SSLEnabled = SSLEnabled;
        return this;
    }
    public Integer getSSLEnabled() {
        return this.SSLEnabled;
    }

    public ModifyInstanceSSLRequest setServerCert(String serverCert) {
        this.serverCert = serverCert;
        return this;
    }
    public String getServerCert() {
        return this.serverCert;
    }

    public ModifyInstanceSSLRequest setServerKey(String serverKey) {
        this.serverKey = serverKey;
        return this;
    }
    public String getServerKey() {
        return this.serverKey;
    }

}
