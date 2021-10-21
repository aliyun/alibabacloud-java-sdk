// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class DeleteTmMonitorRuleRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static DeleteTmMonitorRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTmMonitorRuleRequest self = new DeleteTmMonitorRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTmMonitorRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
