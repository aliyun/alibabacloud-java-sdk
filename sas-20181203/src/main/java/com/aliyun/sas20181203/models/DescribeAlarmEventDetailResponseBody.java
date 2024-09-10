// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAlarmEventDetailResponseBody extends TeaModel {
    /**
     * <p>The details of the alert event.</p>
     */
    @NameInMap("Data")
    public DescribeAlarmEventDetailResponseBodyData data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7EA50837-2F0B-5BCC-AB61-4968D88D75AD</p>
     */
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
        /**
         * <p>The name of the field that displays the tracing information.</p>
         * 
         * <strong>example:</strong>
         * <p>sshd</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the field that displays the tracing information. Valid values:</p>
         * <ul>
         * <li><strong>text</strong></li>
         * <li><strong>html</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>html</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the field that displays the tracing information.</p>
         * 
         * <strong>example:</strong>
         * <p>under a certain small probability, yundun may mistakenly judge the repeated attempts caused by the administrator forgetting or entering the wrong password as successful blasting. Please check according to the account number and time shown in the alarm details. Once it is confirmed that it is not the initiative of the administrator, it is recommended to immediately block the IP, and you can open it at the same time<a href="https://yundun.console.aliyun.com/?p=pam">PAM</a>, hosting host login password, improving remote connection efficiency and security control ability, and according to<a href="https://click.aliyun.com/m/1000226086/">best practice of ECS account security protection</a>Modify login password and convergence asset.</p>↵
         */
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
        /**
         * <p>The key that is used to trace the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>842e314e69b1a2c45d5c1a2f88a16***</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value that is used to trace the alert event.</p>
         */
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
        /**
         * <p>The name of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>Login with unusual location</p>
         */
        @NameInMap("AlarmEventAliasName")
        public String alarmEventAliasName;

        /**
         * <p>The description of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>The detection model finds that self-mutation is running on your server. A self-mutation Trojan is a Trojan horse program with self-mutation function. It will change its hash or copy a large number of itself to different paths, and run in the background to avoid cleaning.</p>
         */
        @NameInMap("AlarmEventDesc")
        public String alarmEventDesc;

        /**
         * <p>The unique identifier of the alert event.</p>
         * <blockquote>
         * <p>To query the details of an alert event, you must provide the unique identifier of the alert event. You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to obtain the identifier.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>9f62555666f177aa84ee1eaf465a****</p>
         */
        @NameInMap("AlarmUniqueInfo")
        public String alarmUniqueInfo;

        /**
         * <p>The name of the container application.</p>
         * 
         * <strong>example:</strong>
         * <p>app:msdp-uat-service</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>Indicates whether the online handling of the alert event is supported. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanBeDealOnLine")
        public Boolean canBeDealOnLine;

        /**
         * <p>Indicates whether you can cancel marking the alert event as a false positive. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanCancelFault")
        public Boolean canCancelFault;

        /**
         * <p>An array consisting of the cause of the alert event, which can be used to trace the alert event.</p>
         */
        @NameInMap("CauseDetails")
        public java.util.List<DescribeAlarmEventDetailResponseBodyDataCauseDetails> causeDetails;

        /**
         * <p>Indicates whether the Safeguard Mode For Major Activities mode is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ContainHwMode")
        public Boolean containHwMode;

        /**
         * <p>The ID of the container application.</p>
         * 
         * <strong>example:</strong>
         * <p>container_1606995441910_394868_01_000***</p>
         */
        @NameInMap("ContainerId")
        public String containerId;

        /**
         * <p>The ID of the image to which the container belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cadb7a725641</p>
         */
        @NameInMap("ContainerImageId")
        public String containerImageId;

        /**
         * <p>The name of the image to which the container belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>jenkins/jenkins:latest</p>
         */
        @NameInMap("ContainerImageName")
        public String containerImageName;

        /**
         * <p>The data source of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>aegis_***</p>
         */
        @NameInMap("DataSource")
        public String dataSource;

        /**
         * <p>The timestamp when the alert event ends. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1542366542000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz92q7m5hsbgfhdss***</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the associated instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the associated instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.25.30.**</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The ID of the Kubernetes cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c562cf0d68e9749ee9fe544a7ab2f****</p>
         */
        @NameInMap("K8sClusterId")
        public String k8sClusterId;

        /**
         * <p>The name of the Kubernetes cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>TestK8sCluser</p>
         */
        @NameInMap("K8sClusterName")
        public String k8sClusterName;

        /**
         * <p>The namespace of the Kubernetes cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>sit-saic-trip</p>
         */
        @NameInMap("K8sNamespace")
        public String k8sNamespace;

        /**
         * <p>The ID of the Kubernetes cluster node.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp14a1ay8e0aa9t0l***</p>
         */
        @NameInMap("K8sNodeId")
        public String k8sNodeId;

        /**
         * <p>The name of the Kubernetes cluster node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou.10.188.139.**</p>
         */
        @NameInMap("K8sNodeName")
        public String k8sNodeName;

        /**
         * <p>The name of the Kubernetes pod.</p>
         * 
         * <strong>example:</strong>
         * <p>myapp-pod</p>
         */
        @NameInMap("K8sPodName")
        public String k8sPodName;

        /**
         * <p>The severity of the alert event. Valid values:</p>
         * <ul>
         * <li><strong>serious</strong></li>
         * <li><strong>suspicious</strong></li>
         * <li><strong>remind</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>serious</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The solution to the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>An invalid logon source IP has been detected. If you recognize this logon attempt, we recommend that you add the current logon source IP to the valid logon source IP list to avoid future alerts. If you do not recognize this logon attempt, we recommend that you modify the password.</p>
         */
        @NameInMap("Solution")
        public String solution;

        /**
         * <p>The timestamp when the alert event starts. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1542378601000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The alert type of the alert event. Valid values:</p>
         * <ul>
         * <li>Suspicious process</li>
         * <li>Webshell</li>
         * <li>Unusual logon</li>
         * <li>Exception</li>
         * <li>Sensitive file tampering</li>
         * <li>Malicious process (cloud threat detection)</li>
         * <li>Suspicious network connection</li>
         * <li>Other</li>
         * <li>Abnormal account</li>
         * <li>Application intrusion event</li>
         * <li>Cloud threat detection</li>
         * <li>Precise defense</li>
         * <li>Application whitelist</li>
         * <li>Persistent webshell</li>
         * <li>Web application threat detection</li>
         * <li>Malicious script</li>
         * <li>Threat intelligence</li>
         * <li>Malicious network activity</li>
         * <li>Cluster exception</li>
         * <li>Webshell (on-premises threat detection)</li>
         * <li>Vulnerability exploitation</li>
         * <li>Malicious process (on-premises threat detection)</li>
         * <li>Trusted exception</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Webshell</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The instance UUID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>6690a46c-0edb-4663-a641-3629d1a9****</p>
         */
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
