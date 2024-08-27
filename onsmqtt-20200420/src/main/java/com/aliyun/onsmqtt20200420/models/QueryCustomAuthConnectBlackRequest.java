// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryCustomAuthConnectBlackRequest extends TeaModel {
    /**
     * <p>The ID of the client to be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>GID_test@@@test</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The ID of the ApsaraMQ for MQTT instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>post-111****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The token that marks the end position of the previous returned page. To obtain the next batch of data, call the operation again by using the value of NextToken returned by the previous request. If you call this operation for the first time or want to query all results, set NextToken to an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>xOfRU60sGEwN1OlFBIL8Ew==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of clients to be queried. Maximum value: 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Size")
    public Integer size;

    public static QueryCustomAuthConnectBlackRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomAuthConnectBlackRequest self = new QueryCustomAuthConnectBlackRequest();
        return TeaModel.build(map, self);
    }

    public QueryCustomAuthConnectBlackRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public QueryCustomAuthConnectBlackRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryCustomAuthConnectBlackRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryCustomAuthConnectBlackRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
