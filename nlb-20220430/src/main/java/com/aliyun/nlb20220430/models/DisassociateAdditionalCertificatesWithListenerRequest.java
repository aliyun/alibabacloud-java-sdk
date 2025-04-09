// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class DisassociateAdditionalCertificatesWithListenerRequest extends TeaModel {
    /**
     * <p>The additional certificates. You can disassociate up to 15 additional certificates in each call.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AdditionalCertificateIds")
    public java.util.List<String> additionalCertificateIds;

    /**
     * <p>The client token used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate this value. Ensure that the value is unique among all requests. Only ASCII characters are allowed.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the value of <strong>RequestId</strong> is used.**** <strong>RequestId</strong> is different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Validates the request without performing the operation. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the validation, the corresponding error message is returned. If the request passes the validation, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): validates the request and performs the operation. If the request passes the validation, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The listener ID. Only TCP/SSL listener IDs are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsn-bpn0kn908w4nbw****@80</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The region ID of the NLB instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
