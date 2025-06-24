// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateLogoTaskRequest extends TeaModel {
    @NameInMap("NegativePrompt")
    public String negativePrompt;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;ehpcutilParam\&quot;:\&quot;sched job_submit --commandline \\\&quot;/ehpcdata/data/usersTest/huangqiaoyi-1725933699384/huangqiaoyi-1725933699384.slurm\\\&quot; --runasuser TestGfjnSimworks\&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("Prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>1.0.2</p>
     */
    @NameInMap("Version")
    public String version;

    public static CreateLogoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogoTaskRequest self = new CreateLogoTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogoTaskRequest setNegativePrompt(String negativePrompt) {
        this.negativePrompt = negativePrompt;
        return this;
    }
    public String getNegativePrompt() {
        return this.negativePrompt;
    }

    public CreateLogoTaskRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public CreateLogoTaskRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public CreateLogoTaskRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
