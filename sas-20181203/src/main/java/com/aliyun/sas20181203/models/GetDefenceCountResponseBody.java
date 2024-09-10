// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetDefenceCountResponseBody extends TeaModel {
    /**
     * <p>The number of handled alerts of the precise defense type in the last 15 days.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DefenceCount15Days")
    public Integer defenceCount15Days;

    /**
     * <p>The number of handled alerts of the precision defense type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DefenceCountTotal")
    public Integer defenceCountTotal;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>89AD16CC-97EE-50F3-9B12-9E28E5C8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of handled alerts of the web tamper proofing type in the last 15 days.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TamperProof15Days")
    public Integer tamperProof15Days;

    /**
     * <p>The number of handled alerts of the web tamper proofing type.</p>
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
