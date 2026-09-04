// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalDingtalkMeetingResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The directory ID.</p>
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
     * <p>2025-11-14T02:18:27Z</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The skill name.</p>
     * 
     * <strong>example:</strong>
     * <p>oklabs_tongyici</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B49109FE-5BB1-593C-915D-F5A99D9F5435</p>
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
     * <p>The unique identifier on the business system side, which is the business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2000398</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The task running status.</p>
     * 
     * <strong>example:</strong>
     * <p>updated</p>
     */
    @NameInMap("status")
    public String status;

    public static CreatePersonalDingtalkMeetingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalDingtalkMeetingResponseBody self = new CreatePersonalDingtalkMeetingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePersonalDingtalkMeetingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePersonalDingtalkMeetingResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreatePersonalDingtalkMeetingResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CreatePersonalDingtalkMeetingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePersonalDingtalkMeetingResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePersonalDingtalkMeetingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePersonalDingtalkMeetingResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreatePersonalDingtalkMeetingResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreatePersonalDingtalkMeetingResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
