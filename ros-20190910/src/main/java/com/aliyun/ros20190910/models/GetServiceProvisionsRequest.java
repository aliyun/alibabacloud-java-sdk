// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetServiceProvisionsRequest extends TeaModel {
    /**
     * <p>The parameters.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<GetServiceProvisionsRequestParameters> parameters;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of Alibaba Cloud services.</p>
     */
    @NameInMap("Services")
    public java.util.List<GetServiceProvisionsRequestServices> services;

    /**
     * <p>The structure of the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body exceeds the upper limit, we recommend to use the HTTP POST + Body Param method to pass the parameter in the request body to avoid request failures caused by an excessively long URL.</p>
     * <blockquote>
     * <p>You can specify only one of the TemplateBody, TemplateURL, TemplateId, and Services parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ROSTemplateFormatVersion: \&quot;2015-09-01\&quot;\r\nResources:\r\n  Vpc:\r\n    Type: ALIYUN::ECS::VPC\r\n    Properties:\r\n      CidrBlock: 192.168.0.0/24\r\n      VpcName: TestVpc</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The template ID. This parameter applies to shared and private templates.</p>
     * <p>You can specify only one of the TemplateBody, TemplateURL, TemplateId, and Services parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket. The template body must be 1 to 524,288 bytes in length. Examples of OSS URLs: oss\://ros/template/demo and oss\://ros/template/demo?RegionId=cn-hangzhou. If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.</p>
     * <p>You can specify only one of the TemplateBody, TemplateURL, TemplateId, and Services parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://ros-template/demo</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version of the template. If you do not specify this parameter, the latest version is used.</p>
     * <p>This parameter takes effect only when you specify TemplateId.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static GetServiceProvisionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceProvisionsRequest self = new GetServiceProvisionsRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceProvisionsRequest setParameters(java.util.List<GetServiceProvisionsRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<GetServiceProvisionsRequestParameters> getParameters() {
        return this.parameters;
    }

    public GetServiceProvisionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetServiceProvisionsRequest setServices(java.util.List<GetServiceProvisionsRequestServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<GetServiceProvisionsRequestServices> getServices() {
        return this.services;
    }

    public GetServiceProvisionsRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public GetServiceProvisionsRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetServiceProvisionsRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public GetServiceProvisionsRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static class GetServiceProvisionsRequestParameters extends TeaModel {
        /**
         * <p>The name of the parameter. If you do not specify the name and value of a parameter, Resource Orchestration Service (ROS) uses the default name and value that are specified in the template.</p>
         * <blockquote>
         * <p>Parameters is optional. If you specify Parameters, you must specify ParameterKey.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Amount</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the parameter.</p>
         * <blockquote>
         * <p>Parameters is optional. If you specify Parameters, you must specify ParameterValue.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static GetServiceProvisionsRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetServiceProvisionsRequestParameters self = new GetServiceProvisionsRequestParameters();
            return TeaModel.build(map, self);
        }

        public GetServiceProvisionsRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetServiceProvisionsRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class GetServiceProvisionsRequestServices extends TeaModel {
        /**
         * <p>The name of the Alibaba Cloud service. Valid values:</p>
         * <ul>
         * <li><p>AHAS: Application High Availability Service.</p>
         * </li>
         * <li><p>ARMS: Application Real-Time Monitoring Service.</p>
         * </li>
         * <li><p>ApiGateway: API Gateway.</p>
         * </li>
         * <li><p>BatchCompute: Batch Compute.</p>
         * </li>
         * <li><p>BrainIndustrial: Industrial Intelligence.</p>
         * </li>
         * <li><p>CloudStorageGateway: Cloud Storage Gateway.</p>
         * </li>
         * <li><p>CMS: Cloud Monitor.</p>
         * </li>
         * <li><p>CR: Container Registry.</p>
         * </li>
         * <li><p>CS: Container Service.</p>
         * </li>
         * <li><p>DCDN: DCDN.</p>
         * </li>
         * <li><p>DataHub: DataHub.</p>
         * </li>
         * <li><p>DataWorks: DataWorks.</p>
         * </li>
         * <li><p>EDAS: Enterprise Distributed Application Service.</p>
         * </li>
         * <li><p>EHPC: Elastic High Performance Computing.</p>
         * </li>
         * <li><p>EMAS: Enterprise Mobile Application Studio.</p>
         * </li>
         * <li><p>FC: Function Compute.</p>
         * </li>
         * <li><p>FNF: CloudFlow.</p>
         * </li>
         * <li><p>MaxCompute: MaxCompute.</p>
         * </li>
         * <li><p>SMQ: Simple Message Queue (formerly MNS).</p>
         * </li>
         * <li><p>HBR: Cloud Backup.</p>
         * </li>
         * <li><p>IMM: Intelligent Media Management.</p>
         * </li>
         * <li><p>IOT: IoT Platform.</p>
         * </li>
         * <li><p>KMS: Key Management Service.</p>
         * </li>
         * <li><p>NAS: File Storage NAS.</p>
         * </li>
         * <li><p>NLP: Natural Language Processing.</p>
         * </li>
         * <li><p>OSS: Object Storage Service.</p>
         * </li>
         * <li><p>OTS: Tablestore.</p>
         * </li>
         * <li><p>PrivateLink: PrivateLink.</p>
         * </li>
         * <li><p>PrivateZone: PrivateZone.</p>
         * </li>
         * <li><p>RocketMQ: Message Queue for Apache RocketMQ.</p>
         * </li>
         * <li><p>SAE: Serverless App Engine.</p>
         * </li>
         * <li><p>SLS: Simple Log Service.</p>
         * </li>
         * <li><p>TrafficMirror: Traffic Mirroring.</p>
         * </li>
         * <li><p>VS: Video Surveillance.</p>
         * </li>
         * <li><p>Xtrace: Tracing Analysis.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EHPC</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        public static GetServiceProvisionsRequestServices build(java.util.Map<String, ?> map) throws Exception {
            GetServiceProvisionsRequestServices self = new GetServiceProvisionsRequestServices();
            return TeaModel.build(map, self);
        }

        public GetServiceProvisionsRequestServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

}
