// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GetPolarAgentRequest extends TeaModel {
    /**
     * <p>Additional information, as a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtraInfo")
    public String extraInfo;

    /**
     * <p>The session query. Get this value from the return value of the &quot;Start a digital human&quot; API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c4d242f3-c909-4846-91d9-f84c238a9820</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The session ID. Get this value from the return value of the &quot;Start a digital human&quot; API.</p>
     * 
     * <strong>example:</strong>
     * <p>c4d242f3-c909-4846-91d9-f84c238a9820</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The product type source. Valid value: polardb-console.</p>
     * 
     * <strong>example:</strong>
     * <p>polardb-console</p>
     */
    @NameInMap("Source")
    public String source;

    public static GetPolarAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPolarAgentRequest self = new GetPolarAgentRequest();
        return TeaModel.build(map, self);
    }

    public GetPolarAgentRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public GetPolarAgentRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetPolarAgentRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetPolarAgentRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
