// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class VerifyCheckInstanceResultRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     * <br>
     * <p>> You can call the [ListCheckResult](~~ListCheckResult~~) operation to query the IDs of check items.</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The instance IDs of the assets on which risks are detected based on the check item.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static VerifyCheckInstanceResultRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyCheckInstanceResultRequest self = new VerifyCheckInstanceResultRequest();
        return TeaModel.build(map, self);
    }

    public VerifyCheckInstanceResultRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public VerifyCheckInstanceResultRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
