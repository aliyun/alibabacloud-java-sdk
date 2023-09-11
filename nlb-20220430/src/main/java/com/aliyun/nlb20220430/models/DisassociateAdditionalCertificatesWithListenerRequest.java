// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class DisassociateAdditionalCertificatesWithListenerRequest extends TeaModel {
    @NameInMap("AdditionalCertificateIds")
    public java.util.List<String> additionalCertificateIds;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck this request. Valid values:</p>
     * <br>
     * <p>*   **true**: prechecks the request without creating the resource. The system prechecks the required parameters, request syntax, and limits. If the request fails the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): sends the request. If the request passes the precheck, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The listener ID.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The ID of the region where the NLB instance is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~443657~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DisassociateAdditionalCertificatesWithListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        DisassociateAdditionalCertificatesWithListenerRequest self = new DisassociateAdditionalCertificatesWithListenerRequest();
        return TeaModel.build(map, self);
    }

    public DisassociateAdditionalCertificatesWithListenerRequest setAdditionalCertificateIds(java.util.List<String> additionalCertificateIds) {
        this.additionalCertificateIds = additionalCertificateIds;
        return this;
    }
    public java.util.List<String> getAdditionalCertificateIds() {
        return this.additionalCertificateIds;
    }

    public DisassociateAdditionalCertificatesWithListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DisassociateAdditionalCertificatesWithListenerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DisassociateAdditionalCertificatesWithListenerRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public DisassociateAdditionalCertificatesWithListenerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
