// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GenerateTemplateByScratchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourcesToImport")
    public java.util.List<GenerateTemplateByScratchResponseBodyResourcesToImport> resourcesToImport;

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
        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        @NameInMap("ResourceIdentifier")
        public java.util.Map<String, ?> resourceIdentifier;

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
