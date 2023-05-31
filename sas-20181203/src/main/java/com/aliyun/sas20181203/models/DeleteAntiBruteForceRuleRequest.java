// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteAntiBruteForceRuleRequest extends TeaModel {
    /**
     * <p>The IDs of the defense rules against brute-force attacks to delete.</p>
     */
    @NameInMap("Ids")
    public java.util.List<Long> ids;

    public static DeleteAntiBruteForceRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntiBruteForceRuleRequest self = new DeleteAntiBruteForceRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAntiBruteForceRuleRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

}
