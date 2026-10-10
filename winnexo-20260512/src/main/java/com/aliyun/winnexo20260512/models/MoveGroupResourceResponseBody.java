// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class MoveGroupResourceResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The collaboration space ID.</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The directory ID before the move.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceDirectoryId")
    public String sourceDirectoryId;

    /**
     * <p>The ID of the moved resource. This value remains unchanged before and after the move.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The directory ID after the move.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("targetDirectoryId")
    public String targetDirectoryId;

    public static MoveGroupResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveGroupResourceResponseBody self = new MoveGroupResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveGroupResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MoveGroupResourceResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public MoveGroupResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MoveGroupResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MoveGroupResourceResponseBody setSourceDirectoryId(String sourceDirectoryId) {
        this.sourceDirectoryId = sourceDirectoryId;
        return this;
    }
    public String getSourceDirectoryId() {
        return this.sourceDirectoryId;
    }

    public MoveGroupResourceResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public MoveGroupResourceResponseBody setTargetDirectoryId(String targetDirectoryId) {
        this.targetDirectoryId = targetDirectoryId;
        return this;
    }
    public String getTargetDirectoryId() {
        return this.targetDirectoryId;
    }

}
