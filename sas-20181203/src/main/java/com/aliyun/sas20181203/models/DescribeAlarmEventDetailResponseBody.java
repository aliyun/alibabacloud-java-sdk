// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAlarmEventDetailResponseBody extends TeaModel {
    // The details about the alert event.
    @NameInMap("Data")
    public DescribeAlarmEventDetailResponseBodyData data;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAlarmEventDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmEventDetailResponseBody self = new DescribeAlarmEventDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmEventDetailResponseBody setData(DescribeAlarmEventDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAlarmEventDetailResponseBodyData getData() {
        return this.data;
    }

    public DescribeAlarmEventDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAlarmEventDetailResponseBodyDataCauseDetailsValue extends TeaModel {
        // The name of the field that displays tracing information.
        @NameInMap("Name")
        public String name;

        // The type of the field that displays tracing information. Valid values:
        // 
        // *   **text**
        // *   **html**
        @NameInMap("Type")
        public String type;

        // The value of the field that displays tracing information.
        @NameInMap("Value")
        public String value;

        public static DescribeAlarmEventDetailResponseBodyDataCauseDetailsValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmEventDetailResponseBodyDataCauseDetailsValue self = new DescribeAlarmEventDetailResponseBodyDataCauseDetailsValue();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmEventDetailResponseBodyDataCauseDetailsValue setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAlarmEventDetailResponseBodyDataCauseDetailsValue setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAlarmEventDetailResponseBodyDataCauseDetailsValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAlarmEventDetailResponseBodyDataCauseDetails extends TeaModel {
        // The key that is used to trace the alert event.
        @NameInMap("Key")
        public String key;

        // An array consisting of the value that is used to trace the alert event.
        @NameInMap("Value")
        public java.util.List<DescribeAlarmEventDetailResponseBodyDataCauseDetailsValue> value;

        public static DescribeAlarmEventDetailResponseBodyDataCauseDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmEventDetailResponseBodyDataCauseDetails self = new DescribeAlarmEventDetailResponseBodyDataCauseDetails();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmEventDetailResponseBodyDataCauseDetails setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAlarmEventDetailResponseBodyDataCauseDetails setValue(java.util.List<DescribeAlarmEventDetailResponseBodyDataCauseDetailsValue> value) {
            this.value = value;
            return this;
        }
        public java.util.List<DescribeAlarmEventDetailResponseBodyDataCauseDetailsValue> getValue() {
            return this.value;
        }

    }

    public static class DescribeAlarmEventDetailResponseBodyData extends TeaModel {
        // The name of the alert event.
        @NameInMap("AlarmEventAliasName")
        public String alarmEventAliasName;

        // The description of the alert event.
        @NameInMap("AlarmEventDesc")
        public String alarmEventDesc;

        // The unique ID of the alert event.
        // 
        // >  To query the details about an alert event, you must specify the unique ID of the alert event. You can call the [DescribeAlarmEventList](~~DescribeAlarmEventList~~) operation to query the unique IDs of alert events.
        @NameInMap("AlarmUniqueInfo")
        public String alarmUniqueInfo;

        // The name of the container application.
        @NameInMap("AppName")
        public String appName;

        // Indicates whether the online handling of the alert event is supported. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("CanBeDealOnLine")
        public Boolean canBeDealOnLine;

        // Indicates whether you can cancel marking the alert event as a false positive. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("CanCancelFault")
        public Boolean canCancelFault;

        // An array consisting of the cause of the alert event, which can be used to trace the alert event.
        @NameInMap("CauseDetails")
        public java.util.List<DescribeAlarmEventDetailResponseBodyDataCauseDetails> causeDetails;

        // Indicates whether the Safeguard Mode For Major Activities mode is enabled.
        @NameInMap("ContainHwMode")
        public Boolean containHwMode;

        // The ID of the container application.
        @NameInMap("ContainerId")
        public String containerId;

        // The ID of the image to which the container belongs.
        @NameInMap("ContainerImageId")
        public String containerImageId;

        // The name of the image to which the container belongs.
        @NameInMap("ContainerImageName")
        public String containerImageName;

        // The data source of the alert event.
        @NameInMap("DataSource")
        public String dataSource;

        // The timestamp when the alert event ends. Unit: milliseconds.
        @NameInMap("EndTime")
        public Long endTime;

        // The name of the instance.
        @NameInMap("InstanceName")
        public String instanceName;

        // The public IP address of the associated instance.
        @NameInMap("InternetIp")
        public String internetIp;

        // The private IP address of the associated instance.
        @NameInMap("IntranetIp")
        public String intranetIp;

        // The ID of the Kubernetes cluster.
        @NameInMap("K8sClusterId")
        public String k8sClusterId;

        // The name of the Kubernetes cluster.
        @NameInMap("K8sClusterName")
        public String k8sClusterName;

        // The namespace of the Kubernetes cluster.
        @NameInMap("K8sNamespace")
        public String k8sNamespace;

        // The ID of the Kubernetes cluster node.
        @NameInMap("K8sNodeId")
        public String k8sNodeId;

        // The name of the Kubernetes cluster node.
        @NameInMap("K8sNodeName")
        public String k8sNodeName;

        // The name of the Kubernetes pod.
        @NameInMap("K8sPodName")
        public String k8sPodName;

        // The severity of the alert event. Valid values:
        // 
        // *   **serious**
        // *   **suspicious**
        // *   **remind**
        @NameInMap("Level")
        public String level;

        // The solution to the alert event.
        @NameInMap("Solution")
        public String solution;

        // The timestamp when the alert event starts. Unit: milliseconds.
        @NameInMap("StartTime")
        public Long startTime;

        // The alert type of the alert event. Valid values:
        // 
        // *   Suspicious process
        // *   Webshell
        // *   Unusual logon
        // *   Exception
        // *   Sensitive file tampering
        // *   Malicious process (cloud threat detection)
        // *   Suspicious network connection
        // *   Other
        // *   Abnormal account
        // *   Application intrusion event
        // *   Cloud threat detection
        // *   Precise defense
        // *   Application whitelist
        // *   Persistent webshell
        // *   Web application threat detection
        // *   Malicious script
        // *   Threat intelligence
        // *   Malicious network activity
        // *   Cluster exception
        // *   Webshell (on-premises threat detection)
        // *   Vulnerability exploitation
        // *   Malicious process (on-premises threat detection)
        // *   Trusted exception
        @NameInMap("Type")
        public String type;

        // The instance UUID of the asset.
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeAlarmEventDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmEventDetailResponseBodyData self = new DescribeAlarmEventDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmEventDetailResponseBodyData setAlarmEventAliasName(String alarmEventAliasName) {
            this.alarmEventAliasName = alarmEventAliasName;
            return this;
        }
        public String getAlarmEventAliasName() {
            return this.alarmEventAliasName;
        }

        public DescribeAlarmEventDetailResponseBodyData setAlarmEventDesc(String alarmEventDesc) {
            this.alarmEventDesc = alarmEventDesc;
            return this;
        }
        public String getAlarmEventDesc() {
            return this.alarmEventDesc;
        }

        public DescribeAlarmEventDetailResponseBodyData setAlarmUniqueInfo(String alarmUniqueInfo) {
            this.alarmUniqueInfo = alarmUniqueInfo;
            return this;
        }
        public String getAlarmUniqueInfo() {
            return this.alarmUniqueInfo;
        }

        public DescribeAlarmEventDetailResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAlarmEventDetailResponseBodyData setCanBeDealOnLine(Boolean canBeDealOnLine) {
            this.canBeDealOnLine = canBeDealOnLine;
            return this;
        }
        public Boolean getCanBeDealOnLine() {
            return this.canBeDealOnLine;
        }

        public DescribeAlarmEventDetailResponseBodyData setCanCancelFault(Boolean canCancelFault) {
            this.canCancelFault = canCancelFault;
            return this;
        }
        public Boolean getCanCancelFault() {
            return this.canCancelFault;
        }

        public DescribeAlarmEventDetailResponseBodyData setCauseDetails(java.util.List<DescribeAlarmEventDetailResponseBodyDataCauseDetails> causeDetails) {
            this.causeDetails = causeDetails;
            return this;
        }
        public java.util.List<DescribeAlarmEventDetailResponseBodyDataCauseDetails> getCauseDetails() {
            return this.causeDetails;
        }

        public DescribeAlarmEventDetailResponseBodyData setContainHwMode(Boolean containHwMode) {
            this.containHwMode = containHwMode;
            return this;
        }
        public Boolean getContainHwMode() {
            return this.containHwMode;
        }

        public DescribeAlarmEventDetailResponseBodyData setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public DescribeAlarmEventDetailResponseBodyData setContainerImageId(String containerImageId) {
            this.containerImageId = containerImageId;
            return this;
        }
        public String getContainerImageId() {
            return this.containerImageId;
        }

        public DescribeAlarmEventDetailResponseBodyData setContainerImageName(String containerImageName) {
            this.containerImageName = containerImageName;
            return this;
        }
        public String getContainerImageName() {
            return this.containerImageName;
        }

        public DescribeAlarmEventDetailResponseBodyData setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public DescribeAlarmEventDetailResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeAlarmEventDetailResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeAlarmEventDetailResponseBodyData setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeAlarmEventDetailResponseBodyData setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeAlarmEventDetailResponseBodyData setK8sClusterId(String k8sClusterId) {
            this.k8sClusterId = k8sClusterId;
            return this;
        }
        public String getK8sClusterId() {
            return this.k8sClusterId;
        }

        public DescribeAlarmEventDetailResponseBodyData setK8sClusterName(String k8sClusterName) {
            this.k8sClusterName = k8sClusterName;
            return this;
        }
        public String getK8sClusterName() {
            return this.k8sClusterName;
        }

        public DescribeAlarmEventDetailResponseBodyData setK8sNamespace(String k8sNamespace) {
            this.k8sNamespace = k8sNamespace;
            return this;
        }
        public String getK8sNamespace() {
            return this.k8sNamespace;
        }

        public DescribeAlarmEventDetailResponseBodyData setK8sNodeId(String k8sNodeId) {
            this.k8sNodeId = k8sNodeId;
            return this;
        }
        public String getK8sNodeId() {
            return this.k8sNodeId;
        }

        public DescribeAlarmEventDetailResponseBodyData setK8sNodeName(String k8sNodeName) {
            this.k8sNodeName = k8sNodeName;
            return this;
        }
        public String getK8sNodeName() {
            return this.k8sNodeName;
        }

        public DescribeAlarmEventDetailResponseBodyData setK8sPodName(String k8sPodName) {
            this.k8sPodName = k8sPodName;
            return this;
        }
        public String getK8sPodName() {
            return this.k8sPodName;
        }

        public DescribeAlarmEventDetailResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeAlarmEventDetailResponseBodyData setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
        }

        public DescribeAlarmEventDetailResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeAlarmEventDetailResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAlarmEventDetailResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
