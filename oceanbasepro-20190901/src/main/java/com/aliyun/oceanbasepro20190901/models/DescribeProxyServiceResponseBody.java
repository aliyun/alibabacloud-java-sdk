// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeProxyServiceResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeProxyServiceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeProxyServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProxyServiceResponseBody self = new DescribeProxyServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProxyServiceResponseBody setData(DescribeProxyServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeProxyServiceResponseBodyData getData() {
        return this.data;
    }

    public DescribeProxyServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeProxyServiceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-07-05T08:23:10Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentEndpointNum")
        public Long currentEndpointNum;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("EndpointNumQuota")
        public Long endpointNumQuota;

        /**
         * <strong>example:</strong>
         * <p>2123-07-05T16:00:00</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>proxy-3t****zrieasg</p>
         */
        @NameInMap("ProxyClusterId")
        public String proxyClusterId;

        /**
         * <strong>example:</strong>
         * <p>shared</p>
         */
        @NameInMap("ProxyMode")
        public String proxyMode;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("ProxyServiceVersion")
        public String proxyServiceVersion;

        /**
         * <strong>example:</strong>
         * <p>4.3.1.0-xxxxxxxxx</p>
         */
        @NameInMap("ProxyVersion")
        public String proxyVersion;

        /**
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UnitNum")
        public Long unitNum;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("UnitNumLimit")
        public Long unitNumLimit;

        /**
         * <strong>example:</strong>
         * <p>4C8GB</p>
         */
        @NameInMap("UnitSpec")
        public String unitSpec;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai-e,cn-shanghai-f</p>
         */
        @NameInMap("Zone")
        public String zone;

        public static DescribeProxyServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeProxyServiceResponseBodyData self = new DescribeProxyServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeProxyServiceResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeProxyServiceResponseBodyData setCurrentEndpointNum(Long currentEndpointNum) {
            this.currentEndpointNum = currentEndpointNum;
            return this;
        }
        public Long getCurrentEndpointNum() {
            return this.currentEndpointNum;
        }

        public DescribeProxyServiceResponseBodyData setEndpointNumQuota(Long endpointNumQuota) {
            this.endpointNumQuota = endpointNumQuota;
            return this;
        }
        public Long getEndpointNumQuota() {
            return this.endpointNumQuota;
        }

        public DescribeProxyServiceResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeProxyServiceResponseBodyData setProxyClusterId(String proxyClusterId) {
            this.proxyClusterId = proxyClusterId;
            return this;
        }
        public String getProxyClusterId() {
            return this.proxyClusterId;
        }

        public DescribeProxyServiceResponseBodyData setProxyMode(String proxyMode) {
            this.proxyMode = proxyMode;
            return this;
        }
        public String getProxyMode() {
            return this.proxyMode;
        }

        public DescribeProxyServiceResponseBodyData setProxyServiceVersion(String proxyServiceVersion) {
            this.proxyServiceVersion = proxyServiceVersion;
            return this;
        }
        public String getProxyServiceVersion() {
            return this.proxyServiceVersion;
        }

        public DescribeProxyServiceResponseBodyData setProxyVersion(String proxyVersion) {
            this.proxyVersion = proxyVersion;
            return this;
        }
        public String getProxyVersion() {
            return this.proxyVersion;
        }

        public DescribeProxyServiceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeProxyServiceResponseBodyData setUnitNum(Long unitNum) {
            this.unitNum = unitNum;
            return this;
        }
        public Long getUnitNum() {
            return this.unitNum;
        }

        public DescribeProxyServiceResponseBodyData setUnitNumLimit(Long unitNumLimit) {
            this.unitNumLimit = unitNumLimit;
            return this;
        }
        public Long getUnitNumLimit() {
            return this.unitNumLimit;
        }

        public DescribeProxyServiceResponseBodyData setUnitSpec(String unitSpec) {
            this.unitSpec = unitSpec;
            return this;
        }
        public String getUnitSpec() {
            return this.unitSpec;
        }

        public DescribeProxyServiceResponseBodyData setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
