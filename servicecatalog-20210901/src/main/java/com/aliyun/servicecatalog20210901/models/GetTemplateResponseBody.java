// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The content of the template.</p>
     * <p>For more information about the template syntax, see <a href="https://help.aliyun.com/document_detail/184397.html">Structure of Terraform templates</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;,
     *   &quot;Transform&quot;: &quot;Aliyun::Terraform-v1.1&quot;,
     *   &quot;Workspace&quot;: {
     *     &quot;main.tf&quot;: &quot;variable  \&quot;name\&quot; {  default = \&quot;auto_provisioning_group\&quot;}&quot;
     *   },
     *   &quot;Outputs&quot;: {}
     * }</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    public static GetTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateResponseBody self = new GetTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateResponseBody setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

}
