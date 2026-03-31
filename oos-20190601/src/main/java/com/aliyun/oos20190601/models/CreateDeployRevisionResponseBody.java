// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateDeployRevisionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4DB0****1234</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;RevisionId&quot;: &quot;rev-0d6c6956faac431c891b&quot;, &quot;ApplicationName&quot;: &quot;AgentColin3&quot;}</p>
     */
    @NameInMap("Revision")
    public CreateDeployRevisionResponseBodyRevision revision;

    public static CreateDeployRevisionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeployRevisionResponseBody self = new CreateDeployRevisionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeployRevisionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDeployRevisionResponseBody setRevision(CreateDeployRevisionResponseBodyRevision revision) {
        this.revision = revision;
        return this;
    }
    public CreateDeployRevisionResponseBodyRevision getRevision() {
        return this.revision;
    }

    public static class CreateDeployRevisionResponseBodyRevision extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AgentColin3</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("DeployResourceType")
        public String deployResourceType;

        /**
         * <strong>example:</strong>
         * <p>2026-01-05</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Hooks")
        public String hooks;

        /**
         * <strong>example:</strong>
         * <p>{&quot;bucketName&quot;:&quot;ecs-application-ui-test&quot;,&quot;objectName&quot;:&quot;319137376-pipeline-run-319137376-task-1-cmd-exec.log&quot;,&quot;regionId&quot;:&quot;cn-hangzhou&quot;}</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>rev-0d6c6956faac431c891b</p>
         */
        @NameInMap("RevisionId")
        public String revisionId;

        /**
         * <strong>example:</strong>
         * <p>Oss</p>
         */
        @NameInMap("RevisionType")
        public String revisionType;

        public static CreateDeployRevisionResponseBodyRevision build(java.util.Map<String, ?> map) throws Exception {
            CreateDeployRevisionResponseBodyRevision self = new CreateDeployRevisionResponseBodyRevision();
            return TeaModel.build(map, self);
        }

        public CreateDeployRevisionResponseBodyRevision setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public CreateDeployRevisionResponseBodyRevision setDeployResourceType(String deployResourceType) {
            this.deployResourceType = deployResourceType;
            return this;
        }
        public String getDeployResourceType() {
            return this.deployResourceType;
        }

        public CreateDeployRevisionResponseBodyRevision setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateDeployRevisionResponseBodyRevision setHooks(String hooks) {
            this.hooks = hooks;
            return this;
        }
        public String getHooks() {
            return this.hooks;
        }

        public CreateDeployRevisionResponseBodyRevision setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public CreateDeployRevisionResponseBodyRevision setRevisionId(String revisionId) {
            this.revisionId = revisionId;
            return this;
        }
        public String getRevisionId() {
            return this.revisionId;
        }

        public CreateDeployRevisionResponseBodyRevision setRevisionType(String revisionType) {
            this.revisionType = revisionType;
            return this;
        }
        public String getRevisionType() {
            return this.revisionType;
        }

    }

}
