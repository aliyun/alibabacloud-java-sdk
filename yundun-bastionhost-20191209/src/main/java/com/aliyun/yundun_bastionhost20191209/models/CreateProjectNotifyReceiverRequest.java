// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateProjectNotifyReceiverRequest extends TeaModel {
    /**
     * <p>The email address of the recipient.</p>
     * <blockquote>
     * <p>You must specify at least one of Phone or Email.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1099**@qq.com</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The instance ID of the bastion host.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/462953.html">DescribeInstances</a> operation to query this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the recipient. The name must be 1 to 128 characters in length, cannot start with a special character, and can contain only the following special characters: periods (.), underscores (_), hyphens (-), backslashes (\), and spaces.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The phone number of the recipient.</p>
     * <blockquote>
     * <p>You must specify at least one of Phone or Email.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>131****1421</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>The project ID.</p>
     * <blockquote>
     * <p>You can call the ListProjects operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

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

    public static CreateProjectNotifyReceiverRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectNotifyReceiverRequest self = new CreateProjectNotifyReceiverRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectNotifyReceiverRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateProjectNotifyReceiverRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateProjectNotifyReceiverRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProjectNotifyReceiverRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateProjectNotifyReceiverRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateProjectNotifyReceiverRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
