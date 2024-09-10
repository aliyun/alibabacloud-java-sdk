// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListRuleTargetAllRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/182997.html">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cfa7e2fb8c221483ba59e098c34c6****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static ListRuleTargetAllRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRuleTargetAllRequest self = new ListRuleTargetAllRequest();
        return TeaModel.build(map, self);
    }

    public ListRuleTargetAllRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
