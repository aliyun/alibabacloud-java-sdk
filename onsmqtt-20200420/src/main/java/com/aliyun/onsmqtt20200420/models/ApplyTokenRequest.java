// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ApplyTokenRequest extends TeaModel {
    /**
     * <p>The permission type of the token. Valid values:</p>
     * <ul>
     * <li><strong>R</strong>: read-only permissions. The client can only subscribe to the specified topics and cannot publish messages to the topics.</li>
     * <li><strong>W</strong>: write-only permissions. The client can only publish messages to the specified topics and cannot subscribe to the topics.</li>
     * <li><strong>R,W</strong>: read and write permissions. The client can publish messages to and subscribe to the specified topics. Separate <strong>R</strong> and <strong>W</strong> with a comma (,).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>R</p>
     */
    @NameInMap("Actions")
    public String actions;

    /**
     * <p>The expiration time of the token. The value is a millisecond timestamp. The minimum effective period is 60 seconds, and the maximum effective period is 30 days. If the specified value exceeds 30 days, the API operation does not return an error, but the actual effective period is 30 days.</p>
     * <p>Example: If the effective period of the token is 60 seconds and the current system time in milliseconds is 1609434061000, set this parameter to <strong>1609434121000</strong>, which is the sum of 1609434061000 and 60 × 1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1609434121000</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>The ID of the ApsaraMQ for MQTT instance. The instance ID must match the actual instance ID used by the client. You can obtain the instance ID on the <strong>Instance Details</strong> page in the <a href="https://mqtt.console.aliyun.com/">console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>post-cn-0pp12gl****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The resource name, which is the topic of ApsaraMQ for MQTT. Separate multiple topics with commas (,). Each token can be used to perform operations on up to 100 resources. If multiple topics are specified, they must be sorted in lexicographical order.
     * The resource parameter registered when you apply for a token supports the MQTT wildcard syntax, including the plus sign (+) for single-level wildcards and the number sign (#) for multi-level wildcards.</p>
     * <p>For example, if you set <strong>Resources</strong> to &quot;Topic1/+&quot; when you apply for a token, the client can perform operations on any topic in the format of &quot;Topic1/xxx&quot;. If you set <strong>Resources</strong> to &quot;Topic1/#&quot;, the client can perform operations on any multi-level topic in the format of &quot;Topic1/xxx/xxx/xxx&quot;.</p>
     * <blockquote>
     * <p>ApsaraMQ for MQTT supports matching child topics. You do not need to create child topics in the console. You can directly configure the settings in the message sending and receiving code. The forward slash (/) in a topic name is used to separate the parent topic and child topics. For more information, see <a href="https://help.aliyun.com/document_detail/42420.html">Terms</a>.</p>
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
