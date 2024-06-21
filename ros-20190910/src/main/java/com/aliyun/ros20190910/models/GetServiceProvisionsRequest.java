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
     * <p>The services.</p>
     */
    @NameInMap("Services")
    public java.util.List<GetServiceProvisionsRequestServices> services;

    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The template ID. This parameter applies to shared and private templates.</p>
     * <p>You must and can specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and Services.</p>
     * 
     * <strong>example:</strong>
     * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=cn-hangzhou. The template body must be 1 to 524,288 bytes in length. If you do not specify the region ID of the OSS bucket, the value of RegionId is used.</p>
     * <p>You must and can specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and Services.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://ros-template/demo</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version of the template. If you do not specify this parameter, the latest version is used.</p>
     * <p>This parameter takes effect only when TemplateId is specified.</p>
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
         * <p>The Parameters parameter is optional. If you specify Parameters, you must specify ParameterKey.</p>
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
         * <p>The Parameters parameter is optional. If you specify Parameters, you must specify ParameterValue.</p>
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
         * <p>The service or feature name. Valid values:</p>
         * <ul>
         * <li>AHAS: Application High Availability Service</li>
         * <li>ARMS: Application Real-Time Monitoring Service (ARMS)</li>
         * <li>ApiGateway: API Gateway</li>
         * <li>BatchCompute: Batch Compute</li>
         * <li>BrainIndustrial: Industrial Brain</li>
         * <li>CloudStorageGateway: Cloud Storage Gateway (CSG)</li>
         * <li>CMS: CloudMonitor</li>
         * <li>CR: Container Registry</li>
         * <li>CS: Container Service for Kubernetes (ACK)</li>
         * <li>DCDN: Dynamic Content Delivery Network (DCDN)</li>
         * <li>DataHub: DataHub</li>
         * <li>DataWorks: DataWorks</li>
         * <li>EDAS: Enterprise Distributed Application Service (EDAS)</li>
         * <li>EHPC: Elastic High Performance Computing (E-HPC)</li>
         * <li>EMAS: Enterprise Mobile Application Studio (EMAS)</li>
         * <li>FC: Function Compute</li>
         * <li>FNF: Serverless Workflow (SWF)</li>
         * <li>MaxCompute: MaxCompute</li>
         * <li>MNS: Message Service (MNS)</li>
         * <li>HBR: Hybrid Backup Recovery (HBR)</li>
         * <li>IMM: Intelligent Media Management</li>
         * <li>IOT: IoT Platform</li>
         * <li>KMS: Key Management Service (KMS)</li>
         * <li>NAS: Apsara File Storage NAS (NAS)</li>
         * <li>NLP: Natural Language Processing (NLP)</li>
         * <li>OSS: OSS</li>
         * <li>OTS: Tablestore</li>
         * <li>PrivateLink: PrivateLink</li>
         * <li>PrivateZone: Alibaba Cloud DNS PrivateZone</li>
         * <li>RocketMQ: ApsaraMQ for RocketMQ</li>
         * <li>SAE: Serverless App Engine (SAE)</li>
         * <li>SLS: Log Service</li>
         * <li>TrafficMirror: the traffic mirroring feature</li>
         * <li>VS: Video Surveillance System</li>
         * <li>Xtrace: Managed Service for OpenTelemetry</li>
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
