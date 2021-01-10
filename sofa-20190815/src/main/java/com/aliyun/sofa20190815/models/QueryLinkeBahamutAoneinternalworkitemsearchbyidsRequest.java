// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAoneinternalworkitemsearchbyidsRequest extends TeaModel {
    @NameInMap("AoneIdsRepeatList")
    public java.util.List<String> aoneIdsRepeatList;

    @NameInMap("ProjectId")
    public String projectId;

    public static QueryLinkeBahamutAoneinternalworkitemsearchbyidsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAoneinternalworkitemsearchbyidsRequest self = new QueryLinkeBahamutAoneinternalworkitemsearchbyidsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAoneinternalworkitemsearchbyidsRequest setAoneIdsRepeatList(java.util.List<String> aoneIdsRepeatList) {
        this.aoneIdsRepeatList = aoneIdsRepeatList;
        return this;
    }
    public java.util.List<String> getAoneIdsRepeatList() {
        return this.aoneIdsRepeatList;
    }

    public QueryLinkeBahamutAoneinternalworkitemsearchbyidsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
