// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetWorkitemByIdRequest extends TeaModel {
    @NameInMap("Id")
    public Integer id;

    @NameInMap("CorpIdentifier")
    public String corpIdentifier;

    public static GetWorkitemByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkitemByIdRequest self = new GetWorkitemByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkitemByIdRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public GetWorkitemByIdRequest setCorpIdentifier(String corpIdentifier) {
        this.corpIdentifier = corpIdentifier;
        return this;
    }
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

}
