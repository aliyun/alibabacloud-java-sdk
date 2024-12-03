// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class CheckInstancePolicyRequest extends TeaModel {
    /**
     * <p>The name of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>workshop-bj-ots1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance policy in the JSON format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;Version&quot;: &quot;1&quot;,
     *     &quot;Statement&quot;: [
     *         {
     *             &quot;Action&quot;: [
     *                 &quot;ots:<em>&quot;
     *             ],
     *             &quot;Resource&quot;: [
     *                 &quot;acs:ots:</em>:13791xxxxxxxxxxx:instance/myinstance*&quot;
     *             ],
     *             &quot;Principal&quot;: [
     *                 &quot;*&quot;
     *             ],
     *             &quot;Effect&quot;: &quot;Allow&quot;,
     *             &quot;Condition&quot;: {
     *                 &quot;StringEquals&quot;: {
     *                     &quot;ots:TLSVersion&quot;: [
     *                         &quot;1.2&quot;
     *                     ]
     *                 },
     *                 &quot;IpAddress&quot;: {
     *                     &quot;acs:SourceIp&quot;: [
     *                         &quot;192.168.0.1&quot;,
     *                         &quot;172.16.0.1&quot;
     *                     ]
     *                 }
     *             }
     *         }
     *     ]
     * }</p>
     */
    @NameInMap("Policy")
    public String policy;

    public static CheckInstancePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckInstancePolicyRequest self = new CheckInstancePolicyRequest();
        return TeaModel.build(map, self);
    }

    public CheckInstancePolicyRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CheckInstancePolicyRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

}
