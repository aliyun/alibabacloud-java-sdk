// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClientRatioStatisticRequest extends TeaModel {
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    @NameInMap("StatisticTypes")
    public java.util.List<String> statisticTypes;

    @NameInMap("TimeEnd")
    public Long timeEnd;

    @NameInMap("TimeStart")
    public Long timeStart;

    public static GetClientRatioStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClientRatioStatisticRequest self = new GetClientRatioStatisticRequest();
        return TeaModel.build(map, self);
    }

    public GetClientRatioStatisticRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public GetClientRatioStatisticRequest setStatisticTypes(java.util.List<String> statisticTypes) {
        this.statisticTypes = statisticTypes;
        return this;
    }
    public java.util.List<String> getStatisticTypes() {
        return this.statisticTypes;
    }

    public GetClientRatioStatisticRequest setTimeEnd(Long timeEnd) {
        this.timeEnd = timeEnd;
        return this;
    }
    public Long getTimeEnd() {
        return this.timeEnd;
    }

    public GetClientRatioStatisticRequest setTimeStart(Long timeStart) {
        this.timeStart = timeStart;
        return this;
    }
    public Long getTimeStart() {
        return this.timeStart;
    }

}
