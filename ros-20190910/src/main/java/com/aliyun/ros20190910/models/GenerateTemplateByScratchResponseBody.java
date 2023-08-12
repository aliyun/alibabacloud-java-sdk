// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GenerateTemplateByScratchResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resources that you want to import into a stack in the scenario.</p>
     * <br>
     * <p>> This parameter is returned only if the scenario is of the Resource Management type.</p>
     */
    @NameInMap("ResourcesToImport")
    public java.util.List<GenerateTemplateByScratchResponseBodyResourcesToImport> resourcesToImport;

    /**
     * <p>The template content of the scenario.</p>
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
         */
        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        /**
         * <p>The key-value mapping between strings. The value is a JSON string that identifies the resource that you want to import into a stack.\</p>
         * <p>A key is an identifier for a resource, and a value is an assignment of data to the key. For example, VpcId is a key that indicates the ID of a virtual private cloud (VPC), and `vpc-bp1m6fww66xbntjyc****"` is a value that is assigned to VpcId.</p>
         */
        @NameInMap("ResourceIdentifier")
        public java.util.Map<String, ?> resourceIdentifier;

        /**
         * <p>The type of the resource.</p>
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
