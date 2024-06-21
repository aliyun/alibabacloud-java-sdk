// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GenerateTemplateByScratchResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D22C1D13-D74E-558C-AF68-1B4C05FA6F1A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resources that you want to import into a stack in the resource management scenario.</p>
     * <blockquote>
     * <p>This parameter is returned only for a resource management scenario.</p>
     * </blockquote>
     */
    @NameInMap("ResourcesToImport")
    public java.util.List<GenerateTemplateByScratchResponseBodyResourcesToImport> resourcesToImport;

    /**
     * <p>The template content of the resource scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;ROSTemplateFormatVersion\&quot;: \&quot;2015-09-01\&quot;, \&quot;Resources\&quot;: {\&quot;ECSVPC_001\&quot;: {\&quot;DeletionPolicy\&quot;: \&quot;Retain\&quot;, \&quot;Type\&quot;: \&quot;ALIYUN::ECS::VPC\&quot;, \&quot;Properties\&quot;: {\&quot;CidrBlock\&quot;: \&quot;172.16.0.0/12\&quot;, \&quot;VpcName\&quot;: \&quot;MyTestVpc\&quot;, \&quot;EnableIpv6\&quot;: false}}}}</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    public static GenerateTemplateByScratchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateTemplateByScratchResponseBody self = new GenerateTemplateByScratchResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateTemplateByScratchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateTemplateByScratchResponseBody setResourcesToImport(java.util.List<GenerateTemplateByScratchResponseBodyResourcesToImport> resourcesToImport) {
        this.resourcesToImport = resourcesToImport;
        return this;
    }
    public java.util.List<GenerateTemplateByScratchResponseBodyResourcesToImport> getResourcesToImport() {
        return this.resourcesToImport;
    }

    public GenerateTemplateByScratchResponseBody setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public static class GenerateTemplateByScratchResponseBodyResourcesToImport extends TeaModel {
        /**
         * <p>The logical ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ECSVPC_001</p>
         */
        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        /**
         * <p>The key-value mapping between strings. The value is a JSON string that identifies the resource that you want to import into a stack.\
         * A key is an identifier for a resource, and a value is an assignment of data to the key. For example, VpcId is a key that indicates the ID of a virtual private cloud (VPC), and <code>vpc-bp1m6fww66xbntjyc****&quot;</code> is a value that is assigned to VpcId.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VpcId&quot;: &quot;vpc-bp1m6fww66xbntjyc****&quot; }</p>
         */
        @NameInMap("ResourceIdentifier")
        public java.util.Map<String, ?> resourceIdentifier;

        /**
         * <p>The type of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::ECS::VPC</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static GenerateTemplateByScratchResponseBodyResourcesToImport build(java.util.Map<String, ?> map) throws Exception {
            GenerateTemplateByScratchResponseBodyResourcesToImport self = new GenerateTemplateByScratchResponseBodyResourcesToImport();
            return TeaModel.build(map, self);
        }

        public GenerateTemplateByScratchResponseBodyResourcesToImport setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public GenerateTemplateByScratchResponseBodyResourcesToImport setResourceIdentifier(java.util.Map<String, ?> resourceIdentifier) {
            this.resourceIdentifier = resourceIdentifier;
            return this;
        }
        public java.util.Map<String, ?> getResourceIdentifier() {
            return this.resourceIdentifier;
        }

        public GenerateTemplateByScratchResponseBodyResourcesToImport setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
