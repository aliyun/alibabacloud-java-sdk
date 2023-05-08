// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetVulStatisticsRequest extends TeaModel {
    @NameInMap("GroupIdList")
    public String groupIdList;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("TypeList")
    public String typeList;

    public static GetVulStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVulStatisticsRequest self = new GetVulStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetVulStatisticsRequest setGroupIdList(String groupIdList) {
        this.groupIdList = groupIdList;
        return this;
    }
    public String getGroupIdList() {
        return this.groupIdList;
    }

    public GetVulStatisticsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public GetVulStatisticsRequest setTypeList(String typeList) {
        this.typeList = typeList;
        return this;
    }
    public String getTypeList() {
        return this.typeList;
    }

}
