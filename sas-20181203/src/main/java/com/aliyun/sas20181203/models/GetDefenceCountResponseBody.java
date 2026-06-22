// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetDefenceCountResponseBody extends TeaModel {
    /**
     * <p>The number of alerts handled by accurate access control in the last 15 days.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DefenceCount15Days")
    public Integer defenceCount15Days;

    /**
     * <p>The total number of alerts handled by accurate access control.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DefenceCountTotal")
    public Integer defenceCountTotal;

    /**
     * <p>The ID of the request. The ID is a unique identifier that Alibaba Cloud generates for the request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>89AD16CC-97EE-50F3-9B12-9E28E5C8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of security alerts that have been handled in Security Center.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SuspiciousDealtCount")
    public Integer suspiciousDealtCount;

    /**
     * <p>The number of alerting events handled by web tamper-proofing in the last 15 days.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TamperProof15Days")
    public Integer tamperProof15Days;

    /**
     * <p>The total number of alerting events handled by web tamper-proofing.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TamperProofTotal")
    public Integer tamperProofTotal;

    public static GetDefenceCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDefenceCountResponseBody self = new GetDefenceCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDefenceCountResponseBody setDefenceCount15Days(Integer defenceCount15Days) {
        this.defenceCount15Days = defenceCount15Days;
        return this;
    }
    public Integer getDefenceCount15Days() {
        return this.defenceCount15Days;
    }

    public GetDefenceCountResponseBody setDefenceCountTotal(Integer defenceCountTotal) {
        this.defenceCountTotal = defenceCountTotal;
        return this;
    }
    public Integer getDefenceCountTotal() {
        return this.defenceCountTotal;
    }

    public GetDefenceCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDefenceCountResponseBody setSuspiciousDealtCount(Integer suspiciousDealtCount) {
        this.suspiciousDealtCount = suspiciousDealtCount;
        return this;
    }
    public Integer getSuspiciousDealtCount() {
        return this.suspiciousDealtCount;
    }

    public GetDefenceCountResponseBody setTamperProof15Days(Integer tamperProof15Days) {
        this.tamperProof15Days = tamperProof15Days;
        return this;
    }
    public Integer getTamperProof15Days() {
        return this.tamperProof15Days;
    }

    public GetDefenceCountResponseBody setTamperProofTotal(Integer tamperProofTotal) {
        this.tamperProofTotal = tamperProofTotal;
        return this;
    }
    public Integer getTamperProofTotal() {
        return this.tamperProofTotal;
    }

}
