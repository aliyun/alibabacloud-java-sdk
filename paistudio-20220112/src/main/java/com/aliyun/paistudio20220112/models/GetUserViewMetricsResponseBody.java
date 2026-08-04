// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetUserViewMetricsResponseBody extends TeaModel {
    /**
     * <p>资源组ID</p>
     * 
     * <strong>example:</strong>
     * <p>rgf0zhfqn1d4ity2</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>用户监控数据。</p>
     */
    @NameInMap("Summary")
    public UserViewMetric summary;

    /**
     * <p>总条数</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Total")
    public Integer total;

    /**
     * <p>按照用户维度统计的指标</p>
     */
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
