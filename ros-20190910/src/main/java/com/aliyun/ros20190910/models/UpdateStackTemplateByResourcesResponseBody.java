// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackTemplateByResourcesResponseBody extends TeaModel {
    /**
     * <p>The template content after correction.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;ROSTemplateFormatVersion\&quot;: \&quot;2015-09-01\&quot;, \&quot;Resources\&quot;: {\&quot;Vpc\&quot;: {\&quot;Type\&quot;: \&quot;ALIYUN::ECS::VPC\&quot;, \&quot;Properties\&quot;: {\&quot;VpcName\&quot;: \&quot;test\&quot;, \&quot;CidrBlock\&quot;: \&quot;192.168.0.0/16\&quot;, \&quot;Description\&quot;: \&quot;test2\&quot;}}}, \&quot;Outputs\&quot;: {\&quot;VpcId\&quot;: {\&quot;Value\&quot;: {\&quot;Fn::GetAtt\&quot;: [\&quot;Vpc\&quot;, \&quot;VpcId\&quot;]}}}}</p>
     */
    @NameInMap("NewTemplateBody")
    public String newTemplateBody;

    /**
     * <p>The template content before correction.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;ROSTemplateFormatVersion\&quot;: \&quot;2015-09-01\&quot;, \&quot;Resources\&quot;: {\&quot;Vpc\&quot;: {\&quot;Type\&quot;: \&quot;ALIYUN::ECS::VPC\&quot;, \&quot;Properties\&quot;: {\&quot;VpcName\&quot;: \&quot;test\&quot;, \&quot;CidrBlock\&quot;: \&quot;192.168.0.0/16\&quot;, \&quot;Description\&quot;: \&quot;test1\&quot;}}}, \&quot;Outputs\&quot;: {\&quot;VpcId\&quot;: {\&quot;Value\&quot;: {\&quot;Fn::GetAtt\&quot;: [\&quot;Vpc\&quot;, \&quot;VpcId\&quot;]}}}}</p>
     */
    @NameInMap("OldTemplateBody")
    public String oldTemplateBody;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateStackTemplateByResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackTemplateByResourcesResponseBody self = new UpdateStackTemplateByResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateStackTemplateByResourcesResponseBody setNewTemplateBody(String newTemplateBody) {
        this.newTemplateBody = newTemplateBody;
        return this;
    }
    public String getNewTemplateBody() {
        return this.newTemplateBody;
    }

    public UpdateStackTemplateByResourcesResponseBody setOldTemplateBody(String oldTemplateBody) {
        this.oldTemplateBody = oldTemplateBody;
        return this;
    }
    public String getOldTemplateBody() {
        return this.oldTemplateBody;
    }

    public UpdateStackTemplateByResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
