// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateLogoTaskRequest extends TeaModel {
    @NameInMap("LogoVersion")
    public String logoVersion;

    /**
     * <p>The negative prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>不生成政治相关图片内容</p>
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
     * <p>请严格遵照原文提取稿件的摘要，不要随意捏造和修改文中出现的新闻数据，不要改变原文的意思和新闻事实，不要在摘要中添加自己的观点。生成的摘要不要出现语法和标点的错误。在生成摘要时请去掉里面的记者、通讯员、稿件来源等信息。</p>
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
