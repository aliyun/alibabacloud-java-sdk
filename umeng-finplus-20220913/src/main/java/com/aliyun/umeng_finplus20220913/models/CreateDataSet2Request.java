// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class CreateDataSet2Request extends TeaModel {
    @NameInMap("clientId")
    public Long clientId;

    @NameInMap("name")
    public String name;

    @NameInMap("type")
    public String type;

    public static CreateDataSet2Request build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSet2Request self = new CreateDataSet2Request();
        return TeaModel.build(map, self);
    }

    public CreateDataSet2Request setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public CreateDataSet2Request setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDataSet2Request setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
