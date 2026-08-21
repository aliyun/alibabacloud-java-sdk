// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossagent20260810.models;

import com.aliyun.tea.*;

public class A2aRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>a2a</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <strong>example:</strong>
     * <p>791</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("jsonrpc")
    public String jsonrpc;

    /**
     * <strong>example:</strong>
     * <p>message/stream</p>
     */
    @NameInMap("method")
    public String method;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;message&quot;: {
     *       &quot;role&quot;: &quot;user&quot;,
     *       &quot;parts&quot;: [
     *         {
     *           &quot;kind&quot;: &quot;text&quot;,
     *           &quot;text&quot;: &quot;你好“
     *         }
     *       ]
     *       &quot;kind&quot;: &quot;message&quot;
     *     }
     *   }</p>
     */
    @NameInMap("params")
    public Object params;

    public static A2aRequest build(java.util.Map<String, ?> map) throws Exception {
        A2aRequest self = new A2aRequest();
        return TeaModel.build(map, self);
    }

    public A2aRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public A2aRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public A2aRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public A2aRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public A2aRequest setParams(Object params) {
        this.params = params;
        return this;
    }
    public Object getParams() {
        return this.params;
    }

}
