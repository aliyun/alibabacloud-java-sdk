// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinklogConditionRequest extends TeaModel {
    @NameInMap("ConditionId")
    public String conditionId;

    public static DeleteLinkeLinklogConditionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinklogConditionRequest self = new DeleteLinkeLinklogConditionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinklogConditionRequest setConditionId(String conditionId) {
        this.conditionId = conditionId;
        return this;
    }
    public String getConditionId() {
        return this.conditionId;
    }

}
