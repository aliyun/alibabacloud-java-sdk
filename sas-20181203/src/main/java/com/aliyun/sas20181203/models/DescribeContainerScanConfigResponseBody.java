// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerScanConfigResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public DescribeContainerScanConfigResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>69BFFCDE-37D6-5A49-A8BC-BB03AC83****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeContainerScanConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerScanConfigResponseBody self = new DescribeContainerScanConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerScanConfigResponseBody setData(DescribeContainerScanConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeContainerScanConfigResponseBodyData getData() {
        return this.data;
    }

    public DescribeContainerScanConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeContainerScanConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeContainerScanConfigResponseBodyData extends TeaModel {
        /**
         * <p>The total number of container applications in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AllCount")
        public Integer allCount;

        /**
         * <p>The names of the container applications.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;alicloud-monitor-controller\&quot;]</p>
         */
        @NameInMap("AppNames")
        public String appNames;

        /**
         * <p>The number of selected container applications.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ChooseCount")
        public Integer chooseCount;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c8ca91e0907d94efaba7fb0827eb9****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>hhht-cluster-02</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        public static DescribeContainerScanConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerScanConfigResponseBodyData self = new DescribeContainerScanConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeContainerScanConfigResponseBodyData setAllCount(Integer allCount) {
            this.allCount = allCount;
            return this;
        }
        public Integer getAllCount() {
            return this.allCount;
        }

        public DescribeContainerScanConfigResponseBodyData setAppNames(String appNames) {
            this.appNames = appNames;
            return this;
        }
        public String getAppNames() {
            return this.appNames;
        }

        public DescribeContainerScanConfigResponseBodyData setChooseCount(Integer chooseCount) {
            this.chooseCount = chooseCount;
            return this;
        }
        public Integer getChooseCount() {
            return this.chooseCount;
        }

        public DescribeContainerScanConfigResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeContainerScanConfigResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

    }

}
