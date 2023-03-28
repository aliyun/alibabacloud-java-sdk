// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIpsecServerRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether only to precheck this request. Valid values:</p>
     * <br>
     * <p>*   **true**: only prechecks the request. After the request passes the precheck, the system does not delete the IPsec server. The system checks the required parameters, the request format, and the service limits. If the request fails the precheck, an error code is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): prechecks the request. After the request passes the precheck, the system deletes the IPsec server.</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>The ID of the IPsec server.</p>
     */
    @NameInMap("IpsecServerId")
    public String ipsecServerId;

    /**
     * <p>The ID of the region where the IPsec server is created.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteIpsecServerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpsecServerRequest self = new DeleteIpsecServerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIpsecServerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteIpsecServerRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public DeleteIpsecServerRequest setIpsecServerId(String ipsecServerId) {
        this.ipsecServerId = ipsecServerId;
        return this;
    }
    public String getIpsecServerId() {
        return this.ipsecServerId;
    }

    public DeleteIpsecServerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
