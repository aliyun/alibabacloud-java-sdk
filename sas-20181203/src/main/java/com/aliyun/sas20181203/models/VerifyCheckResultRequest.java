// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class VerifyCheckResultRequest extends TeaModel {
    /**
     * <p>An array that consists of the IDs of risk items.</p>
     */
    @NameInMap("CheckIds")
    public java.util.List<Long> checkIds;

    public static VerifyCheckResultRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyCheckResultRequest self = new VerifyCheckResultRequest();
        return TeaModel.build(map, self);
    }

    public VerifyCheckResultRequest setCheckIds(java.util.List<Long> checkIds) {
        this.checkIds = checkIds;
        return this;
    }
    public java.util.List<Long> getCheckIds() {
        return this.checkIds;
    }

}
