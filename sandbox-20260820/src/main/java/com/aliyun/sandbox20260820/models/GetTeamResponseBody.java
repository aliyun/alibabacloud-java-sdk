// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class GetTeamResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7ADFF8D8-D4BA-5F79-AD49-DDABFEA59B6C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("team")
    public E2BTeam team;

    public static GetTeamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTeamResponseBody self = new GetTeamResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTeamResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTeamResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTeamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTeamResponseBody setTeam(E2BTeam team) {
        this.team = team;
        return this;
    }
    public E2BTeam getTeam() {
        return this.team;
    }

}
