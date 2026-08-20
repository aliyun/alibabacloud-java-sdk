// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalDirectoryResponseBody extends TeaModel {
    /**
     * <p>SUCCESS indicates success. In case of failure, the corresponding error type is returned, such as ERR_BAD_REQUEST, ERR_VALIDATION_FAILED, or ERR_INTERNAL_SERVER_ERROR.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>PublicApplication</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The folder ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The folder type.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("directoryKind")
    public String directoryKind;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-03-04 13:54:52</p>
     */
    @NameInMap("gmtCreate")
    public Long gmtCreate;

    /**
     * <p>The last modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-11-14T02:18:27Z</p>
     */
    @NameInMap("gmtModified")
    public Long gmtModified;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The name of the worksheet.</p>
     * 
     * <strong>example:</strong>
     * <p>conn_ip_101</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The name of the digital human (operating object name, optional).</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The folder ID.</p>
     * 
     * <strong>example:</strong>
     * <p>wd-lxykjnnw4lyl9eq</p>
     */
    @NameInMap("parentDirectoryId")
    public String parentDirectoryId;

    /**
     * <p>The path.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://clg-paimon-4a00f1ac43464714b86fb54ca41a84c9/db-abc73646-6a08-4b96-820f-3d1d547a1e3b.db/tbl-c8a33522-5398-4f8e-9a2a-fba1efad94d1</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>375701FC-2FB9-5782-BE8F-A3F5E2F2158C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreatePersonalDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalDirectoryResponseBody self = new CreatePersonalDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePersonalDirectoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePersonalDirectoryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePersonalDirectoryResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreatePersonalDirectoryResponseBody setDirectoryKind(String directoryKind) {
        this.directoryKind = directoryKind;
        return this;
    }
    public String getDirectoryKind() {
        return this.directoryKind;
    }

    public CreatePersonalDirectoryResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public CreatePersonalDirectoryResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public CreatePersonalDirectoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePersonalDirectoryResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePersonalDirectoryResponseBody setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreatePersonalDirectoryResponseBody setParentDirectoryId(String parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
        return this;
    }
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    public CreatePersonalDirectoryResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreatePersonalDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
