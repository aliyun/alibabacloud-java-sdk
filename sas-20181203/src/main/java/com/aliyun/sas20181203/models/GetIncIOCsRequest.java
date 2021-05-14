// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetIncIOCsRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("Date")
    public String date;

    public static GetIncIOCsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIncIOCsRequest self = new GetIncIOCsRequest();
        return TeaModel.build(map, self);
    }

    public GetIncIOCsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetIncIOCsRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
