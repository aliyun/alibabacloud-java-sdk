// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyInstanceRequest extends TeaModel {
    /**
     * <p>A list of calling numbers.</p>
     * <blockquote>
     * <p>This parameter is optional.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;95187&quot;]</p>
     */
    @NameInMap("CallingNumber")
    public java.util.List<String> callingNumber;

    /**
     * <p>The description of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>这是新的实例</p>
     */
    @NameInMap("InstanceDescription")
    public String instanceDescription;

    /**
     * <p>The ID of the Outbound Bot instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>90515b5-6115-4ccf-83e2-52d5bfaf2ddf</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>新实例</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The maximum number of concurrent conversations.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxConcurrentConversation")
    public Integer maxConcurrentConversation;

    public static ModifyInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceRequest self = new ModifyInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceRequest setCallingNumber(java.util.List<String> callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public java.util.List<String> getCallingNumber() {
        return this.callingNumber;
    }

    public ModifyInstanceRequest setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    public ModifyInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyInstanceRequest setMaxConcurrentConversation(Integer maxConcurrentConversation) {
        this.maxConcurrentConversation = maxConcurrentConversation;
        return this;
    }
    public Integer getMaxConcurrentConversation() {
        return this.maxConcurrentConversation;
    }

}
