// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ApplyTokenRequest extends TeaModel {
    /**
     * <p>The permission type of the token. Valid values:</p>
     * <ul>
     * <li><strong>R</strong>: read-only. You can only subscribe to the specified topics.</li>
     * <li><strong>W</strong>: write-only. You can only send messages to the specified topics.</li>
     * <li><strong>R,W</strong>: read and write. You can send messages to and subscribe to the specified topics. Separate <strong>R</strong> and <strong>W</strong> with a comma (,).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>R</p>
     */
    @NameInMap("Actions")
    public String actions;

    /**
     * <p>The timestamp that indicates the point in time when the token expires. Unit: milliseconds. The minimum validity period of a token is 60 seconds, and the maximum validity period of a token is 30 days. If you specify a validity period of more than 30 days for a token, no errors are returned. However, the token is valid only for 30 days.</p>
     * <p>For example, you want to specify a validity period of 60 seconds for a token. If the current system timestamp is 1609434061000, you must set this parameter to <strong>1609434121000</strong>. The value is calculated by using the following formula: 1609434061000 + 60 x 1000 = 1609434121000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1609434121000</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>The ID of the ApsaraMQ for MQTT instance. The ID must be consistent with the ID of the instance that the ApsaraMQ for MQTT client uses. You can obtain the instance ID on the <strong>Instance Details</strong> page that corresponds to the instance in the <a href="https://mqtt.console.aliyun.com/">ApsaraMQ for MQTT console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>post-cn-0pp12gl****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The topics on the ApsaraMQ for MQTT instance. Separate multiple topics with commas (,). Each token can be used to access up to 100 topics. Multiple topics are sorted in alphabetic order. MQTT wildcards, including single-level wildcards represented by plus signs (+) and multi-level wildcards represented by number signs (#), can be used for the Resources parameter that you register to apply for a token.</p>
     * <p>For example, if you set the <strong>Resources</strong> parameter to Topic1/+ when you apply for a token, the ApsaraMQ for MQTT client can manage the topics in Topic1/xxx. If you set the <strong>Resources</strong> parameter to Topic1/# when you apply for a token, the ApsaraMQ for MQTT client can manage topics of any level in Topic1/xxx/xxx/xxx.</p>
     * <blockquote>
     * <p> ApsaraMQ for MQTT supports subtopics. You can specify subtopics in the code for messaging instead of configuring them in the ApsaraMQ for MQTT console. Forward slashes (/) are used to separate topics of different levels. For more information, see <a href="https://help.aliyun.com/document_detail/42420.html">Terms</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TopicA/+</p>
     */
    @NameInMap("Resources")
    public String resources;

    public static ApplyTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyTokenRequest self = new ApplyTokenRequest();
        return TeaModel.build(map, self);
    }

    public ApplyTokenRequest setActions(String actions) {
        this.actions = actions;
        return this;
    }
    public String getActions() {
        return this.actions;
    }

    public ApplyTokenRequest setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public ApplyTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ApplyTokenRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

}
