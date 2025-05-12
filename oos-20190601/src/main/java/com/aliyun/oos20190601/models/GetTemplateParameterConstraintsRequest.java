// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetTemplateParameterConstraintsRequest extends TeaModel {
    /**
     * <p>The information about the parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;endDate\&quot;: \&quot;2022-04-13T03:31:20Z\&quot;, \&quot;Status\&quot;: \&quot;Stopped\&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The content of the template in the JSON or YAML format. This parameter is the same as the Content parameter that you can specify when you call the CreateTemplate operation. You can use this parameter to specify the tasks that you want to run. This way, you do not need to create a template before you start an execution. If you select an existing template, you do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;Description&quot;: &quot;Example template, describe instances in some status&quot;,
     *     &quot;FormatVersion&quot;: &quot;OOS-2019-06-01&quot;,
     *     &quot;Parameters&quot;: {},
     *     &quot;Tasks&quot;: [{
     *         &quot;Name&quot;: &quot;describeInstances&quot;,
     *         &quot;Action&quot;: &quot;ACS::ExecuteAPI&quot;,
     *         &quot;Description&quot;: &quot;desc-en&quot;,
     *         &quot;Properties&quot;: {
     *             &quot;Service&quot;: &quot;ECS&quot;,
     *             &quot;API&quot;: &quot;DescribeInstances&quot;,
     *             &quot;Parameters&quot;: {
     *                 &quot;Status&quot;: &quot;Running&quot;
     *             }
     *         }
     *     }]
     * }</p>
     */
    @NameInMap("TemplateContent")
    public String templateContent;

    /**
     * <p>The name of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>MyTemplate</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The URL that is used to store the content of the Operation Orchestration Service (OOS) template in the Alibaba Cloud Object Storage Service (OSS). Only the public-read URL is supported. You can use this parameter to specify the tasks that you want to run. This way, you do not need to create a template before you start an execution. If you select an existing template, you do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://oos-template.cn-hangzhou.oss.aliyun-inc.com/oos-test-template.json">http://oos-template.cn-hangzhou.oss.aliyun-inc.com/oos-test-template.json</a></p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version of the template. The default value is the latest version of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static GetTemplateParameterConstraintsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateParameterConstraintsRequest self = new GetTemplateParameterConstraintsRequest();
        return TeaModel.build(map, self);
    }

    public GetTemplateParameterConstraintsRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public GetTemplateParameterConstraintsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTemplateParameterConstraintsRequest setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public GetTemplateParameterConstraintsRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetTemplateParameterConstraintsRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public GetTemplateParameterConstraintsRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
