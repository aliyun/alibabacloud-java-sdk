// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerScanConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeContainerScanConfigResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

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
        @NameInMap("AllCount")
        public Integer allCount;

        @NameInMap("AppNames")
        public String appNames;

        @NameInMap("ChooseCount")
        public Integer chooseCount;

        @NameInMap("ClusterId")
        public String clusterId;

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
