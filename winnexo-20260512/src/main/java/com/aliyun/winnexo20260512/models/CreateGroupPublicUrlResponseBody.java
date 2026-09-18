// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupPublicUrlResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The folder ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-11-12T03:08:56Z</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The project group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>group_delivery</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The knowledge base name.</p>
     * 
     * <strong>example:</strong>
     * <p>p-toolset-80a4520e-b35c-4e8b-acf7-3a01c7307522</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The URL of the web page.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://mp.weixin.qq.com/s/iHqLKhkJcOyHNCOGejO32A">https://mp.weixin.qq.com/s/iHqLKhkJcOyHNCOGejO32A</a></p>
     */
    @NameInMap("originalUrl")
    public String originalUrl;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The permission scope.</p>
     * 
     * <strong>example:</strong>
     * <p>PERSONAL</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>The source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceId</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The refund status. If a refund is in progress, query to confirm the refund status. Valid values:</p>
     * <ul>
     * <li>SUCCESS: All succeeded.</li>
     * <li>FAIL: Failed.</li>
     * <li>WAIT_PAY: Waiting for refund.</li>
     * <li>EXPIRE: Expired.</li>
     * <li>PAYING: Refund in progress.</li>
     * <li>TERMINATE: Refund terminated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    public static CreateGroupPublicUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupPublicUrlResponseBody self = new CreateGroupPublicUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGroupPublicUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateGroupPublicUrlResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateGroupPublicUrlResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CreateGroupPublicUrlResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateGroupPublicUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateGroupPublicUrlResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGroupPublicUrlResponseBody setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
        return this;
    }
    public String getOriginalUrl() {
        return this.originalUrl;
    }

    public CreateGroupPublicUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGroupPublicUrlResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateGroupPublicUrlResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreateGroupPublicUrlResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
