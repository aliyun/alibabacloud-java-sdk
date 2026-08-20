// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalAlidingDocResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
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
     * <p>The publicly accessible URL of the AliDing online document.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
     */
    @NameInMap("filePublicUrl")
    public String filePublicUrl;

    /**
     * <p>The timestamp when the customer group was created. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-22T08:15:28.000+00:00</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pipeline name.</p>
     * 
     * <strong>example:</strong>
     * <p>user_paswd_104</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E68654BD-F7BA-5837-8686-5645D739A47C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The permission scope.</p>
     * 
     * <strong>example:</strong>
     * <p>user_info projects pull_requests hook gists emails</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>The unique identifier on the business system side, that is, the business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2000413</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The call status. Valid values:</p>
     * <ul>
     * <li><strong>PENDING</strong>: Waiting for receipt.</li>
     * <li><strong>SUCCESS</strong>: Succeeded.</li>
     * <li><strong>FAILED</strong>: Failed.</li>
     * <li><strong>TIMEOUT</strong>: Timed out.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;servicesInstances\&quot;: {}, \&quot;servicesWithPendingChanges\&quot;: []}</p>
     */
    @NameInMap("status")
    public String status;

    public static CreatePersonalAlidingDocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalAlidingDocResponseBody self = new CreatePersonalAlidingDocResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePersonalAlidingDocResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePersonalAlidingDocResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreatePersonalAlidingDocResponseBody setFilePublicUrl(String filePublicUrl) {
        this.filePublicUrl = filePublicUrl;
        return this;
    }
    public String getFilePublicUrl() {
        return this.filePublicUrl;
    }

    public CreatePersonalAlidingDocResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CreatePersonalAlidingDocResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePersonalAlidingDocResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePersonalAlidingDocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePersonalAlidingDocResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreatePersonalAlidingDocResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreatePersonalAlidingDocResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
