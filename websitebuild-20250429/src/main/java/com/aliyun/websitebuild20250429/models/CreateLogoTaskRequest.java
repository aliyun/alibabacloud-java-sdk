// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateLogoTaskRequest extends TeaModel {
    @NameInMap("LogoVersion")
    public String logoVersion;

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

    public static CreateLogoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogoTaskRequest self = new CreateLogoTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogoTaskRequest setLogoVersion(String logoVersion) {
        this.logoVersion = logoVersion;
        return this;
    }
    public String getLogoVersion() {
        return this.logoVersion;
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

}
