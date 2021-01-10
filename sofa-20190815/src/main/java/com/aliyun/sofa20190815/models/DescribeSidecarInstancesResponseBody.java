// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeSidecarInstancesResponseBody extends TeaModel {
    @NameInMap("TotalCnt")
    public Long totalCnt;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Items")
    public java.util.List<DescribeSidecarInstancesResponseBodyItems> items;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DescribeSidecarInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSidecarInstancesResponseBody self = new DescribeSidecarInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSidecarInstancesResponseBody setTotalCnt(Long totalCnt) {
        this.totalCnt = totalCnt;
        return this;
    }
    public Long getTotalCnt() {
        return this.totalCnt;
    }

    public DescribeSidecarInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSidecarInstancesResponseBody setItems(java.util.List<DescribeSidecarInstancesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeSidecarInstancesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeSidecarInstancesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeSidecarInstancesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DescribeSidecarInstancesResponseBodyItems extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("PodName")
        public String podName;

        @NameInMap("AppServiceName")
        public String appServiceName;

        @NameInMap("SidecarVersion")
        public String sidecarVersion;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("SidecarStatus")
        public String sidecarStatus;

        @NameInMap("SidecarType")
        public String sidecarType;

        @NameInMap("Clustername")
        public String clustername;

        @NameInMap("PodStatus")
        public String podStatus;

        @NameInMap("PodIp")
        public String podIp;

        @NameInMap("Name")
        public String name;

        @NameInMap("CreatedTime")
        public String createdTime;

        public static DescribeSidecarInstancesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSidecarInstancesResponseBodyItems self = new DescribeSidecarInstancesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSidecarInstancesResponseBodyItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSidecarInstancesResponseBodyItems setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public DescribeSidecarInstancesResponseBodyItems setAppServiceName(String appServiceName) {
            this.appServiceName = appServiceName;
            return this;
        }
        public String getAppServiceName() {
            return this.appServiceName;
        }

        public DescribeSidecarInstancesResponseBodyItems setSidecarVersion(String sidecarVersion) {
            this.sidecarVersion = sidecarVersion;
            return this;
        }
        public String getSidecarVersion() {
            return this.sidecarVersion;
        }

        public DescribeSidecarInstancesResponseBodyItems setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeSidecarInstancesResponseBodyItems setSidecarStatus(String sidecarStatus) {
            this.sidecarStatus = sidecarStatus;
            return this;
        }
        public String getSidecarStatus() {
            return this.sidecarStatus;
        }

        public DescribeSidecarInstancesResponseBodyItems setSidecarType(String sidecarType) {
            this.sidecarType = sidecarType;
            return this;
        }
        public String getSidecarType() {
            return this.sidecarType;
        }

        public DescribeSidecarInstancesResponseBodyItems setClustername(String clustername) {
            this.clustername = clustername;
            return this;
        }
        public String getClustername() {
            return this.clustername;
        }

        public DescribeSidecarInstancesResponseBodyItems setPodStatus(String podStatus) {
            this.podStatus = podStatus;
            return this;
        }
        public String getPodStatus() {
            return this.podStatus;
        }

        public DescribeSidecarInstancesResponseBodyItems setPodIp(String podIp) {
            this.podIp = podIp;
            return this;
        }
        public String getPodIp() {
            return this.podIp;
        }

        public DescribeSidecarInstancesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSidecarInstancesResponseBodyItems setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

    }

}
