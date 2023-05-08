// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteClientUserDefineRuleRequest extends TeaModel {
    @NameInMap("IdList")
    public java.util.List<Long> idList;

    public static DeleteClientUserDefineRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientUserDefineRuleRequest self = new DeleteClientUserDefineRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClientUserDefineRuleRequest setIdList(java.util.List<Long> idList) {
        this.idList = idList;
        return this;
    }
    public java.util.List<Long> getIdList() {
        return this.idList;
    }

}
