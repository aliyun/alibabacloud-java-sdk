// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetTemplateParameterConstraintsResponseBody extends TeaModel {
    /**
     * <p>The constraints of the parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *       &quot;Type&quot;: &quot;String&quot;,
     *       &quot;AllowedValues&quot;: [
     *         &quot;ecs.n1.tiny&quot;,
     *         &quot;ecs.r8a.4xlarge&quot;,
     *         &quot;ecs.n2.xlarge&quot;,
     *         &quot;ecs.c7.2xlarge&quot;,
     *         &quot;ecs.c8i.4xlarge&quot;,
     *         &quot;ecs.g8i.48xlarge&quot;,
     *         &quot;ecs.c8a.4xlarge&quot;,
     *         &quot;ecs.i2.4xlarge&quot;,
     *         &quot;ecs.r8y.2xlarge&quot;
     *       ],
     *       &quot;AssociationParameterNames&quot;: [
     *         &quot;RegionId&quot;,
     *         &quot;zoneId&quot;
     *       ],
     *       &quot;ParameterKey&quot;: &quot;instanceType&quot;
     *     },
     *     {
     *       &quot;Type&quot;: &quot;String&quot;,
     *       &quot;AllowedValues&quot;: [],
     *       &quot;AssociationParameterNames&quot;: [
     *         &quot;RegionId&quot;,
     *         &quot;zoneId&quot;,
     *         &quot;InstanceType&quot;
     *       ],
     *       &quot;ParameterKey&quot;: &quot;systemDiskCategory&quot;
     *     }
     *   ]</p>
     */
    @NameInMap("ParameterConstraints")
    public java.util.Map<String, ?> parameterConstraints;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBEC8072-BEC2-478E-8EAE-E723BA79CF19</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTemplateParameterConstraintsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateParameterConstraintsResponseBody self = new GetTemplateParameterConstraintsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateParameterConstraintsResponseBody setParameterConstraints(java.util.Map<String, ?> parameterConstraints) {
        this.parameterConstraints = parameterConstraints;
        return this;
    }
    public java.util.Map<String, ?> getParameterConstraints() {
        return this.parameterConstraints;
    }

    public GetTemplateParameterConstraintsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
