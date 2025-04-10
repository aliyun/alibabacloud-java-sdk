// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class RegisterAccountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;user api register&quot;</p>
     */
    @NameInMap("Memo")
    public String memo;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RegisterAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterAccountRequest self = new RegisterAccountRequest();
        return TeaModel.build(map, self);
    }

    public RegisterAccountRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public RegisterAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
