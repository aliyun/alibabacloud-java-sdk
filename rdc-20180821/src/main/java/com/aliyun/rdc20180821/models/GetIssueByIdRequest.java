// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetIssueByIdRequest extends TeaModel {
    @NameInMap("Id")
    public Integer id;

    @NameInMap("CorpIdentifier")
    public String corpIdentifier;

    public static GetIssueByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIssueByIdRequest self = new GetIssueByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetIssueByIdRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public GetIssueByIdRequest setCorpIdentifier(String corpIdentifier) {
        this.corpIdentifier = corpIdentifier;
        return this;
    }
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

}
