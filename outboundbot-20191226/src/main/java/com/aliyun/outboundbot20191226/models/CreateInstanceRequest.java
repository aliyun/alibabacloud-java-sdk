// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>The list of calling numbers.</p>
     * <blockquote>
     * <p>This parameter is optional.</p>
     * </blockquote>
     */
    @NameInMap("CallingNumber")
    public java.util.List<String> callingNumber;

    /**
     * <p>The description of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>这个是第一的实例</p>
     */
    @NameInMap("InstanceDescription")
    public String instanceDescription;

    /**
     * <p>The name of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>第一个实例</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The maximum number of concurrent conversations for the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("MaxConcurrentConversation")
    public Integer maxConcurrentConversation;

    /**
     * <p>The service type.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the default value is Managed.</p>
     * </blockquote>
     * <ul>
     * <li><p>DialogStudio: Conversation Engine 3.0.</p>
     * </li>
     * <li><p>Authorized: A chatbot for the public cloud. This value is used when a public cloud customer purchases a private Intelligent Speech Interaction service and grants authorization. To grant authorization, go to Scenario Management, click Edit, and then select Custom Service in the Invoke Service section.</p>
     * </li>
     * <li><p>Provided: A chatbot for on-premises deployment.</p>
     * </li>
     * <li><p>Managed: The legacy outbound call canvas. This is the default public Intelligent Speech Interaction service for the outbound call product.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DialogStudio</p>
     */
    @NameInMap("NluServiceType")
    public String nluServiceType;

    /**
     * <p>The ID of the resource group.</p>
     * <blockquote>
     * <p>You can call the ListResourceGroups operation to obtain this ID. For more information, see the Resource Management documentation at https\://api.aliyun.com/document/ResourceManager/2020-03-31/ListResourceGroups</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmwd4qr3z773y</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setCallingNumber(java.util.List<String> callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public java.util.List<String> getCallingNumber() {
        return this.callingNumber;
    }

    public CreateInstanceRequest setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    public CreateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceRequest setMaxConcurrentConversation(Integer maxConcurrentConversation) {
        this.maxConcurrentConversation = maxConcurrentConversation;
        return this;
    }
    public Integer getMaxConcurrentConversation() {
        return this.maxConcurrentConversation;
    }

    public CreateInstanceRequest setNluServiceType(String nluServiceType) {
        this.nluServiceType = nluServiceType;
        return this;
    }
    public String getNluServiceType() {
        return this.nluServiceType;
    }

    public CreateInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
