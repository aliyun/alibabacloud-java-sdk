// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeDirectoryResponseBody extends TeaModel {
    /**
     * <p>The time when the directory was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-10T10:00:00Z</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>The directory description.</p>
     * 
     * <strong>example:</strong>
     * <p>目录1</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the group that owns the folder.</p>
     * 
     * <strong>example:</strong>
     * <p>348*****174-cn-qingdao</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>399*****488-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The directory name.</p>
     * 
     * <strong>example:</strong>
     * <p>目录1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The parent directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>399*****774-cn-qingdao</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDirectoryResponseBody self = new DescribeDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDirectoryResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeDirectoryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeDirectoryResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDirectoryResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeDirectoryResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeDirectoryResponseBody setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public DescribeDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
