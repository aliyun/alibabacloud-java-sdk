// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UnbindNlbRequest extends TeaModel {
    /**
     * <p>A short description of struct</p>
     * 
     * <strong>example:</strong>
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of NLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>nlb-7z7jjbzz44d82c9***</p>
     */
    @NameInMap("NlbId")
    public String nlbId;

    /**
     * <p>The listener port of the instance. Valid values: 0 to 65535.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The type of the protocol. Valid values:</p>
     * <ul>
     * <li><strong>TCP</strong>.</li>
     * <li><strong>UDP</strong>.</li>
     * <li><strong>TCPSSL</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    public static UnbindNlbRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindNlbRequest self = new UnbindNlbRequest();
        return TeaModel.build(map, self);
    }

    public UnbindNlbRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UnbindNlbRequest setNlbId(String nlbId) {
        this.nlbId = nlbId;
        return this;
    }
    public String getNlbId() {
        return this.nlbId;
    }

    public UnbindNlbRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public UnbindNlbRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
