// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListChatSessionsRequest extends TeaModel {
    /**
     * <p>Set this parameter to V2 to route requests to the ROS Agent V2 backend.</p>
     * 
     * <strong>example:</strong>
     * <p>V2</p>
     */
    @NameInMap("AgentVersion")
    public String agentVersion;

    /**
     * <p>The number of sessions to return per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Filters sessions by mode. Valid values: IaCCodeNormal and IaCCodePipeline.</p>
     * 
     * <strong>example:</strong>
     * <p>IaCCodePipeline</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The pagination token returned in the previous response. Do not pass this parameter for the first page. Do not reuse an old token after switching Mode.</p>
     * 
     * <strong>example:</strong>
     * <p>CAES...</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListChatSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChatSessionsRequest self = new ListChatSessionsRequest();
        return TeaModel.build(map, self);
    }

    public ListChatSessionsRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public ListChatSessionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListChatSessionsRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ListChatSessionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
