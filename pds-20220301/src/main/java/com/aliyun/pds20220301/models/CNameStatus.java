// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CNameStatus extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BINDING/BOUND</p>
     */
    @NameInMap("bingding_state")
    public String bingdingState;

    /**
     * <strong>example:</strong>
     * <p>NORMAL/ABNORMAL</p>
     */
    @NameInMap("legal_state")
    public String legalState;

    /**
     * <strong>example:</strong>
     * <p>beian</p>
     */
    @NameInMap("remark")
    public String remark;

    public static CNameStatus build(java.util.Map<String, ?> map) throws Exception {
        CNameStatus self = new CNameStatus();
        return TeaModel.build(map, self);
    }

    public CNameStatus setBingdingState(String bingdingState) {
        this.bingdingState = bingdingState;
        return this;
    }
    public String getBingdingState() {
        return this.bingdingState;
    }

    public CNameStatus setLegalState(String legalState) {
        this.legalState = legalState;
        return this;
    }
    public String getLegalState() {
        return this.legalState;
    }

    public CNameStatus setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
