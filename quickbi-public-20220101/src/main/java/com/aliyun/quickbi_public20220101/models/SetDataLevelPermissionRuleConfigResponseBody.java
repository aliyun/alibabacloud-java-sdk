// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SetDataLevelPermissionRuleConfigResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D8749D65-E80A-433C-AF1B-CE9C180FF3B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Successfully saved row and column permission information.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;cubeId&quot;: &quot;aa574353-41cf-<strong><strong>-8d0d-455176c101fa&quot;,
     *     &quot;hitTakeEffect&quot;: 1,
     *     &quot;isOpen&quot;: 1,
     *     &quot;permissionMode&quot;: &quot;COMPLEX&quot;,
     *     &quot;ruleContentModel&quot;: {
     *         &quot;ruleContent&quot;: {
     *             &quot;pathId&quot;: [
     *                 &quot;264b7a970b&quot;
     *             ]
     *         },
     *         &quot;ruleContentJson&quot;: &quot;{\&quot;pathId\&quot;:[\&quot;264b7a970b\&quot;]}&quot;,
     *         &quot;ruleContentType&quot;: &quot;COLUMN_FORBID&quot;
     *     },
     *     &quot;ruleId&quot;: &quot;3971fa8e-f7e0-</strong></strong>-b6e3-5b3167dd7247&quot;,
     *     &quot;ruleLevelType&quot;: &quot;COLUMN_LEVEL&quot;,
     *     &quot;ruleName&quot;: &quot;test&quot;,
     *     &quot;ruleTargetScope&quot;: &quot;ALL&quot;
     * }</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <p>Indicates whether the request was successful. The value range is as follows:</p>
     * <ul>
     * <li>true: The request succeeded</li>
     * <li>false: The request failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SetDataLevelPermissionRuleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDataLevelPermissionRuleConfigResponseBody self = new SetDataLevelPermissionRuleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDataLevelPermissionRuleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetDataLevelPermissionRuleConfigResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public SetDataLevelPermissionRuleConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
