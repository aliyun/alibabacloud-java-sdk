// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetNisNetworkMetricsRequest extends TeaModel {
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    /**
     * <strong>example:</strong>
     * <p>1638239092000</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Dimensions")
    public java.util.List<GetNisNetworkMetricsRequestDimensions> dimensions;

    /**
     * <strong>example:</strong>
     * <p>1684373700099</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bps</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AccessInternetIPV4</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>TimestampAscending</p>
     */
    @NameInMap("ScanBy")
    public String scanBy;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseCrossAccount")
    public Boolean useCrossAccount;

    public static GetNisNetworkMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNisNetworkMetricsRequest self = new GetNisNetworkMetricsRequest();
        return TeaModel.build(map, self);
    }

    public GetNisNetworkMetricsRequest setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    public GetNisNetworkMetricsRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetNisNetworkMetricsRequest setDimensions(java.util.List<GetNisNetworkMetricsRequestDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<GetNisNetworkMetricsRequestDimensions> getDimensions() {
        return this.dimensions;
    }

    public GetNisNetworkMetricsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetNisNetworkMetricsRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public GetNisNetworkMetricsRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public GetNisNetworkMetricsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetNisNetworkMetricsRequest setScanBy(String scanBy) {
        this.scanBy = scanBy;
        return this;
    }
    public String getScanBy() {
        return this.scanBy;
    }

    public GetNisNetworkMetricsRequest setUseCrossAccount(Boolean useCrossAccount) {
        this.useCrossAccount = useCrossAccount;
        return this;
    }
    public Boolean getUseCrossAccount() {
        return this.useCrossAccount;
    }

    public static class GetNisNetworkMetricsRequestDimensions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>eip-sample*</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetNisNetworkMetricsRequestDimensions build(java.util.Map<String, ?> map) throws Exception {
            GetNisNetworkMetricsRequestDimensions self = new GetNisNetworkMetricsRequestDimensions();
            return TeaModel.build(map, self);
        }

        public GetNisNetworkMetricsRequestDimensions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetNisNetworkMetricsRequestDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
