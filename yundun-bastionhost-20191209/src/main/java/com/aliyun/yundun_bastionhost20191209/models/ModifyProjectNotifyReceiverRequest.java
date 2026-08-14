// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyProjectNotifyReceiverRequest extends TeaModel {
    /**
     * <p>The new email address of the notification recipient.</p>
     * 
     * <strong>example:</strong>
     * <p>1824***@qq.com</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The ID of the bastion host instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host instance ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new name of the notification recipient. The name must be 1 to 128 characters in length, cannot start with a special character, and can contain only the following special characters: periods (.), underscores (_), hyphens (-), backslashes (\), and spaces.</p>
     * <blockquote>
     * <p>If this parameter is not specified, the name remains unchanged.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The new phone number of the notification recipient.</p>
     * 
     * <strong>example:</strong>
     * <p>171****5421</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>The ID of the notification recipient.</p>
     * <blockquote>
     * <p>You can call the ListProjectNotifyReceivers operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReceiverId")
    public Long receiverId;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyProjectNotifyReceiverRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProjectNotifyReceiverRequest self = new ModifyProjectNotifyReceiverRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProjectNotifyReceiverRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ModifyProjectNotifyReceiverRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyProjectNotifyReceiverRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyProjectNotifyReceiverRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public ModifyProjectNotifyReceiverRequest setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
        return this;
    }
    public Long getReceiverId() {
        return this.receiverId;
    }

    public ModifyProjectNotifyReceiverRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
