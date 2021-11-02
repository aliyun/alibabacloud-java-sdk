// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetIncIOCsRequest extends TeaModel {
    @NameInMap("Date")
    public String date;

    @NameInMap("Type")
    public String type;

    public static GetIncIOCsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIncIOCsRequest self = new GetIncIOCsRequest();
        return TeaModel.build(map, self);
    }

    public GetIncIOCsRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public GetIncIOCsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
