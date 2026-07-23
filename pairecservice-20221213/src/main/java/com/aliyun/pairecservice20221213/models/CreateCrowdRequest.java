// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateCrowdRequest extends TeaModel {
    /**
     * <p>The description of the crowd.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID. To get this ID, call the ListInstances operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-abcdefg1234</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The crowd label.</p>
     * 
     * <strong>example:</strong>
     * <p>os=android</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The crowd name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xx人群</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The source of the user data. Valid values: ● ManualInput: Users are provided in the Users parameter. ● UploadFile: Users are provided from an uploaded file.</p>
     * 
     * <strong>example:</strong>
     * <p>ManualInput</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The users to include in the crowd. Separate multiple users with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>user1,user2,user3</p>
     */
    @NameInMap("Users")
    public String users;

    public static CreateCrowdRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCrowdRequest self = new CreateCrowdRequest();
        return TeaModel.build(map, self);
    }

    public CreateCrowdRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCrowdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCrowdRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public CreateCrowdRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCrowdRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateCrowdRequest setUsers(String users) {
        this.users = users;
        return this;
    }
    public String getUsers() {
        return this.users;
    }

}
