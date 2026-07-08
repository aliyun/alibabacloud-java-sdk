// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateGroupResponseBody extends TeaModel {
    /**
     * <p>National standard ID associated with the workspace. (Applies only to workspaces using national standard ingest.)</p>
     * 
     * <strong>example:</strong>
     * <p>31000000****00000001</p>
     */
    @NameInMap("GbId")
    public String gbId;

    /**
     * <p>IP address of the national standard signaling gateway server associated with the workspace. (Applies only to workspaces using national standard ingest.)</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.10.10</p>
     */
    @NameInMap("GbIp")
    public String gbIp;

    /**
     * <p>National standard signaling server port provided by the workspace. (Applies only to workspaces using national standard ingest.)</p>
     * 
     * <strong>example:</strong>
     * <p>5060</p>
     */
    @NameInMap("GbPort")
    public Long gbPort;

    /**
     * <p>Workspace ID</p>
     * 
     * <strong>example:</strong>
     * <p>33763****77224964-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupResponseBody self = new CreateGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGroupResponseBody setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public CreateGroupResponseBody setGbIp(String gbIp) {
        this.gbIp = gbIp;
        return this;
    }
    public String getGbIp() {
        return this.gbIp;
    }

    public CreateGroupResponseBody setGbPort(Long gbPort) {
        this.gbPort = gbPort;
        return this;
    }
    public Long getGbPort() {
        return this.gbPort;
    }

    public CreateGroupResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
