// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSuspiciousStatisticsRequest extends TeaModel {
    @NameInMap("GroupIdList")
    public String groupIdList;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static GetSuspiciousStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSuspiciousStatisticsRequest self = new GetSuspiciousStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetSuspiciousStatisticsRequest setGroupIdList(String groupIdList) {
        this.groupIdList = groupIdList;
        return this;
    }
    public String getGroupIdList() {
        return this.groupIdList;
    }

    public GetSuspiciousStatisticsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
