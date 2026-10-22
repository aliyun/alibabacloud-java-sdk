// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateLogoTaskRequest extends TeaModel {
    /**
     * <p>The logo generation version number. Different versions use different parameter parsing methods.</p>
     */
    @NameInMap("LogoVersion")
    public String logoVersion;

    /**
     * <p>The negative prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>Do not generate politically related image content</p>
     */
    @NameInMap("NegativePrompt")
    public String negativePrompt;

    /**
     * <p>The task parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;ehpcutilParam\&quot;:\&quot;sched job_submit --commandline \\\&quot;/ehpcdata/data/usersTest/huangqiaoyi-1725933699384/huangqiaoyi-1725933699384.slurm\\\&quot; --runasuser TestGfjnSimworks\&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The positive prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>Strictly follow the original text to extract the summary of the manuscript. Do not arbitrarily fabricate or modify the news data presented in the text. Do not change the meaning or the news facts of the original text. Do not add your own opinions to the summary. Ensure the generated summary is free of grammatical and punctuation errors. When generating the summary, remove information such as the reporter, correspondent, and article source</p>
     */
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
