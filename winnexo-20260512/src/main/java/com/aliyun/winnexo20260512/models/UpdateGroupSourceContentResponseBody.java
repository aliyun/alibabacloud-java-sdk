// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateGroupSourceContentResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The image name.</p>
     * 
     * <strong>example:</strong>
     * <p>Project resource</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C474BFC7-7B11-5D92-971E-74AA82EC495B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>source_example</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The data source type.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>The task running status.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("status")
    public String status;

    public static UpdateGroupSourceContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupSourceContentResponseBody self = new UpdateGroupSourceContentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGroupSourceContentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateGroupSourceContentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateGroupSourceContentResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateGroupSourceContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateGroupSourceContentResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public UpdateGroupSourceContentResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public UpdateGroupSourceContentResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
