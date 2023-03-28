// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetServiceProvisionsRequest extends TeaModel {
    /**
     * <p>The list of parameters.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<GetServiceProvisionsRequestParameters> parameters;

    /**
     * <p>The ID of the region.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The services.</p>
     */
    @NameInMap("Services")
    public java.util.List<GetServiceProvisionsRequestServices> services;

    /**
     * <p>The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.</p>
     * <br>
     * <p>You must specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and Services.N.ServiceName.</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The ID of the template. This parameter applies to shared and private templates.</p>
     * <br>
     * <p>You must specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and Services.N.ServiceName.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Alibaba Cloud Object Storage Service (OSS) bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=cn-hangzhou. The template body must be 1 to 524,288 bytes in length. If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.</p>
     * <br>
     * <p>You must specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and Services.N.ServiceName.</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version of the template. If you do not specify this parameter, the latest version is used.</p>
     * <br>
     * <p>This parameter takes effect only when the TemplateId parameter is specified.</p>
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
         * <p>The name of parameter N. If you do not specify the name and the value of a parameter, Resource Orchestration Service (ROS) uses the default name and value that are specified in the template.</p>
         * <br>
         * <p>>  The Parameters parameter is optional. If you specify the Parameters parameter, you must specify the Parameters.N.ParameterKey parameter.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of parameter N.</p>
         * <br>
         * <p>>  The Parameters parameter is optional. If you specify the Parameters parameter, you must specify the Parameters.N.ParameterValue parameter.</p>
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
         * <p>The name of service N or feature N. Valid values:</p>
         * <br>
         * <p>*   AHAS: Application High Availability Service</p>
         * <p>*   ARMS: Application Real-Time Monitoring Service (ARMS)</p>
         * <p>*   ApiGateway: API Gateway</p>
         * <p>*   BatchCompute: Batch Compute</p>
         * <p>*   BrainIndustrial: Industrial Brain</p>
         * <p>*   CloudStorageGateway: Cloud Storage Gateway (CSG)</p>
         * <p>*   CMS: CloudMonitor</p>
         * <p>*   CR: Container Registry</p>
         * <p>*   CS: Container Service for Kubernetes (ACK)</p>
         * <p>*   DCDN: Dynamic Route for CDN (DCDN)</p>
         * <p>*   DataHub: DataHub</p>
         * <p>*   DataWorks: DataWorks</p>
         * <p>*   EDAS: Enterprise Distributed Application Service (EDAS)</p>
         * <p>*   E-HPC: Elastic High Performance Computing (E-HPC)</p>
         * <p>*   EMAS: Enterprise Mobile Application Studio (EMAS)</p>
         * <p>*   FC: Function Compute</p>
         * <p>*   FNF: Serverless Workflow (SWF)</p>
         * <p>*   MaxCompute: MaxCompute</p>
         * <p>*   MNS: Message Service (MNS)</p>
         * <p>*   HBR: Hybrid Backup Recovery (HBR)</p>
         * <p>*   IMM: Intelligent Media Management</p>
         * <p>*   IOT: IoT Platform</p>
         * <p>*   KMS: Key Management Service (KMS)</p>
         * <p>*   NAS: Apsara File Storage NAS (NAS)</p>
         * <p>*   NLP: Natural Language Processing (NLP)</p>
         * <p>*   OSS: OSS</p>
         * <p>*   OTS: Tablestore</p>
         * <p>*   PrivateLink: PrivateLink</p>
         * <p>*   PrivateZone: Alibaba Cloud DNS PrivateZone</p>
         * <p>*   RocketMQ: Message Queue for Apache RocketMQ</p>
         * <p>*   SAE: Serverless App Engine (SAE)</p>
         * <p>*   SLS: Log Service</p>
         * <p>*   TrafficMirror: the traffic mirroring feature</p>
         * <p>*   VS: Video Surveillance System</p>
         * <p>*   Xtrace: Tracing Analysis</p>
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
