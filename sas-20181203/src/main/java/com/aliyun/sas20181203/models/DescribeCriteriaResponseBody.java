// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCriteriaResponseBody extends TeaModel {
    /**
     * <p>List of asset query condition information.</p>
     */
    @NameInMap("CriteriaList")
    public java.util.List<DescribeCriteriaResponseBodyCriteriaList> criteriaList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>8E6DDACF-99AF-5939-AFFD-FCCD3B01E724</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCriteriaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCriteriaResponseBody self = new DescribeCriteriaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCriteriaResponseBody setCriteriaList(java.util.List<DescribeCriteriaResponseBodyCriteriaList> criteriaList) {
        this.criteriaList = criteriaList;
        return this;
    }
    public java.util.List<DescribeCriteriaResponseBodyCriteriaList> getCriteriaList() {
        return this.criteriaList;
    }

    public DescribeCriteriaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCriteriaResponseBodyCriteriaList extends TeaModel {
        /**
         * <p>The structured attribute values of the assets that match the keyword. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>vendor</strong>: providers.</li>
         * <li><strong>regionIds</strong>: IDs of supported regions</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;vendor&quot;:0,&quot;regionIds&quot;:{&quot;default&quot;:[&quot;ap-southeast-1&quot;,&quot;ap-northeast-2&quot;,&quot;ap-southeast-3&quot;,&quot;ap-southeast-5&quot;,&quot;ap-southeast-7&quot;,&quot;me-central-1&quot;]}},{&quot;vendor&quot;:1,&quot;regionIds&quot;:{&quot;default&quot;:[&quot;outside-of-aliyun&quot;]}}]</p>
         */
        @NameInMap("MultiValues")
        public String multiValues;

        /**
         * <p>The name of the search condition. Valid values:</p>
         * <ul>
         * <li><strong>internetIp</strong>: Public IP Address. </li>
         * <li><strong>intranetIp</strong>: Private IP Address.</li>
         * <li><strong>instanceName</strong>: Instance Name.</li>
         * <li><strong>instanceId</strong>: Instance ID. </li>
         * <li><strong>machineType</strong>: Instance Type. </li>
         * <li><strong>clusterIdList</strong>: Cluster ID list. </li>
         * <li><strong>vpcInstanceId</strong>: VPC ID. </li>
         * <li><strong>osName</strong>: OS. </li>
         * <li><strong>osType</strong>: OS type. </li>
         * <li><strong>hcStatus</strong>: Whether Baseline Risk Exists. </li>
         * <li><strong>vulStatus</strong>: Whether Vulnerability Exists. </li>
         * <li><strong>asapVulStatus</strong>: Whether there is an urgent vulnerability. </li>
         * <li><strong>alarmStatus</strong>: Whether Alert Exists. </li>
         * <li><strong>riskStatus</strong>: Whether there is a risk. </li>
         * <li><strong>clientStatus</strong>: Whether it is online. </li>
         * <li><strong>clientSubStatus</strong>: Client sub-status. </li>
         * <li><strong>runningStatus</strong>: Power-on status. </li>
         * <li><strong>tagName</strong>: Tag name. </li>
         * <li><strong>vendorAuthAlias</strong>: Authorized account remarks. </li>
         * <li><strong>vendorUid</strong>: Authorized account ID. </li>
         * <li><strong>vendorUserName</strong>: Authorized account name. </li>
         * <li><strong>namespace</strong>: Namespace. </li>
         * <li><strong>appName</strong>: Application name. </li>
         * <li><strong>groupName</strong>: Group name. </li>
         * <li><strong>regionId</strong>: Region. </li>
         * <li><strong>groupId</strong>: Group ID. </li>
         * <li><strong>newInstance</strong>: Whether it is a new asset. </li>
         * <li><strong>containerStatus</strong>: Whether there is a container. </li>
         * <li><strong>importance</strong>: Asset importance. </li>
         * <li><strong>exposedStatus</strong>: Whether it is an exposed server. </li>
         * <li><strong>clusterId</strong>: Cluster ID. </li>
         * <li><strong>authVersion</strong>: Authorization version. </li>
         * <li><strong>flag</strong>: Cloud provider. </li>
         * <li><strong>ipList</strong>: IP list. </li>
         * <li><strong>uuidList</strong>: UUID. </li>
         * <li><strong>aiStatus</strong>: Whether there is an AI component. </li>
         * <li><strong>tagKeyValue</strong>: ECS tag. </li>
         * <li><strong>ecsType</strong>: Server type. </li>
         * <li><strong>alisecguardStatus</strong>: Self-protection status. </li>
         * <li><strong>alihipsStatus</strong>: AliHips status. </li>
         * <li><strong>alinetStatus</strong>: AliNet status. </li>
         * <li><strong>alidetectStatus</strong>: Endpoint engine status. </li>
         * <li><strong>yundunMonitorStatus</strong>: Information collection component status. </li>
         * <li><strong>clusterNodeStatus</strong>: Whether it is a cluster node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>internetIp</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the search condition. Valid values:</p>
         * <ul>
         * <li><strong>input</strong>: The search condition needs to be specified.</li>
         * <li><strong>select</strong>: The search condition is an option that can be selected from the drop-down list.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>input</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The attribute values of the assets that match the keyword.</p>
         * <blockquote>
         * <ul>
         * <li>When <strong>Name</strong> is <strong>machineType</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>38</strong>: Elastic Container Instance. </li>
         * <li><strong>51</strong>: RunD Container Instance. </li>
         * <li><strong>52</strong>: RunC Container Instance.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>When <strong>Name</strong> is <strong>osType</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>linux</strong>: Linux. </li>
         * <li><strong>windows</strong>: Windows.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>When <strong>Name</strong> is <strong>hcStatus</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>NO</strong>: No. </li>
         * <li><strong>YES</strong>: Yes.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>When <strong>Name</strong> is <strong>vulStatus</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>NO</strong>: No. </li>
         * <li><strong>YES</strong>: Yes.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>When <strong>Name</strong> is <strong>asapVulStatus</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>NO</strong>: No.</li>
         * <li><strong>YES</strong>: Yes.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>When <strong>Name</strong> is <strong>alarmStatus</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>NO</strong>: No. </li>
         * <li><strong>YES</strong>: Yes.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>When <strong>Name</strong> is <strong>riskStatus</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>NO</strong>: No. </li>
         * <li><strong>YES</strong>: Yes. </li>
         * <li><strong>UNKNOWN</strong>: Unknown.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>When <strong>Name</strong> is <strong>clientStatus</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>online</strong>: Online. </li>
         * <li><strong>offline</strong>: Offline. </li>
         * <li><strong>pause</strong>: Protection Suspended.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>When <strong>Name</strong> is <strong>clientSubStatus</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>online</strong>: Online. </li>
         * <li><strong>offline</strong>: Offline. </li>
         * <li><strong>pause</strong>: Protection Suspended. </li>
         * <li><strong>stopped</strong>: Server Shutdown. </li>
         * <li><strong>uninstalled</strong>: Not Installed.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>When <strong>Name</strong> is <strong>runningStatus</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>Running</strong>: On. </li>
         * <li><strong>notRunning</strong>: Off. </li>
         * <li><strong>UNKNOWN</strong>: Unknown.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>When <strong>Name</strong> is <strong>importance</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>important</strong>: Important. </li>
         * <li><strong>general</strong>: Normal. </li>
         * <li><strong>test</strong>: Test.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>When <strong>Name</strong> is <strong>containerStatus</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>NO</strong>: No. </li>
         * <li><strong>YES</strong>: Yes.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>When <strong>Name</strong> is <strong>exposedStatus</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>NO</strong>: No. </li>
         * <li><strong>YES</strong>: Yes.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>When <strong>Name</strong> is <strong>authVersion</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>1</strong>: Basic. </li>
         * <li><strong>3</strong>: Enterprise. </li>
         * <li><strong>5</strong>: Advanced.</li>
         * <li><strong>6</strong>: Anti-virus. </li>
         * <li><strong>7</strong>: Ultimate.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>When <strong>Name</strong> is <strong>flag</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>0|8|15</strong>: Alibaba Cloud. </li>
         * <li><strong>1</strong>: External Host. </li>
         * <li><strong>2</strong>: IDC. </li>
         * <li><strong>3</strong>: Tencent Cloud. </li>
         * <li><strong>4</strong>: Huawei Cloud. </li>
         * <li><strong>5</strong>: Azure. </li>
         * <li><strong>7</strong>: AWS. </li>
         * <li><strong>9</strong>: SAE. </li>
         * <li><strong>10</strong>: PAI. </li>
         * <li><strong>13</strong>: ACS. </li>
         * <li><strong>14</strong>: Volcano Cloud. </li>
         * <li><strong>16</strong>: Google Cloud.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>When <strong>Name</strong> is <strong>aiStatus</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>NO</strong>: No. </li>
         * <li><strong>YES</strong>: Yes.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>When <strong>Name</strong> is <strong>ecsType</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>8</strong>: Simple Application Server. </li>
         * <li><strong>11</strong>: LINGJUN GPU-accelerated Bare Metal Instance. </li>
         * <li><strong>15</strong>: RDS Custom. </li>
         * <li><strong>!8</strong>: Host.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>When <strong>Name</strong> is <strong>alisecguardStatus</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>0</strong>: Plug-in Online. </li>
         * <li><strong>1</strong>: Plug-in Disabled. </li>
         * <li><strong>2</strong>: Plug-in Offline. </li>
         * <li><strong>-99</strong>: The installation failed.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>When <strong>Name</strong> is <strong>alihipsStatus</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>0</strong>: Plug-in Online. </li>
         * <li><strong>1</strong>: Plug-in Disabled. </li>
         * <li><strong>2</strong>: Plug-in Offline. </li>
         * <li><strong>-99</strong>: The installation failed.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>When <strong>Name</strong> is <strong>alinetStatus</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>0</strong>: Plug-in Online. </li>
         * <li><strong>1</strong>: Plug-in Disabled. </li>
         * <li><strong>2</strong>: Plug-in Offline. </li>
         * <li><strong>-99</strong>: The installation failed.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>When <strong>Name</strong> is <strong>alidetectStatus</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>0</strong>: Plug-in Online. </li>
         * <li><strong>1</strong>: Plug-in Disabled. </li>
         * <li><strong>2</strong>: Plug-in Offline. </li>
         * <li><strong>-99</strong>: The installation failed.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>When <strong>Name</strong> is <strong>yundunMonitorStatus</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>0</strong>: Plug-in Online. </li>
         * <li><strong>1</strong>: Plug-in Disabled. </li>
         * <li><strong>2</strong>: Plug-in Offline. </li>
         * <li><strong>-99</strong>: The installation failed.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>When <strong>Name</strong> is <strong>clusterNodeStatus</strong>, the enum values are: <blockquote>
         * <ul>
         * <li><strong>false</strong>: No. </li>
         * <li><strong>true</strong>: Yes.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>47.96.XX.XX</p>
         */
        @NameInMap("Values")
        public String values;

        public static DescribeCriteriaResponseBodyCriteriaList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCriteriaResponseBodyCriteriaList self = new DescribeCriteriaResponseBodyCriteriaList();
            return TeaModel.build(map, self);
        }

        public DescribeCriteriaResponseBodyCriteriaList setMultiValues(String multiValues) {
            this.multiValues = multiValues;
            return this;
        }
        public String getMultiValues() {
            return this.multiValues;
        }

        public DescribeCriteriaResponseBodyCriteriaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCriteriaResponseBodyCriteriaList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCriteriaResponseBodyCriteriaList setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

}
