// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class SubmitAutoAuditUnblockRequest extends TeaModel {
    /**
     * <p>The list of assets.</p>
     * <blockquote>
     * <p>The array supports up to 50 IP addresses.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;domain&quot;:&quot;&quot;,&quot;ip&quot;:&quot;120.26.29.16&quot;,&quot;assetType&quot;:&quot;EIP&quot;}]</p>
     */
    @NameInMap("AssetList")
    public String assetList;

    /**
     * <p>The auditor.</p>
     * <blockquote>
     * <p>You do not need to specify this parameter. It does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("Auditor")
    public String auditor;

    /**
     * <p>The customer UID.</p>
     * 
     * <strong>example:</strong>
     * <p>1317334647812936</p>
     */
    @NameInMap("CustomerUid")
    public String customerUid;

    /**
     * <p>The type of the email to send.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("EmailType")
    public String emailType;

    /**
     * <p>Specifies whether the email includes an unsubscribe option.</p>
     * <ul>
     * <li><strong>true</strong>: Included.</li>
     * <li><strong>false</strong>: Not included.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasUnsubscribe")
    public Boolean hasUnsubscribe;

    /**
     * <p>The description of the number of emails to send.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SendCount")
    public String sendCount;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>Usage instructions</p>
     */
    @NameInMap("UseDesc")
    public String useDesc;

    public static SubmitAutoAuditUnblockRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAutoAuditUnblockRequest self = new SubmitAutoAuditUnblockRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAutoAuditUnblockRequest setAssetList(String assetList) {
        this.assetList = assetList;
        return this;
    }
    public String getAssetList() {
        return this.assetList;
    }

    public SubmitAutoAuditUnblockRequest setAuditor(String auditor) {
        this.auditor = auditor;
        return this;
    }
    public String getAuditor() {
        return this.auditor;
    }

    public SubmitAutoAuditUnblockRequest setCustomerUid(String customerUid) {
        this.customerUid = customerUid;
        return this;
    }
    public String getCustomerUid() {
        return this.customerUid;
    }

    public SubmitAutoAuditUnblockRequest setEmailType(String emailType) {
        this.emailType = emailType;
        return this;
    }
    public String getEmailType() {
        return this.emailType;
    }

    public SubmitAutoAuditUnblockRequest setHasUnsubscribe(Boolean hasUnsubscribe) {
        this.hasUnsubscribe = hasUnsubscribe;
        return this;
    }
    public Boolean getHasUnsubscribe() {
        return this.hasUnsubscribe;
    }

    public SubmitAutoAuditUnblockRequest setSendCount(String sendCount) {
        this.sendCount = sendCount;
        return this;
    }
    public String getSendCount() {
        return this.sendCount;
    }

    public SubmitAutoAuditUnblockRequest setUseDesc(String useDesc) {
        this.useDesc = useDesc;
        return this;
    }
    public String getUseDesc() {
        return this.useDesc;
    }

}
