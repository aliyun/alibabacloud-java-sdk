// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessRegionResponseBody extends TeaModel {
    @NameInMap("RegionList")
    public java.util.List<String> regionList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAgentlessRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentlessRegionResponseBody self = new ListAgentlessRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentlessRegionResponseBody setRegionList(java.util.List<String> regionList) {
        this.regionList = regionList;
        return this;
    }
    public java.util.List<String> getRegionList() {
        return this.regionList;
    }

    public ListAgentlessRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
