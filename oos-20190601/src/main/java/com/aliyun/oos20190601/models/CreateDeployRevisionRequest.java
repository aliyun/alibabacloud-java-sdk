// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateDeployRevisionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AgentColin3</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <strong>example:</strong>
     * <p>Kubernetes</p>
     */
    @NameInMap("DeployResourceType")
    public String deployResourceType;

    /**
     * <strong>example:</strong>
     * <p>2026-01-03</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>{&quot;applicationStart&quot;:&quot;# Execute build process\nbuild() {\n  REPO_URL=\&quot;<a href="https://github.com/aldinokemal/go-whatsapp-web-multidevice.git%5C%5C%22%5C%5Cn">https://github.com/aldinokemal/go-whatsapp-web-multidevice.git\\&quot;\\n</a>  BRANCH=\&quot;main\&quot;\n  DOCKERFILE_PATH=\&quot;./dockerfile\&quot;\n  &quot;}</p>
     */
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
     * <p>Command</p>
     */
    @NameInMap("RevisionType")
    public String revisionType;

    public static CreateDeployRevisionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeployRevisionRequest self = new CreateDeployRevisionRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeployRevisionRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public CreateDeployRevisionRequest setDeployResourceType(String deployResourceType) {
        this.deployResourceType = deployResourceType;
        return this;
    }
    public String getDeployResourceType() {
        return this.deployResourceType;
    }

    public CreateDeployRevisionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDeployRevisionRequest setHooks(String hooks) {
        this.hooks = hooks;
        return this;
    }
    public String getHooks() {
        return this.hooks;
    }

    public CreateDeployRevisionRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public CreateDeployRevisionRequest setRevisionType(String revisionType) {
        this.revisionType = revisionType;
        return this;
    }
    public String getRevisionType() {
        return this.revisionType;
    }

}
