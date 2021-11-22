// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetServiceProvisionsRequest extends TeaModel {
    @NameInMap("Parameters")
    public java.util.List<GetServiceProvisionsRequestParameters> parameters;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Services")
    public java.util.List<GetServiceProvisionsRequestServices> services;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateURL")
    public String templateURL;

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
        @NameInMap("ParameterKey")
        public String parameterKey;

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
