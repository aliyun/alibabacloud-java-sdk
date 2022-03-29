// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeManagedServicesResponseBody extends TeaModel {
    @NameInMap("ManagedServiceInfo")
    public java.util.List<DescribeManagedServicesResponseBodyManagedServiceInfo> managedServiceInfo;

    @NameInMap("Mark")
    public String mark;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeManagedServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeManagedServicesResponseBody self = new DescribeManagedServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeManagedServicesResponseBody setManagedServiceInfo(java.util.List<DescribeManagedServicesResponseBodyManagedServiceInfo> managedServiceInfo) {
        this.managedServiceInfo = managedServiceInfo;
        return this;
    }
    public java.util.List<DescribeManagedServicesResponseBodyManagedServiceInfo> getManagedServiceInfo() {
        return this.managedServiceInfo;
    }

    public DescribeManagedServicesResponseBody setMark(String mark) {
        this.mark = mark;
        return this;
    }
    public String getMark() {
        return this.mark;
    }

    public DescribeManagedServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeManagedServicesResponseBodyManagedServiceInfoDeploymentInstances extends TeaModel {
        @NameInMap("ReadyReplicas")
        public Integer readyReplicas;

        @NameInMap("Replicas")
        public Integer replicas;

        @NameInMap("Version")
        public String version;

        public static DescribeManagedServicesResponseBodyManagedServiceInfoDeploymentInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeManagedServicesResponseBodyManagedServiceInfoDeploymentInstances self = new DescribeManagedServicesResponseBodyManagedServiceInfoDeploymentInstances();
            return TeaModel.build(map, self);
        }

        public DescribeManagedServicesResponseBodyManagedServiceInfoDeploymentInstances setReadyReplicas(Integer readyReplicas) {
            this.readyReplicas = readyReplicas;
            return this;
        }
        public Integer getReadyReplicas() {
            return this.readyReplicas;
        }

        public DescribeManagedServicesResponseBodyManagedServiceInfoDeploymentInstances setReplicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        public Integer getReplicas() {
            return this.replicas;
        }

        public DescribeManagedServicesResponseBodyManagedServiceInfoDeploymentInstances setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeManagedServicesResponseBodyManagedServiceInfo extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DeploymentInstances")
        public java.util.List<DescribeManagedServicesResponseBodyManagedServiceInfoDeploymentInstances> deploymentInstances;

        @NameInMap("Message")
        public String message;

        @NameInMap("Selector")
        public java.util.Map<String, String> selector;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("SidecarInjectStatus")
        public String sidecarInjectStatus;

        public static DescribeManagedServicesResponseBodyManagedServiceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeManagedServicesResponseBodyManagedServiceInfo self = new DescribeManagedServicesResponseBodyManagedServiceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeManagedServicesResponseBodyManagedServiceInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeManagedServicesResponseBodyManagedServiceInfo setDeploymentInstances(java.util.List<DescribeManagedServicesResponseBodyManagedServiceInfoDeploymentInstances> deploymentInstances) {
            this.deploymentInstances = deploymentInstances;
            return this;
        }
        public java.util.List<DescribeManagedServicesResponseBodyManagedServiceInfoDeploymentInstances> getDeploymentInstances() {
            return this.deploymentInstances;
        }

        public DescribeManagedServicesResponseBodyManagedServiceInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeManagedServicesResponseBodyManagedServiceInfo setSelector(java.util.Map<String, String> selector) {
            this.selector = selector;
            return this;
        }
        public java.util.Map<String, String> getSelector() {
            return this.selector;
        }

        public DescribeManagedServicesResponseBodyManagedServiceInfo setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DescribeManagedServicesResponseBodyManagedServiceInfo setSidecarInjectStatus(String sidecarInjectStatus) {
            this.sidecarInjectStatus = sidecarInjectStatus;
            return this;
        }
        public String getSidecarInjectStatus() {
            return this.sidecarInjectStatus;
        }

    }

}
