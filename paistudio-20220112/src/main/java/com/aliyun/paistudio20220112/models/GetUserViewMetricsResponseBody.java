// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetUserViewMetricsResponseBody extends TeaModel {
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Summary")
    public UserViewMetric summary;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("UserMetrics")
    public java.util.List<UserViewMetric> userMetrics;

    public static GetUserViewMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserViewMetricsResponseBody self = new GetUserViewMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserViewMetricsResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetUserViewMetricsResponseBody setSummary(UserViewMetric summary) {
        this.summary = summary;
        return this;
    }
    public UserViewMetric getSummary() {
        return this.summary;
    }

    public GetUserViewMetricsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public GetUserViewMetricsResponseBody setUserMetrics(java.util.List<UserViewMetric> userMetrics) {
        this.userMetrics = userMetrics;
        return this;
    }
    public java.util.List<UserViewMetric> getUserMetrics() {
        return this.userMetrics;
    }

}
