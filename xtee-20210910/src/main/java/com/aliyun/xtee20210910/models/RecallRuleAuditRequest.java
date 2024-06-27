// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class RecallRuleAuditRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("id")
    public Long id;

    @NameInMap("regId")
    public String regId;

    public static RecallRuleAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        RecallRuleAuditRequest self = new RecallRuleAuditRequest();
        return TeaModel.build(map, self);
    }

    public RecallRuleAuditRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RecallRuleAuditRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
