// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RequestServiceOfCloudDBAResponseBody extends TeaModel {
    @NameInMap("AttrData")
    public String attrData;

    @NameInMap("ListData")
    public String listData;

    @NameInMap("RequestId")
    public String requestId;

    public static RequestServiceOfCloudDBAResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RequestServiceOfCloudDBAResponseBody self = new RequestServiceOfCloudDBAResponseBody();
        return TeaModel.build(map, self);
    }

    public RequestServiceOfCloudDBAResponseBody setAttrData(String attrData) {
        this.attrData = attrData;
        return this;
    }
    public String getAttrData() {
        return this.attrData;
    }

    public RequestServiceOfCloudDBAResponseBody setListData(String listData) {
        this.listData = listData;
        return this;
    }
    public String getListData() {
        return this.listData;
    }

    public RequestServiceOfCloudDBAResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
