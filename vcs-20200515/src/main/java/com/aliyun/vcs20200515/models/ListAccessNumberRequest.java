// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListAccessNumberRequest extends TeaModel {
    @NameInMap("CorpIdList")
    public String corpIdList;

    public static ListAccessNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccessNumberRequest self = new ListAccessNumberRequest();
        return TeaModel.build(map, self);
    }

    public ListAccessNumberRequest setCorpIdList(String corpIdList) {
        this.corpIdList = corpIdList;
        return this;
    }
    public String getCorpIdList() {
        return this.corpIdList;
    }

}
