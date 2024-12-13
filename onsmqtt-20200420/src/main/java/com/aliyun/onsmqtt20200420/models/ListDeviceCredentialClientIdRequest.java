// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListDeviceCredentialClientIdRequest extends TeaModel {
    /**
     * <p>Group ID of the MQTT version of the micro message queue.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GID_xxx</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the Cloud Message Queue MQTT version instance, which must match the actual instance ID used by the client. You can obtain this ID from the <strong>Instance Details</strong> page in the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mqtt-xxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Token for starting the next page query.</p>
     * 
     * <strong>example:</strong>
     * <p>FFdXXXXXWa</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Indicates the page number of the returned results. The starting page is counted from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The maximum number of query records to display per page. 
     * Value range: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    public static ListDeviceCredentialClientIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceCredentialClientIdRequest self = new ListDeviceCredentialClientIdRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceCredentialClientIdRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListDeviceCredentialClientIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDeviceCredentialClientIdRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDeviceCredentialClientIdRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public ListDeviceCredentialClientIdRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
