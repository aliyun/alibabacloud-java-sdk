// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateTenantDirectoryResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success. If the request fails, a specific business error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The description of the created directory. If no description is set, the value is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>Team product materials and operation guides</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The business ID of the newly created directory. You can use this ID to read or update the knowledge base configuration for standard enterprise root directories.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kb-example</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The time when the directory was created. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1699000000</p>
     */
    @NameInMap("gmtCreate")
    public Long gmtCreate;

    /**
     * <p>The time when the directory was last modified. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1699000010</p>
     */
    @NameInMap("gmtModified")
    public Long gmtModified;

    /**
     * <p>The internal primary key of the directory. You can use this key as the parentId when you create a subdirectory. This key is different from the business ID directoryId.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>The response message. The value is success if the request is successful. If the request fails, this parameter describes the cause of the error.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The name of the created directory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Product knowledge base</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The legacy single digital employee association field. You cannot use this field to replace the mode and association list returned by GetKnowledgeBaseConfiguration.</p>
     * 
     * <strong>example:</strong>
     * <p>opt_1</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The internal primary key of the parent directory. This value is empty for enterprise root directories.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("parentId")
    public Long parentId;

    /**
     * <p>The path of the created directory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/Product knowledge base</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>The request tracking ID. You can use this ID to troubleshoot issues related to this call.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The ID of the tenant to which the directory belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public Long tenantId;

    /**
     * <p>The ID of the platform user who created the directory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("userId")
    public Long userId;

    public static CreateTenantDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantDirectoryResponseBody self = new CreateTenantDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTenantDirectoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTenantDirectoryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTenantDirectoryResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateTenantDirectoryResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public CreateTenantDirectoryResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public CreateTenantDirectoryResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateTenantDirectoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTenantDirectoryResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTenantDirectoryResponseBody setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreateTenantDirectoryResponseBody setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public CreateTenantDirectoryResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateTenantDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTenantDirectoryResponseBody setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public CreateTenantDirectoryResponseBody setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
