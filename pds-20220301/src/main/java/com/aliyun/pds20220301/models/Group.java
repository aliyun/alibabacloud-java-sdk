// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class Group extends TeaModel {
    /**
     * <p>The time when the group was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("created_at")
    public Long createdAt;

    /**
     * <p>The ID of the user who created the group.</p>
     * 
     * <strong>example:</strong>
     * <p>c9b7a5aa04d14ae3867fdc886fa01da4</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <p>The description of the group.</p>
     * 
     * <strong>example:</strong>
     * <p>created by system</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The ID of the domain.</p>
     * 
     * <strong>example:</strong>
     * <p>bj1</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    /**
     * <p>The ID of the group.</p>
     * 
     * <strong>example:</strong>
     * <p>b45c0c0c373c41ec9ebb5c85a025a08f</p>
     */
    @NameInMap("group_id")
    public String groupId;

    /**
     * <p>The name of the group.</p>
     * 
     * <strong>example:</strong>
     * <p>test group</p>
     */
    @NameInMap("group_name")
    public String groupName;

    /**
     * <p>The time when the group was modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("updated_at")
    public Long updatedAt;

    public static Group build(java.util.Map<String, ?> map) throws Exception {
        Group self = new Group();
        return TeaModel.build(map, self);
    }

    public Group setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public Group setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public Group setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Group setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public Group setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public Group setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public Group setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
