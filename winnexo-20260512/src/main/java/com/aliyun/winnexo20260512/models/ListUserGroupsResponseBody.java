// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListUserGroupsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The list of top-level user groups.</p>
     */
    @NameInMap("items")
    public java.util.List<?> items;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListUserGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsResponseBody self = new ListUserGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUserGroupsResponseBody setItems(java.util.List<?> items) {
        this.items = items;
        return this;
    }
    public java.util.List<?> getItems() {
        return this.items;
    }

    public ListUserGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
