// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetIOCsRequest extends TeaModel {
    @NameInMap("Date")
    public String date;

    @NameInMap("Type")
    public String type;

    public static GetIOCsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIOCsRequest self = new GetIOCsRequest();
        return TeaModel.build(map, self);
    }

    public GetIOCsRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public GetIOCsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
