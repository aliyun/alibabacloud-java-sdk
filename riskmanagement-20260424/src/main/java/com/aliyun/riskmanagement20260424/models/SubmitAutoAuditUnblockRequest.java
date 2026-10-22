// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class SubmitAutoAuditUnblockRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{&quot;domain&quot;:&quot;&quot;,&quot;ip&quot;:&quot;120.26.29.16&quot;,&quot;assetType&quot;:&quot;EIP&quot;}]</p>
     */
    @NameInMap("AssetList")
    public String assetList;

    /**
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("Auditor")
    public String auditor;

    /**
     * <strong>example:</strong>
     * <p>1317334647812936</p>
     */
    @NameInMap("CustomerUid")
    public String customerUid;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("EmailType")
    public String emailType;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasUnsubscribe")
    public Boolean hasUnsubscribe;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SendCount")
    public String sendCount;

    /**
     * <strong>example:</strong>
     * <p>使用说明。</p>
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
