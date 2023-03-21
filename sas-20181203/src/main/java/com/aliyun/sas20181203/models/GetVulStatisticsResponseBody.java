// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetVulStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VulAsapSum")
    public Integer vulAsapSum;

    @NameInMap("VulLaterSum")
    public Integer vulLaterSum;

    @NameInMap("VulNntfSum")
    public Integer vulNntfSum;

    public static GetVulStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVulStatisticsResponseBody self = new GetVulStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVulStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVulStatisticsResponseBody setVulAsapSum(Integer vulAsapSum) {
        this.vulAsapSum = vulAsapSum;
        return this;
    }
    public Integer getVulAsapSum() {
        return this.vulAsapSum;
    }

    public GetVulStatisticsResponseBody setVulLaterSum(Integer vulLaterSum) {
        this.vulLaterSum = vulLaterSum;
        return this;
    }
    public Integer getVulLaterSum() {
        return this.vulLaterSum;
    }

    public GetVulStatisticsResponseBody setVulNntfSum(Integer vulNntfSum) {
        this.vulNntfSum = vulNntfSum;
        return this;
    }
    public Integer getVulNntfSum() {
        return this.vulNntfSum;
    }

}
